/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.ams.model.impl;

import com.liferay.ams.model.Definition;
import com.liferay.ams.model.DefinitionSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="DefinitionModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the AMS_Definition table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       DefinitionImpl
 * @see       com.liferay.ams.model.Definition
 * @see       com.liferay.ams.model.DefinitionModel
 * @generated
 */
public class DefinitionModelImpl extends BaseModelImpl<Definition> {
	public static final String TABLE_NAME = "AMS_Definition";
	public static final Object[][] TABLE_COLUMNS = {
			{ "definitionId", new Integer(Types.BIGINT) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "userName", new Integer(Types.VARCHAR) },
			{ "createDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "typeId", new Integer(Types.BIGINT) },
			{ "manufacturer", new Integer(Types.VARCHAR) },
			{ "model", new Integer(Types.VARCHAR) },
			{ "orderDate", new Integer(Types.TIMESTAMP) },
			{ "quantity", new Integer(Types.INTEGER) },
			{ "price", new Integer(Types.DOUBLE) }
		};
	public static final String TABLE_SQL_CREATE = "create table AMS_Definition (definitionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,typeId LONG,manufacturer VARCHAR(75) null,model VARCHAR(75) null,orderDate DATE null,quantity INTEGER,price DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table AMS_Definition";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.ams.model.Definition"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.ams.model.Definition"),
			true);

	public static Definition toModel(DefinitionSoap soapModel) {
		Definition model = new DefinitionImpl();

		model.setDefinitionId(soapModel.getDefinitionId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTypeId(soapModel.getTypeId());
		model.setManufacturer(soapModel.getManufacturer());
		model.setModel(soapModel.getModel());
		model.setOrderDate(soapModel.getOrderDate());
		model.setQuantity(soapModel.getQuantity());
		model.setPrice(soapModel.getPrice());

		return model;
	}

	public static List<Definition> toModels(DefinitionSoap[] soapModels) {
		List<Definition> models = new ArrayList<Definition>(soapModels.length);

		for (DefinitionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.ams.model.Definition"));

	public DefinitionModelImpl() {
	}

	public long getPrimaryKey() {
		return _definitionId;
	}

	public void setPrimaryKey(long pk) {
		setDefinitionId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_definitionId);
	}

	public long getDefinitionId() {
		return _definitionId;
	}

	public void setDefinitionId(long definitionId) {
		_definitionId = definitionId;
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

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
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

	public long getTypeId() {
		return _typeId;
	}

	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	public String getManufacturer() {
		if (_manufacturer == null) {
			return StringPool.BLANK;
		}
		else {
			return _manufacturer;
		}
	}

	public void setManufacturer(String manufacturer) {
		_manufacturer = manufacturer;
	}

	public String getModel() {
		if (_model == null) {
			return StringPool.BLANK;
		}
		else {
			return _model;
		}
	}

	public void setModel(String model) {
		_model = model;
	}

	public Date getOrderDate() {
		return _orderDate;
	}

	public void setOrderDate(Date orderDate) {
		_orderDate = orderDate;
	}

	public int getQuantity() {
		return _quantity;
	}

	public void setQuantity(int quantity) {
		_quantity = quantity;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public Definition toEscapedModel() {
		if (isEscapedModel()) {
			return (Definition)this;
		}
		else {
			return (Definition)Proxy.newProxyInstance(Definition.class.getClassLoader(),
				new Class[] { Definition.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					Definition.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		DefinitionImpl clone = new DefinitionImpl();

		clone.setDefinitionId(getDefinitionId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTypeId(getTypeId());
		clone.setManufacturer(getManufacturer());
		clone.setModel(getModel());
		clone.setOrderDate(getOrderDate());
		clone.setQuantity(getQuantity());
		clone.setPrice(getPrice());

		return clone;
	}

	public int compareTo(Definition definition) {
		long pk = definition.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Definition definition = null;

		try {
			definition = (Definition)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = definition.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{definitionId=");
		sb.append(getDefinitionId());
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
		sb.append(", typeId=");
		sb.append(getTypeId());
		sb.append(", manufacturer=");
		sb.append(getManufacturer());
		sb.append(", model=");
		sb.append(getModel());
		sb.append(", orderDate=");
		sb.append(getOrderDate());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.liferay.ams.model.Definition");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>definitionId</column-name><column-value><![CDATA[");
		sb.append(getDefinitionId());
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
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>manufacturer</column-name><column-value><![CDATA[");
		sb.append(getManufacturer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>model</column-name><column-value><![CDATA[");
		sb.append(getModel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orderDate</column-name><column-value><![CDATA[");
		sb.append(getOrderDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _definitionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _typeId;
	private String _manufacturer;
	private String _model;
	private Date _orderDate;
	private int _quantity;
	private double _price;
	private transient ExpandoBridge _expandoBridge;
}