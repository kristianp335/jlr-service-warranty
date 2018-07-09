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

package com.liferay.kris.jlr.warranty.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.kris.jlr.warranty.model.Warranty;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the warranty service. This utility wraps {@link com.liferay.kris.jlr.warranty.service.persistence.impl.WarrantyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyPersistence
 * @see com.liferay.kris.jlr.warranty.service.persistence.impl.WarrantyPersistenceImpl
 * @generated
 */
@ProviderType
public class WarrantyUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Warranty warranty) {
		getPersistence().clearCache(warranty);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Warranty> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Warranty> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Warranty> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Warranty> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Warranty update(Warranty warranty) {
		return getPersistence().update(warranty);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Warranty update(Warranty warranty,
		ServiceContext serviceContext) {
		return getPersistence().update(warranty, serviceContext);
	}

	/**
	* Returns all the warranties where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching warranties
	*/
	public static List<Warranty> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the warranties where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @return the range of matching warranties
	*/
	public static List<Warranty> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the warranties where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching warranties
	*/
	public static List<Warranty> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Warranty> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the warranties where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching warranties
	*/
	public static List<Warranty> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Warranty> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first warranty in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public static Warranty findByUuid_First(java.lang.String uuid,
		OrderByComparator<Warranty> orderByComparator)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first warranty in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public static Warranty fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Warranty> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last warranty in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public static Warranty findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Warranty> orderByComparator)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last warranty in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public static Warranty fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Warranty> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the warranties before and after the current warranty in the ordered set where uuid = &#63;.
	*
	* @param jlrWarrantyId the primary key of the current warranty
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next warranty
	* @throws NoSuchWarrantyException if a warranty with the primary key could not be found
	*/
	public static Warranty[] findByUuid_PrevAndNext(long jlrWarrantyId,
		java.lang.String uuid, OrderByComparator<Warranty> orderByComparator)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence()
				   .findByUuid_PrevAndNext(jlrWarrantyId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the warranties where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of warranties where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching warranties
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the warranty where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchWarrantyException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public static Warranty findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the warranty where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public static Warranty fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the warranty where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public static Warranty fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the warranty where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the warranty that was removed
	*/
	public static Warranty removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of warranties where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching warranties
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the warranties where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching warranties
	*/
	public static List<Warranty> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the warranties where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @return the range of matching warranties
	*/
	public static List<Warranty> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the warranties where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching warranties
	*/
	public static List<Warranty> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Warranty> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the warranties where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching warranties
	*/
	public static List<Warranty> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Warranty> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first warranty in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public static Warranty findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Warranty> orderByComparator)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first warranty in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public static Warranty fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Warranty> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last warranty in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public static Warranty findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Warranty> orderByComparator)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last warranty in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public static Warranty fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Warranty> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the warranties before and after the current warranty in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param jlrWarrantyId the primary key of the current warranty
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next warranty
	* @throws NoSuchWarrantyException if a warranty with the primary key could not be found
	*/
	public static Warranty[] findByUuid_C_PrevAndNext(long jlrWarrantyId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Warranty> orderByComparator)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(jlrWarrantyId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the warranties where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of warranties where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching warranties
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the warranties where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @return the matching warranties
	*/
	public static List<Warranty> findByUserId(long userId, Date createDate) {
		return getPersistence().findByUserId(userId, createDate);
	}

	/**
	* Returns a range of all the warranties where userId = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @return the range of matching warranties
	*/
	public static List<Warranty> findByUserId(long userId, Date createDate,
		int start, int end) {
		return getPersistence().findByUserId(userId, createDate, start, end);
	}

	/**
	* Returns an ordered range of all the warranties where userId = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching warranties
	*/
	public static List<Warranty> findByUserId(long userId, Date createDate,
		int start, int end, OrderByComparator<Warranty> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, createDate, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the warranties where userId = &#63; and createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching warranties
	*/
	public static List<Warranty> findByUserId(long userId, Date createDate,
		int start, int end, OrderByComparator<Warranty> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, createDate, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first warranty in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public static Warranty findByUserId_First(long userId, Date createDate,
		OrderByComparator<Warranty> orderByComparator)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence()
				   .findByUserId_First(userId, createDate, orderByComparator);
	}

	/**
	* Returns the first warranty in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public static Warranty fetchByUserId_First(long userId, Date createDate,
		OrderByComparator<Warranty> orderByComparator) {
		return getPersistence()
				   .fetchByUserId_First(userId, createDate, orderByComparator);
	}

	/**
	* Returns the last warranty in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public static Warranty findByUserId_Last(long userId, Date createDate,
		OrderByComparator<Warranty> orderByComparator)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence()
				   .findByUserId_Last(userId, createDate, orderByComparator);
	}

	/**
	* Returns the last warranty in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public static Warranty fetchByUserId_Last(long userId, Date createDate,
		OrderByComparator<Warranty> orderByComparator) {
		return getPersistence()
				   .fetchByUserId_Last(userId, createDate, orderByComparator);
	}

	/**
	* Returns the warranties before and after the current warranty in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param jlrWarrantyId the primary key of the current warranty
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next warranty
	* @throws NoSuchWarrantyException if a warranty with the primary key could not be found
	*/
	public static Warranty[] findByUserId_PrevAndNext(long jlrWarrantyId,
		long userId, Date createDate,
		OrderByComparator<Warranty> orderByComparator)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence()
				   .findByUserId_PrevAndNext(jlrWarrantyId, userId, createDate,
			orderByComparator);
	}

	/**
	* Removes all the warranties where userId = &#63; and createDate = &#63; from the database.
	*
	* @param userId the user ID
	* @param createDate the create date
	*/
	public static void removeByUserId(long userId, Date createDate) {
		getPersistence().removeByUserId(userId, createDate);
	}

	/**
	* Returns the number of warranties where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @return the number of matching warranties
	*/
	public static int countByUserId(long userId, Date createDate) {
		return getPersistence().countByUserId(userId, createDate);
	}

	/**
	* Caches the warranty in the entity cache if it is enabled.
	*
	* @param warranty the warranty
	*/
	public static void cacheResult(Warranty warranty) {
		getPersistence().cacheResult(warranty);
	}

	/**
	* Caches the warranties in the entity cache if it is enabled.
	*
	* @param warranties the warranties
	*/
	public static void cacheResult(List<Warranty> warranties) {
		getPersistence().cacheResult(warranties);
	}

	/**
	* Creates a new warranty with the primary key. Does not add the warranty to the database.
	*
	* @param jlrWarrantyId the primary key for the new warranty
	* @return the new warranty
	*/
	public static Warranty create(long jlrWarrantyId) {
		return getPersistence().create(jlrWarrantyId);
	}

	/**
	* Removes the warranty with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jlrWarrantyId the primary key of the warranty
	* @return the warranty that was removed
	* @throws NoSuchWarrantyException if a warranty with the primary key could not be found
	*/
	public static Warranty remove(long jlrWarrantyId)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence().remove(jlrWarrantyId);
	}

	public static Warranty updateImpl(Warranty warranty) {
		return getPersistence().updateImpl(warranty);
	}

	/**
	* Returns the warranty with the primary key or throws a {@link NoSuchWarrantyException} if it could not be found.
	*
	* @param jlrWarrantyId the primary key of the warranty
	* @return the warranty
	* @throws NoSuchWarrantyException if a warranty with the primary key could not be found
	*/
	public static Warranty findByPrimaryKey(long jlrWarrantyId)
		throws com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException {
		return getPersistence().findByPrimaryKey(jlrWarrantyId);
	}

	/**
	* Returns the warranty with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jlrWarrantyId the primary key of the warranty
	* @return the warranty, or <code>null</code> if a warranty with the primary key could not be found
	*/
	public static Warranty fetchByPrimaryKey(long jlrWarrantyId) {
		return getPersistence().fetchByPrimaryKey(jlrWarrantyId);
	}

	public static java.util.Map<java.io.Serializable, Warranty> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the warranties.
	*
	* @return the warranties
	*/
	public static List<Warranty> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the warranties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @return the range of warranties
	*/
	public static List<Warranty> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the warranties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of warranties
	*/
	public static List<Warranty> findAll(int start, int end,
		OrderByComparator<Warranty> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the warranties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link WarrantyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of warranties
	* @param end the upper bound of the range of warranties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of warranties
	*/
	public static List<Warranty> findAll(int start, int end,
		OrderByComparator<Warranty> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the warranties from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of warranties.
	*
	* @return the number of warranties
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static WarrantyPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<WarrantyPersistence, WarrantyPersistence> _serviceTracker =
		ServiceTrackerFactory.open(WarrantyPersistence.class);
}