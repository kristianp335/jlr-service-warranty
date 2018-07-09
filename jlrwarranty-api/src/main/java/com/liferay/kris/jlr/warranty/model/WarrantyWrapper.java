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

package com.liferay.kris.jlr.warranty.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Warranty}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Warranty
 * @generated
 */
@ProviderType
public class WarrantyWrapper implements Warranty, ModelWrapper<Warranty> {
	public WarrantyWrapper(Warranty warranty) {
		_warranty = warranty;
	}

	@Override
	public Class<?> getModelClass() {
		return Warranty.class;
	}

	@Override
	public String getModelClassName() {
		return Warranty.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jlrWarrantyId", getJlrWarrantyId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("category", getCategory());
		attributes.put("period", getPeriod());
		attributes.put("dealer", getDealer());
		attributes.put("partCategory", getPartCategory());
		attributes.put("actualCost", getActualCost());
		attributes.put("conCode", getConCode());
		attributes.put("percentage", getPercentage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long jlrWarrantyId = (Long)attributes.get("jlrWarrantyId");

		if (jlrWarrantyId != null) {
			setJlrWarrantyId(jlrWarrantyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String period = (String)attributes.get("period");

		if (period != null) {
			setPeriod(period);
		}

		String dealer = (String)attributes.get("dealer");

		if (dealer != null) {
			setDealer(dealer);
		}

		String partCategory = (String)attributes.get("partCategory");

		if (partCategory != null) {
			setPartCategory(partCategory);
		}

		Integer actualCost = (Integer)attributes.get("actualCost");

		if (actualCost != null) {
			setActualCost(actualCost);
		}

		String conCode = (String)attributes.get("conCode");

		if (conCode != null) {
			setConCode(conCode);
		}

		Integer percentage = (Integer)attributes.get("percentage");

		if (percentage != null) {
			setPercentage(percentage);
		}
	}

	@Override
	public Warranty toEscapedModel() {
		return new WarrantyWrapper(_warranty.toEscapedModel());
	}

	@Override
	public Warranty toUnescapedModel() {
		return new WarrantyWrapper(_warranty.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _warranty.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _warranty.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _warranty.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _warranty.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Warranty> toCacheModel() {
		return _warranty.toCacheModel();
	}

	@Override
	public int compareTo(Warranty warranty) {
		return _warranty.compareTo(warranty);
	}

	/**
	* Returns the actual cost of this warranty.
	*
	* @return the actual cost of this warranty
	*/
	@Override
	public int getActualCost() {
		return _warranty.getActualCost();
	}

	/**
	* Returns the percentage of this warranty.
	*
	* @return the percentage of this warranty
	*/
	@Override
	public int getPercentage() {
		return _warranty.getPercentage();
	}

	@Override
	public int hashCode() {
		return _warranty.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _warranty.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new WarrantyWrapper((Warranty)_warranty.clone());
	}

	/**
	* Returns the category of this warranty.
	*
	* @return the category of this warranty
	*/
	@Override
	public java.lang.String getCategory() {
		return _warranty.getCategory();
	}

	/**
	* Returns the con code of this warranty.
	*
	* @return the con code of this warranty
	*/
	@Override
	public java.lang.String getConCode() {
		return _warranty.getConCode();
	}

	/**
	* Returns the dealer of this warranty.
	*
	* @return the dealer of this warranty
	*/
	@Override
	public java.lang.String getDealer() {
		return _warranty.getDealer();
	}

	/**
	* Returns the part category of this warranty.
	*
	* @return the part category of this warranty
	*/
	@Override
	public java.lang.String getPartCategory() {
		return _warranty.getPartCategory();
	}

	/**
	* Returns the period of this warranty.
	*
	* @return the period of this warranty
	*/
	@Override
	public java.lang.String getPeriod() {
		return _warranty.getPeriod();
	}

	/**
	* Returns the user name of this warranty.
	*
	* @return the user name of this warranty
	*/
	@Override
	public java.lang.String getUserName() {
		return _warranty.getUserName();
	}

	/**
	* Returns the user uuid of this warranty.
	*
	* @return the user uuid of this warranty
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _warranty.getUserUuid();
	}

	/**
	* Returns the uuid of this warranty.
	*
	* @return the uuid of this warranty
	*/
	@Override
	public java.lang.String getUuid() {
		return _warranty.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _warranty.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _warranty.toXmlString();
	}

	/**
	* Returns the create date of this warranty.
	*
	* @return the create date of this warranty
	*/
	@Override
	public Date getCreateDate() {
		return _warranty.getCreateDate();
	}

	/**
	* Returns the modified date of this warranty.
	*
	* @return the modified date of this warranty
	*/
	@Override
	public Date getModifiedDate() {
		return _warranty.getModifiedDate();
	}

	/**
	* Returns the company ID of this warranty.
	*
	* @return the company ID of this warranty
	*/
	@Override
	public long getCompanyId() {
		return _warranty.getCompanyId();
	}

	/**
	* Returns the group ID of this warranty.
	*
	* @return the group ID of this warranty
	*/
	@Override
	public long getGroupId() {
		return _warranty.getGroupId();
	}

	/**
	* Returns the jlr warranty ID of this warranty.
	*
	* @return the jlr warranty ID of this warranty
	*/
	@Override
	public long getJlrWarrantyId() {
		return _warranty.getJlrWarrantyId();
	}

	/**
	* Returns the primary key of this warranty.
	*
	* @return the primary key of this warranty
	*/
	@Override
	public long getPrimaryKey() {
		return _warranty.getPrimaryKey();
	}

	/**
	* Returns the user ID of this warranty.
	*
	* @return the user ID of this warranty
	*/
	@Override
	public long getUserId() {
		return _warranty.getUserId();
	}

	@Override
	public void persist() {
		_warranty.persist();
	}

	/**
	* Sets the actual cost of this warranty.
	*
	* @param actualCost the actual cost of this warranty
	*/
	@Override
	public void setActualCost(int actualCost) {
		_warranty.setActualCost(actualCost);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_warranty.setCachedModel(cachedModel);
	}

	/**
	* Sets the category of this warranty.
	*
	* @param category the category of this warranty
	*/
	@Override
	public void setCategory(java.lang.String category) {
		_warranty.setCategory(category);
	}

	/**
	* Sets the company ID of this warranty.
	*
	* @param companyId the company ID of this warranty
	*/
	@Override
	public void setCompanyId(long companyId) {
		_warranty.setCompanyId(companyId);
	}

	/**
	* Sets the con code of this warranty.
	*
	* @param conCode the con code of this warranty
	*/
	@Override
	public void setConCode(java.lang.String conCode) {
		_warranty.setConCode(conCode);
	}

	/**
	* Sets the create date of this warranty.
	*
	* @param createDate the create date of this warranty
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_warranty.setCreateDate(createDate);
	}

	/**
	* Sets the dealer of this warranty.
	*
	* @param dealer the dealer of this warranty
	*/
	@Override
	public void setDealer(java.lang.String dealer) {
		_warranty.setDealer(dealer);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_warranty.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_warranty.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_warranty.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this warranty.
	*
	* @param groupId the group ID of this warranty
	*/
	@Override
	public void setGroupId(long groupId) {
		_warranty.setGroupId(groupId);
	}

	/**
	* Sets the jlr warranty ID of this warranty.
	*
	* @param jlrWarrantyId the jlr warranty ID of this warranty
	*/
	@Override
	public void setJlrWarrantyId(long jlrWarrantyId) {
		_warranty.setJlrWarrantyId(jlrWarrantyId);
	}

	/**
	* Sets the modified date of this warranty.
	*
	* @param modifiedDate the modified date of this warranty
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_warranty.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_warranty.setNew(n);
	}

	/**
	* Sets the part category of this warranty.
	*
	* @param partCategory the part category of this warranty
	*/
	@Override
	public void setPartCategory(java.lang.String partCategory) {
		_warranty.setPartCategory(partCategory);
	}

	/**
	* Sets the percentage of this warranty.
	*
	* @param percentage the percentage of this warranty
	*/
	@Override
	public void setPercentage(int percentage) {
		_warranty.setPercentage(percentage);
	}

	/**
	* Sets the period of this warranty.
	*
	* @param period the period of this warranty
	*/
	@Override
	public void setPeriod(java.lang.String period) {
		_warranty.setPeriod(period);
	}

	/**
	* Sets the primary key of this warranty.
	*
	* @param primaryKey the primary key of this warranty
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_warranty.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_warranty.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this warranty.
	*
	* @param userId the user ID of this warranty
	*/
	@Override
	public void setUserId(long userId) {
		_warranty.setUserId(userId);
	}

	/**
	* Sets the user name of this warranty.
	*
	* @param userName the user name of this warranty
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_warranty.setUserName(userName);
	}

	/**
	* Sets the user uuid of this warranty.
	*
	* @param userUuid the user uuid of this warranty
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_warranty.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this warranty.
	*
	* @param uuid the uuid of this warranty
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_warranty.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WarrantyWrapper)) {
			return false;
		}

		WarrantyWrapper warrantyWrapper = (WarrantyWrapper)obj;

		if (Objects.equals(_warranty, warrantyWrapper._warranty)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _warranty.getStagedModelType();
	}

	@Override
	public Warranty getWrappedModel() {
		return _warranty;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _warranty.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _warranty.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_warranty.resetOriginalValues();
	}

	private final Warranty _warranty;
}