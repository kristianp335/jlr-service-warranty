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

import com.liferay.kris.jlr.warranty.model.Warranty;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Warranty in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Warranty
 * @generated
 */
@ProviderType
public class WarrantyCacheModel implements CacheModel<Warranty>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WarrantyCacheModel)) {
			return false;
		}

		WarrantyCacheModel warrantyCacheModel = (WarrantyCacheModel)obj;

		if (jlrWarrantyId == warrantyCacheModel.jlrWarrantyId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jlrWarrantyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jlrWarrantyId=");
		sb.append(jlrWarrantyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", category=");
		sb.append(category);
		sb.append(", period=");
		sb.append(period);
		sb.append(", dealer=");
		sb.append(dealer);
		sb.append(", partCategory=");
		sb.append(partCategory);
		sb.append(", actualCost=");
		sb.append(actualCost);
		sb.append(", conCode=");
		sb.append(conCode);
		sb.append(", percentage=");
		sb.append(percentage);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Warranty toEntityModel() {
		WarrantyImpl warrantyImpl = new WarrantyImpl();

		if (uuid == null) {
			warrantyImpl.setUuid(StringPool.BLANK);
		}
		else {
			warrantyImpl.setUuid(uuid);
		}

		warrantyImpl.setJlrWarrantyId(jlrWarrantyId);
		warrantyImpl.setGroupId(groupId);
		warrantyImpl.setCompanyId(companyId);
		warrantyImpl.setUserId(userId);

		if (userName == null) {
			warrantyImpl.setUserName(StringPool.BLANK);
		}
		else {
			warrantyImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			warrantyImpl.setCreateDate(null);
		}
		else {
			warrantyImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			warrantyImpl.setModifiedDate(null);
		}
		else {
			warrantyImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (category == null) {
			warrantyImpl.setCategory(StringPool.BLANK);
		}
		else {
			warrantyImpl.setCategory(category);
		}

		if (period == null) {
			warrantyImpl.setPeriod(StringPool.BLANK);
		}
		else {
			warrantyImpl.setPeriod(period);
		}

		if (dealer == null) {
			warrantyImpl.setDealer(StringPool.BLANK);
		}
		else {
			warrantyImpl.setDealer(dealer);
		}

		if (partCategory == null) {
			warrantyImpl.setPartCategory(StringPool.BLANK);
		}
		else {
			warrantyImpl.setPartCategory(partCategory);
		}

		warrantyImpl.setActualCost(actualCost);

		if (conCode == null) {
			warrantyImpl.setConCode(StringPool.BLANK);
		}
		else {
			warrantyImpl.setConCode(conCode);
		}

		warrantyImpl.setPercentage(percentage);

		warrantyImpl.resetOriginalValues();

		return warrantyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jlrWarrantyId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		category = objectInput.readUTF();
		period = objectInput.readUTF();
		dealer = objectInput.readUTF();
		partCategory = objectInput.readUTF();

		actualCost = objectInput.readInt();
		conCode = objectInput.readUTF();

		percentage = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(jlrWarrantyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (category == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (period == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(period);
		}

		if (dealer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dealer);
		}

		if (partCategory == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(partCategory);
		}

		objectOutput.writeInt(actualCost);

		if (conCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(conCode);
		}

		objectOutput.writeInt(percentage);
	}

	public String uuid;
	public long jlrWarrantyId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String category;
	public String period;
	public String dealer;
	public String partCategory;
	public int actualCost;
	public String conCode;
	public int percentage;
}