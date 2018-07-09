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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.kris.jlr.warranty.service.http.WarrantyServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.kris.jlr.warranty.service.http.WarrantyServiceSoap
 * @generated
 */
@ProviderType
public class WarrantySoap implements Serializable {
	public static WarrantySoap toSoapModel(Warranty model) {
		WarrantySoap soapModel = new WarrantySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setJlrWarrantyId(model.getJlrWarrantyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCategory(model.getCategory());
		soapModel.setPeriod(model.getPeriod());
		soapModel.setDealer(model.getDealer());
		soapModel.setPartCategory(model.getPartCategory());
		soapModel.setActualCost(model.getActualCost());
		soapModel.setConCode(model.getConCode());
		soapModel.setPercentage(model.getPercentage());

		return soapModel;
	}

	public static WarrantySoap[] toSoapModels(Warranty[] models) {
		WarrantySoap[] soapModels = new WarrantySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WarrantySoap[][] toSoapModels(Warranty[][] models) {
		WarrantySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WarrantySoap[models.length][models[0].length];
		}
		else {
			soapModels = new WarrantySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WarrantySoap[] toSoapModels(List<Warranty> models) {
		List<WarrantySoap> soapModels = new ArrayList<WarrantySoap>(models.size());

		for (Warranty model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WarrantySoap[soapModels.size()]);
	}

	public WarrantySoap() {
	}

	public long getPrimaryKey() {
		return _jlrWarrantyId;
	}

	public void setPrimaryKey(long pk) {
		setJlrWarrantyId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getJlrWarrantyId() {
		return _jlrWarrantyId;
	}

	public void setJlrWarrantyId(long jlrWarrantyId) {
		_jlrWarrantyId = jlrWarrantyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	public String getPeriod() {
		return _period;
	}

	public void setPeriod(String period) {
		_period = period;
	}

	public String getDealer() {
		return _dealer;
	}

	public void setDealer(String dealer) {
		_dealer = dealer;
	}

	public String getPartCategory() {
		return _partCategory;
	}

	public void setPartCategory(String partCategory) {
		_partCategory = partCategory;
	}

	public int getActualCost() {
		return _actualCost;
	}

	public void setActualCost(int actualCost) {
		_actualCost = actualCost;
	}

	public String getConCode() {
		return _conCode;
	}

	public void setConCode(String conCode) {
		_conCode = conCode;
	}

	public int getPercentage() {
		return _percentage;
	}

	public void setPercentage(int percentage) {
		_percentage = percentage;
	}

	private String _uuid;
	private long _jlrWarrantyId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _category;
	private String _period;
	private String _dealer;
	private String _partCategory;
	private int _actualCost;
	private String _conCode;
	private int _percentage;
}