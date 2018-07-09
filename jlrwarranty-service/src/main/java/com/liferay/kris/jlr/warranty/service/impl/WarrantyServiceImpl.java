/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.kris.jlr.warranty.service.impl;
import aQute.bnd.annotation.ProviderType;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.kris.jlr.warranty.model.Warranty;
import com.liferay.kris.jlr.warranty.service.base.WarrantyServiceBaseImpl;
import com.liferay.kris.jlr.warranty.service.persistence.WarrantyPersistence;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

/**
 * The implementation of the warranty remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.kris.jlr.warranty.service.WarrantyService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyServiceBaseImpl
 * @see com.liferay.kris.jlr.warranty.service.WarrantyServiceUtil
 */
@ProviderType
public class WarrantyServiceImpl extends WarrantyServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.kris.jlr.warranty.service.WarrantyServiceUtil} to access the warranty remote service.
	 */
	
	public List<Warranty> getWarranty(ServiceContext serviceContext) {
		long userId = serviceContext.getUserId();
		DynamicQuery dynamicQuery = super.getWarrantyLocalService().dynamicQuery();		
		dynamicQuery.add(RestrictionsFactoryUtil.eq("userId", userId));
		int endValue = 100;
		int startValue = 0;
		List<Warranty> warrantyData = super.getWarrantyLocalService().dynamicQuery(dynamicQuery, startValue, endValue);
		return warrantyData;
	}
	
	public String deleteWarranty(long jlrWarrantyId) {
		try {
			super.getWarrantyLocalService().deleteWarranty(jlrWarrantyId);
			return "success";
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failed";
		}
		
	}
	
	@Override
	public String addWarranty(ServiceContext serviceContext,  String category, String period, String dealer, String partCategory, int actualCost, String conCode, int percentage) {
		String derivedUserName = "";
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long userId = serviceContext.getUserId();
		User user;
		try {
			user = UserLocalServiceUtil.getUser(userId);
			derivedUserName = user.getFirstName() + " " + user.getLastName();
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Date today = new Date();	
		
		//build the query ApiAiData object
		Warranty warranty = super.warrantyLocalService.createWarranty(CounterLocalServiceUtil.increment(Warranty.class.getName()));
		warranty.setGroupId(groupId);
		warranty.setCompanyId(companyId);
		warranty.setUserId(userId);
		warranty.setCreateDate(today);
		warranty.setModifiedDate(today);
		warranty.setUserName(derivedUserName);
		warranty.setCategory(category);
		warranty.setPeriod(period);
		warranty.setDealer(dealer);
		warranty.setPartCategory(partCategory);
		warranty.setActualCost(actualCost);
		warranty.setConCode(conCode);
		warranty.setPercentage(percentage);
		
			
		super.getWarrantyLocalService().addWarranty(warranty);
		
			
			
		return "success";			
		
	}
	
	
}