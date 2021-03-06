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

package com.liferay.kris.jlr.warranty.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.kris.jlr.warranty.model.Warranty;
import com.liferay.kris.jlr.warranty.model.WarrantyModel;
import com.liferay.kris.jlr.warranty.model.WarrantySoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Warranty service. Represents a row in the &quot;JLR_Warranty&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link WarrantyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WarrantyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WarrantyImpl
 * @see Warranty
 * @see WarrantyModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class WarrantyModelImpl extends BaseModelImpl<Warranty>
	implements WarrantyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a warranty model instance should use the {@link Warranty} interface instead.
	 */
	public static final String TABLE_NAME = "JLR_Warranty";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "jlrWarrantyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "category", Types.VARCHAR },
			{ "period", Types.VARCHAR },
			{ "dealer", Types.VARCHAR },
			{ "partCategory", Types.VARCHAR },
			{ "actualCost", Types.INTEGER },
			{ "conCode", Types.VARCHAR },
			{ "percentage", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("jlrWarrantyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("category", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("period", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dealer", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("partCategory", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("actualCost", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("conCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("percentage", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table JLR_Warranty (uuid_ VARCHAR(75) null,jlrWarrantyId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,category VARCHAR(75) null,period VARCHAR(75) null,dealer VARCHAR(75) null,partCategory VARCHAR(75) null,actualCost INTEGER,conCode VARCHAR(75) null,percentage INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table JLR_Warranty";
	public static final String ORDER_BY_JPQL = " ORDER BY warranty.jlrWarrantyId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY JLR_Warranty.jlrWarrantyId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.kris.jlr.warranty.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.kris.jlr.warranty.model.Warranty"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.kris.jlr.warranty.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.kris.jlr.warranty.model.Warranty"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.kris.jlr.warranty.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.kris.jlr.warranty.model.Warranty"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long CREATEDATE_COLUMN_BITMASK = 2L;
	public static final long GROUPID_COLUMN_BITMASK = 4L;
	public static final long USERID_COLUMN_BITMASK = 8L;
	public static final long UUID_COLUMN_BITMASK = 16L;
	public static final long JLRWARRANTYID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Warranty toModel(WarrantySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Warranty model = new WarrantyImpl();

		model.setUuid(soapModel.getUuid());
		model.setJlrWarrantyId(soapModel.getJlrWarrantyId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCategory(soapModel.getCategory());
		model.setPeriod(soapModel.getPeriod());
		model.setDealer(soapModel.getDealer());
		model.setPartCategory(soapModel.getPartCategory());
		model.setActualCost(soapModel.getActualCost());
		model.setConCode(soapModel.getConCode());
		model.setPercentage(soapModel.getPercentage());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Warranty> toModels(WarrantySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Warranty> models = new ArrayList<Warranty>(soapModels.length);

		for (WarrantySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.kris.jlr.warranty.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.kris.jlr.warranty.model.Warranty"));

	public WarrantyModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _jlrWarrantyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJlrWarrantyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jlrWarrantyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getJlrWarrantyId() {
		return _jlrWarrantyId;
	}

	@Override
	public void setJlrWarrantyId(long jlrWarrantyId) {
		_columnBitmask = -1L;

		_jlrWarrantyId = jlrWarrantyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask |= CREATEDATE_COLUMN_BITMASK;

		if (_originalCreateDate == null) {
			_originalCreateDate = _createDate;
		}

		_createDate = createDate;
	}

	public Date getOriginalCreateDate() {
		return _originalCreateDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getCategory() {
		if (_category == null) {
			return StringPool.BLANK;
		}
		else {
			return _category;
		}
	}

	@Override
	public void setCategory(String category) {
		_category = category;
	}

	@JSON
	@Override
	public String getPeriod() {
		if (_period == null) {
			return StringPool.BLANK;
		}
		else {
			return _period;
		}
	}

	@Override
	public void setPeriod(String period) {
		_period = period;
	}

	@JSON
	@Override
	public String getDealer() {
		if (_dealer == null) {
			return StringPool.BLANK;
		}
		else {
			return _dealer;
		}
	}

	@Override
	public void setDealer(String dealer) {
		_dealer = dealer;
	}

	@JSON
	@Override
	public String getPartCategory() {
		if (_partCategory == null) {
			return StringPool.BLANK;
		}
		else {
			return _partCategory;
		}
	}

	@Override
	public void setPartCategory(String partCategory) {
		_partCategory = partCategory;
	}

	@JSON
	@Override
	public int getActualCost() {
		return _actualCost;
	}

	@Override
	public void setActualCost(int actualCost) {
		_actualCost = actualCost;
	}

	@JSON
	@Override
	public String getConCode() {
		if (_conCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _conCode;
		}
	}

	@Override
	public void setConCode(String conCode) {
		_conCode = conCode;
	}

	@JSON
	@Override
	public int getPercentage() {
		return _percentage;
	}

	@Override
	public void setPercentage(int percentage) {
		_percentage = percentage;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Warranty.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Warranty.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Warranty toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Warranty)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WarrantyImpl warrantyImpl = new WarrantyImpl();

		warrantyImpl.setUuid(getUuid());
		warrantyImpl.setJlrWarrantyId(getJlrWarrantyId());
		warrantyImpl.setGroupId(getGroupId());
		warrantyImpl.setCompanyId(getCompanyId());
		warrantyImpl.setUserId(getUserId());
		warrantyImpl.setUserName(getUserName());
		warrantyImpl.setCreateDate(getCreateDate());
		warrantyImpl.setModifiedDate(getModifiedDate());
		warrantyImpl.setCategory(getCategory());
		warrantyImpl.setPeriod(getPeriod());
		warrantyImpl.setDealer(getDealer());
		warrantyImpl.setPartCategory(getPartCategory());
		warrantyImpl.setActualCost(getActualCost());
		warrantyImpl.setConCode(getConCode());
		warrantyImpl.setPercentage(getPercentage());

		warrantyImpl.resetOriginalValues();

		return warrantyImpl;
	}

	@Override
	public int compareTo(Warranty warranty) {
		int value = 0;

		if (getJlrWarrantyId() < warranty.getJlrWarrantyId()) {
			value = -1;
		}
		else if (getJlrWarrantyId() > warranty.getJlrWarrantyId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Warranty)) {
			return false;
		}

		Warranty warranty = (Warranty)obj;

		long primaryKey = warranty.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		WarrantyModelImpl warrantyModelImpl = this;

		warrantyModelImpl._originalUuid = warrantyModelImpl._uuid;

		warrantyModelImpl._originalGroupId = warrantyModelImpl._groupId;

		warrantyModelImpl._setOriginalGroupId = false;

		warrantyModelImpl._originalCompanyId = warrantyModelImpl._companyId;

		warrantyModelImpl._setOriginalCompanyId = false;

		warrantyModelImpl._originalUserId = warrantyModelImpl._userId;

		warrantyModelImpl._setOriginalUserId = false;

		warrantyModelImpl._originalCreateDate = warrantyModelImpl._createDate;

		warrantyModelImpl._setModifiedDate = false;

		warrantyModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Warranty> toCacheModel() {
		WarrantyCacheModel warrantyCacheModel = new WarrantyCacheModel();

		warrantyCacheModel.uuid = getUuid();

		String uuid = warrantyCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			warrantyCacheModel.uuid = null;
		}

		warrantyCacheModel.jlrWarrantyId = getJlrWarrantyId();

		warrantyCacheModel.groupId = getGroupId();

		warrantyCacheModel.companyId = getCompanyId();

		warrantyCacheModel.userId = getUserId();

		warrantyCacheModel.userName = getUserName();

		String userName = warrantyCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			warrantyCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			warrantyCacheModel.createDate = createDate.getTime();
		}
		else {
			warrantyCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			warrantyCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			warrantyCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		warrantyCacheModel.category = getCategory();

		String category = warrantyCacheModel.category;

		if ((category != null) && (category.length() == 0)) {
			warrantyCacheModel.category = null;
		}

		warrantyCacheModel.period = getPeriod();

		String period = warrantyCacheModel.period;

		if ((period != null) && (period.length() == 0)) {
			warrantyCacheModel.period = null;
		}

		warrantyCacheModel.dealer = getDealer();

		String dealer = warrantyCacheModel.dealer;

		if ((dealer != null) && (dealer.length() == 0)) {
			warrantyCacheModel.dealer = null;
		}

		warrantyCacheModel.partCategory = getPartCategory();

		String partCategory = warrantyCacheModel.partCategory;

		if ((partCategory != null) && (partCategory.length() == 0)) {
			warrantyCacheModel.partCategory = null;
		}

		warrantyCacheModel.actualCost = getActualCost();

		warrantyCacheModel.conCode = getConCode();

		String conCode = warrantyCacheModel.conCode;

		if ((conCode != null) && (conCode.length() == 0)) {
			warrantyCacheModel.conCode = null;
		}

		warrantyCacheModel.percentage = getPercentage();

		return warrantyCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", jlrWarrantyId=");
		sb.append(getJlrWarrantyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append(", period=");
		sb.append(getPeriod());
		sb.append(", dealer=");
		sb.append(getDealer());
		sb.append(", partCategory=");
		sb.append(getPartCategory());
		sb.append(", actualCost=");
		sb.append(getActualCost());
		sb.append(", conCode=");
		sb.append(getConCode());
		sb.append(", percentage=");
		sb.append(getPercentage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.liferay.kris.jlr.warranty.model.Warranty");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jlrWarrantyId</column-name><column-value><![CDATA[");
		sb.append(getJlrWarrantyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>period</column-name><column-value><![CDATA[");
		sb.append(getPeriod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dealer</column-name><column-value><![CDATA[");
		sb.append(getDealer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>partCategory</column-name><column-value><![CDATA[");
		sb.append(getPartCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actualCost</column-name><column-value><![CDATA[");
		sb.append(getActualCost());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>conCode</column-name><column-value><![CDATA[");
		sb.append(getConCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>percentage</column-name><column-value><![CDATA[");
		sb.append(getPercentage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Warranty.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Warranty.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _jlrWarrantyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _originalCreateDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _category;
	private String _period;
	private String _dealer;
	private String _partCategory;
	private int _actualCost;
	private String _conCode;
	private int _percentage;
	private long _columnBitmask;
	private Warranty _escapedModel;
}