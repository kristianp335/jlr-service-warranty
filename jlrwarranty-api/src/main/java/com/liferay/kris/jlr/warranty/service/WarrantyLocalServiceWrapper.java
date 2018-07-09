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
 * Provides a wrapper for {@link WarrantyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyLocalService
 * @generated
 */
@ProviderType
public class WarrantyLocalServiceWrapper implements WarrantyLocalService,
	ServiceWrapper<WarrantyLocalService> {
	public WarrantyLocalServiceWrapper(
		WarrantyLocalService warrantyLocalService) {
		_warrantyLocalService = warrantyLocalService;
	}

	/**
	* Adds the warranty to the database. Also notifies the appropriate model listeners.
	*
	* @param warranty the warranty
	* @return the warranty that was added
	*/
	@Override
	public com.liferay.kris.jlr.warranty.model.Warranty addWarranty(
		com.liferay.kris.jlr.warranty.model.Warranty warranty) {
		return _warrantyLocalService.addWarranty(warranty);
	}

	/**
	* Creates a new warranty with the primary key. Does not add the warranty to the database.
	*
	* @param jlrWarrantyId the primary key for the new warranty
	* @return the new warranty
	*/
	@Override
	public com.liferay.kris.jlr.warranty.model.Warranty createWarranty(
		long jlrWarrantyId) {
		return _warrantyLocalService.createWarranty(jlrWarrantyId);
	}

	/**
	* Deletes the warranty from the database. Also notifies the appropriate model listeners.
	*
	* @param warranty the warranty
	* @return the warranty that was removed
	*/
	@Override
	public com.liferay.kris.jlr.warranty.model.Warranty deleteWarranty(
		com.liferay.kris.jlr.warranty.model.Warranty warranty) {
		return _warrantyLocalService.deleteWarranty(warranty);
	}

	/**
	* Deletes the warranty with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jlrWarrantyId the primary key of the warranty
	* @return the warranty that was removed
	* @throws PortalException if a warranty with the primary key could not be found
	*/
	@Override
	public com.liferay.kris.jlr.warranty.model.Warranty deleteWarranty(
		long jlrWarrantyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _warrantyLocalService.deleteWarranty(jlrWarrantyId);
	}

	@Override
	public com.liferay.kris.jlr.warranty.model.Warranty fetchWarranty(
		long jlrWarrantyId) {
		return _warrantyLocalService.fetchWarranty(jlrWarrantyId);
	}

	/**
	* Returns the warranty matching the UUID and group.
	*
	* @param uuid the warranty's UUID
	* @param groupId the primary key of the group
	* @return the matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	@Override
	public com.liferay.kris.jlr.warranty.model.Warranty fetchWarrantyByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _warrantyLocalService.fetchWarrantyByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the warranty with the primary key.
	*
	* @param jlrWarrantyId the primary key of the warranty
	* @return the warranty
	* @throws PortalException if a warranty with the primary key could not be found
	*/
	@Override
	public com.liferay.kris.jlr.warranty.model.Warranty getWarranty(
		long jlrWarrantyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _warrantyLocalService.getWarranty(jlrWarrantyId);
	}

	/**
	* Returns the warranty matching the UUID and group.
	*
	* @param uuid the warranty's UUID
	* @param groupId the primary key of the group
	* @return the matching warranty
	* @throws PortalException if a matching warranty could not be found
	*/
	@Override
	public com.liferay.kris.jlr.warranty.model.Warranty getWarrantyByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _warrantyLocalService.getWarrantyByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the warranty in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param warranty the warranty
	* @return the warranty that was updated
	*/
	@Override
	public com.liferay.kris.jlr.warranty.model.Warranty updateWarranty(
		com.liferay.kris.jlr.warranty.model.Warranty warranty) {
		return _warrantyLocalService.updateWarranty(warranty);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _warrantyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _warrantyLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _warrantyLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _warrantyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _warrantyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _warrantyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of warranties.
	*
	* @return the number of warranties
	*/
	@Override
	public int getWarrantiesCount() {
		return _warrantyLocalService.getWarrantiesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _warrantyLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _warrantyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.kris.jlr.warranty.model.impl.WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _warrantyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.kris.jlr.warranty.model.impl.WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _warrantyLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the warranties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.kris.jlr.warranty.model.impl.WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @return the range of warranties
	*/
	@Override
	public java.util.List<com.liferay.kris.jlr.warranty.model.Warranty> getWarranties(
		int start, int end) {
		return _warrantyLocalService.getWarranties(start, end);
	}

	/**
	* Returns all the warranties matching the UUID and company.
	*
	* @param uuid the UUID of the warranties
	* @param companyId the primary key of the company
	* @return the matching warranties, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.kris.jlr.warranty.model.Warranty> getWarrantiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _warrantyLocalService.getWarrantiesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of warranties matching the UUID and company.
	*
	* @param uuid the UUID of the warranties
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching warranties, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.kris.jlr.warranty.model.Warranty> getWarrantiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.kris.jlr.warranty.model.Warranty> orderByComparator) {
		return _warrantyLocalService.getWarrantiesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _warrantyLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _warrantyLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public WarrantyLocalService getWrappedService() {
		return _warrantyLocalService;
	}

	@Override
	public void setWrappedService(WarrantyLocalService warrantyLocalService) {
		_warrantyLocalService = warrantyLocalService;
	}

	private WarrantyLocalService _warrantyLocalService;
}