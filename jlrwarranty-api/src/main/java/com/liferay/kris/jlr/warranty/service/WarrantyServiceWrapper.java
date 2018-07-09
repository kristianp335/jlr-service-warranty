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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WarrantyService}.
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyService
 * @generated
 */
@ProviderType
public class WarrantyServiceWrapper implements WarrantyService,
	ServiceWrapper<WarrantyService> {
	public WarrantyServiceWrapper(WarrantyService warrantyService) {
		_warrantyService = warrantyService;
	}

	@Override
	public java.lang.String addWarranty(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.lang.String category, java.lang.String period,
		java.lang.String dealer, java.lang.String partCategory, int actualCost,
		java.lang.String conCode, int percentage) {
		return _warrantyService.addWarranty(serviceContext, category, period,
			dealer, partCategory, actualCost, conCode, percentage);
	}

	@Override
	public java.lang.String deleteWarranty(long jlrWarrantyId) {
		return _warrantyService.deleteWarranty(jlrWarrantyId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _warrantyService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.kris.jlr.warranty.model.Warranty> getWarranty(
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _warrantyService.getWarranty(serviceContext);
	}

	@Override
	public WarrantyService getWrappedService() {
		return _warrantyService;
	}

	@Override
	public void setWrappedService(WarrantyService warrantyService) {
		_warrantyService = warrantyService;
	}

	private WarrantyService _warrantyService;
}