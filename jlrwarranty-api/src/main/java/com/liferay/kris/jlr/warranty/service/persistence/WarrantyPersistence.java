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

import com.liferay.kris.jlr.warranty.exception.NoSuchWarrantyException;
import com.liferay.kris.jlr.warranty.model.Warranty;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Date;

/**
 * The persistence interface for the warranty service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.kris.jlr.warranty.service.persistence.impl.WarrantyPersistenceImpl
 * @see WarrantyUtil
 * @generated
 */
@ProviderType
public interface WarrantyPersistence extends BasePersistence<Warranty> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WarrantyUtil} to access the warranty persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the warranties where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching warranties
	*/
	public java.util.List<Warranty> findByUuid(java.lang.String uuid);

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
	public java.util.List<Warranty> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<Warranty> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator);

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
	public java.util.List<Warranty> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first warranty in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public Warranty findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator)
		throws NoSuchWarrantyException;

	/**
	* Returns the first warranty in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public Warranty fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator);

	/**
	* Returns the last warranty in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public Warranty findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator)
		throws NoSuchWarrantyException;

	/**
	* Returns the last warranty in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public Warranty fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator);

	/**
	* Returns the warranties before and after the current warranty in the ordered set where uuid = &#63;.
	*
	* @param jlrWarrantyId the primary key of the current warranty
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next warranty
	* @throws NoSuchWarrantyException if a warranty with the primary key could not be found
	*/
	public Warranty[] findByUuid_PrevAndNext(long jlrWarrantyId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator)
		throws NoSuchWarrantyException;

	/**
	* Removes all the warranties where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of warranties where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching warranties
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the warranty where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchWarrantyException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public Warranty findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchWarrantyException;

	/**
	* Returns the warranty where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public Warranty fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the warranty where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public Warranty fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the warranty where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the warranty that was removed
	*/
	public Warranty removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchWarrantyException;

	/**
	* Returns the number of warranties where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching warranties
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the warranties where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching warranties
	*/
	public java.util.List<Warranty> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Warranty> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Warranty> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator);

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
	public java.util.List<Warranty> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first warranty in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public Warranty findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator)
		throws NoSuchWarrantyException;

	/**
	* Returns the first warranty in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public Warranty fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator);

	/**
	* Returns the last warranty in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public Warranty findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator)
		throws NoSuchWarrantyException;

	/**
	* Returns the last warranty in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public Warranty fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator);

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
	public Warranty[] findByUuid_C_PrevAndNext(long jlrWarrantyId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator)
		throws NoSuchWarrantyException;

	/**
	* Removes all the warranties where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of warranties where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching warranties
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the warranties where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @return the matching warranties
	*/
	public java.util.List<Warranty> findByUserId(long userId, Date createDate);

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
	public java.util.List<Warranty> findByUserId(long userId, Date createDate,
		int start, int end);

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
	public java.util.List<Warranty> findByUserId(long userId, Date createDate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator);

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
	public java.util.List<Warranty> findByUserId(long userId, Date createDate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first warranty in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public Warranty findByUserId_First(long userId, Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator)
		throws NoSuchWarrantyException;

	/**
	* Returns the first warranty in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public Warranty fetchByUserId_First(long userId, Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator);

	/**
	* Returns the last warranty in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty
	* @throws NoSuchWarrantyException if a matching warranty could not be found
	*/
	public Warranty findByUserId_Last(long userId, Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator)
		throws NoSuchWarrantyException;

	/**
	* Returns the last warranty in the ordered set where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching warranty, or <code>null</code> if a matching warranty could not be found
	*/
	public Warranty fetchByUserId_Last(long userId, Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator);

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
	public Warranty[] findByUserId_PrevAndNext(long jlrWarrantyId, long userId,
		Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator)
		throws NoSuchWarrantyException;

	/**
	* Removes all the warranties where userId = &#63; and createDate = &#63; from the database.
	*
	* @param userId the user ID
	* @param createDate the create date
	*/
	public void removeByUserId(long userId, Date createDate);

	/**
	* Returns the number of warranties where userId = &#63; and createDate = &#63;.
	*
	* @param userId the user ID
	* @param createDate the create date
	* @return the number of matching warranties
	*/
	public int countByUserId(long userId, Date createDate);

	/**
	* Caches the warranty in the entity cache if it is enabled.
	*
	* @param warranty the warranty
	*/
	public void cacheResult(Warranty warranty);

	/**
	* Caches the warranties in the entity cache if it is enabled.
	*
	* @param warranties the warranties
	*/
	public void cacheResult(java.util.List<Warranty> warranties);

	/**
	* Creates a new warranty with the primary key. Does not add the warranty to the database.
	*
	* @param jlrWarrantyId the primary key for the new warranty
	* @return the new warranty
	*/
	public Warranty create(long jlrWarrantyId);

	/**
	* Removes the warranty with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jlrWarrantyId the primary key of the warranty
	* @return the warranty that was removed
	* @throws NoSuchWarrantyException if a warranty with the primary key could not be found
	*/
	public Warranty remove(long jlrWarrantyId) throws NoSuchWarrantyException;

	public Warranty updateImpl(Warranty warranty);

	/**
	* Returns the warranty with the primary key or throws a {@link NoSuchWarrantyException} if it could not be found.
	*
	* @param jlrWarrantyId the primary key of the warranty
	* @return the warranty
	* @throws NoSuchWarrantyException if a warranty with the primary key could not be found
	*/
	public Warranty findByPrimaryKey(long jlrWarrantyId)
		throws NoSuchWarrantyException;

	/**
	* Returns the warranty with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jlrWarrantyId the primary key of the warranty
	* @return the warranty, or <code>null</code> if a warranty with the primary key could not be found
	*/
	public Warranty fetchByPrimaryKey(long jlrWarrantyId);

	@Override
	public java.util.Map<java.io.Serializable, Warranty> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the warranties.
	*
	* @return the warranties
	*/
	public java.util.List<Warranty> findAll();

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
	public java.util.List<Warranty> findAll(int start, int end);

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
	public java.util.List<Warranty> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator);

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
	public java.util.List<Warranty> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Warranty> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the warranties from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of warranties.
	*
	* @return the number of warranties
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}