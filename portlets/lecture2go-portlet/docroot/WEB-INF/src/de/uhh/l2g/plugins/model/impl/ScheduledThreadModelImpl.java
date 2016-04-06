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

package de.uhh.l2g.plugins.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.uhh.l2g.plugins.model.ScheduledThread;
import de.uhh.l2g.plugins.model.ScheduledThreadModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ScheduledThread service. Represents a row in the &quot;LG_ScheduledThread&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.model.ScheduledThreadModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ScheduledThreadImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see ScheduledThreadImpl
 * @see de.uhh.l2g.plugins.model.ScheduledThread
 * @see de.uhh.l2g.plugins.model.ScheduledThreadModel
 * @generated
 */
public class ScheduledThreadModelImpl extends BaseModelImpl<ScheduledThread>
	implements ScheduledThreadModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a scheduled thread model instance should use the {@link de.uhh.l2g.plugins.model.ScheduledThread} interface instead.
	 */
	public static final String TABLE_NAME = "LG_ScheduledThread";
	public static final Object[][] TABLE_COLUMNS = {
			{ "scheduledThreadId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table LG_ScheduledThread (scheduledThreadId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table LG_ScheduledThread";
	public static final String ORDER_BY_JPQL = " ORDER BY scheduledThread.scheduledThreadId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_ScheduledThread.scheduledThreadId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.ScheduledThread"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.ScheduledThread"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.ScheduledThread"));

	public ScheduledThreadModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _scheduledThreadId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setScheduledThreadId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _scheduledThreadId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ScheduledThread.class;
	}

	@Override
	public String getModelClassName() {
		return ScheduledThread.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scheduledThreadId", getScheduledThreadId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long scheduledThreadId = (Long)attributes.get("scheduledThreadId");

		if (scheduledThreadId != null) {
			setScheduledThreadId(scheduledThreadId);
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
	}

	@Override
	public long getScheduledThreadId() {
		return _scheduledThreadId;
	}

	@Override
	public void setScheduledThreadId(long scheduledThreadId) {
		_scheduledThreadId = scheduledThreadId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

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

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ScheduledThread.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ScheduledThread toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ScheduledThread)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ScheduledThreadImpl scheduledThreadImpl = new ScheduledThreadImpl();

		scheduledThreadImpl.setScheduledThreadId(getScheduledThreadId());
		scheduledThreadImpl.setGroupId(getGroupId());
		scheduledThreadImpl.setCompanyId(getCompanyId());
		scheduledThreadImpl.setUserId(getUserId());
		scheduledThreadImpl.setUserName(getUserName());
		scheduledThreadImpl.setCreateDate(getCreateDate());
		scheduledThreadImpl.setModifiedDate(getModifiedDate());

		scheduledThreadImpl.resetOriginalValues();

		return scheduledThreadImpl;
	}

	@Override
	public int compareTo(ScheduledThread scheduledThread) {
		long primaryKey = scheduledThread.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ScheduledThread)) {
			return false;
		}

		ScheduledThread scheduledThread = (ScheduledThread)obj;

		long primaryKey = scheduledThread.getPrimaryKey();

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<ScheduledThread> toCacheModel() {
		ScheduledThreadCacheModel scheduledThreadCacheModel = new ScheduledThreadCacheModel();

		scheduledThreadCacheModel.scheduledThreadId = getScheduledThreadId();

		scheduledThreadCacheModel.groupId = getGroupId();

		scheduledThreadCacheModel.companyId = getCompanyId();

		scheduledThreadCacheModel.userId = getUserId();

		scheduledThreadCacheModel.userName = getUserName();

		String userName = scheduledThreadCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			scheduledThreadCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			scheduledThreadCacheModel.createDate = createDate.getTime();
		}
		else {
			scheduledThreadCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			scheduledThreadCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			scheduledThreadCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return scheduledThreadCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{scheduledThreadId=");
		sb.append(getScheduledThreadId());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.ScheduledThread");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>scheduledThreadId</column-name><column-value><![CDATA[");
		sb.append(getScheduledThreadId());
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

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ScheduledThread.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ScheduledThread.class
		};
	private long _scheduledThreadId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private ScheduledThread _escapedModel;
}