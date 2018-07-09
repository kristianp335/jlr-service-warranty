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

package com.liferay.kris.jlr.warranty.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Warranty. This utility wraps
 * {@link com.liferay.kris.jlr.warranty.service.impl.WarrantyServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyService
 * @see com.liferay.kris.jlr.warranty.service.base.WarrantyServiceBaseImpl
 * @see com.liferay.kris.jlr.warranty.service.impl.WarrantyServiceImpl
 * @generated
 */
@ProviderType
public class WarrantyServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.kris.jlr.warranty.service.impl.WarrantyServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static java.lang.String addWarranty(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String category, java.lang.String period,
		java.lang.String dealer, java.lang.String partCategory, int actualCost,
		java.lang.String conCode, int percentage) {
		return getService()
				   .addWarranty(serviceContext, category, period, dealer,
			partCategory, actualCost, conCode, percentage);
	}

	public static java.lang.String deleteWarranty(long jlrWarrantyId) {
		return getService().deleteWarranty(jlrWarrantyId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.kris.jlr.warranty.model.Warranty> getWarranty(
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService().getWarranty(serviceContext);
	}

	public static WarrantyService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<WarrantyService, WarrantyService> _serviceTracker =
		ServiceTrackerFactory.open(WarrantyService.class);
}