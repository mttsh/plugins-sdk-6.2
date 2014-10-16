/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.uhh.l2g.plugins.model.Facility;
import de.uhh.l2g.plugins.model.FacilityModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Facility service. Represents a row in the &quot;LG_Facility&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.model.FacilityModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FacilityImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see FacilityImpl
 * @see de.uhh.l2g.plugins.model.Facility
 * @see de.uhh.l2g.plugins.model.FacilityModel
 * @generated
 */
public class FacilityModelImpl extends BaseModelImpl<Facility>
	implements FacilityModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a facility model instance should use the {@link de.uhh.l2g.plugins.model.Facility} interface instead.
	 */
	public static final String TABLE_NAME = "LG_Facility";
	public static final Object[][] TABLE_COLUMNS = {
			{ "facilityId", Types.BIGINT },
			{ "parentId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "typ", Types.VARCHAR },
			{ "www", Types.VARCHAR },
			{ "level", Types.INTEGER },
			{ "sort", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table LG_Facility (facilityId LONG not null primary key,parentId LONG,name VARCHAR(75) null,typ VARCHAR(75) null,www VARCHAR(75) null,level INTEGER,sort INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table LG_Facility";
	public static final String ORDER_BY_JPQL = " ORDER BY facility.facilityId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_Facility.facilityId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Facility"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Facility"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.de.uhh.l2g.plugins.model.Facility"),
			true);
	public static long LEVEL_COLUMN_BITMASK = 1L;
	public static long NAME_COLUMN_BITMASK = 2L;
	public static long PARENTID_COLUMN_BITMASK = 4L;
	public static long SORT_COLUMN_BITMASK = 8L;
	public static long TYP_COLUMN_BITMASK = 16L;
	public static long WWW_COLUMN_BITMASK = 32L;
	public static long FACILITYID_COLUMN_BITMASK = 64L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.Facility"));

	public FacilityModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _facilityId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFacilityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _facilityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Facility.class;
	}

	@Override
	public String getModelClassName() {
		return Facility.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("facilityId", getFacilityId());
		attributes.put("parentId", getParentId());
		attributes.put("name", getName());
		attributes.put("typ", getTyp());
		attributes.put("www", getWww());
		attributes.put("level", getLevel());
		attributes.put("sort", getSort());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long facilityId = (Long)attributes.get("facilityId");

		if (facilityId != null) {
			setFacilityId(facilityId);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String typ = (String)attributes.get("typ");

		if (typ != null) {
			setTyp(typ);
		}

		String www = (String)attributes.get("www");

		if (www != null) {
			setWww(www);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		Integer sort = (Integer)attributes.get("sort");

		if (sort != null) {
			setSort(sort);
		}
	}

	@Override
	public long getFacilityId() {
		return _facilityId;
	}

	@Override
	public void setFacilityId(long facilityId) {
		_facilityId = facilityId;
	}

	@Override
	public long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(long parentId) {
		_columnBitmask |= PARENTID_COLUMN_BITMASK;

		if (!_setOriginalParentId) {
			_setOriginalParentId = true;

			_originalParentId = _parentId;
		}

		_parentId = parentId;
	}

	public long getOriginalParentId() {
		return _originalParentId;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@Override
	public String getTyp() {
		if (_typ == null) {
			return StringPool.BLANK;
		}
		else {
			return _typ;
		}
	}

	@Override
	public void setTyp(String typ) {
		_columnBitmask |= TYP_COLUMN_BITMASK;

		if (_originalTyp == null) {
			_originalTyp = _typ;
		}

		_typ = typ;
	}

	public String getOriginalTyp() {
		return GetterUtil.getString(_originalTyp);
	}

	@Override
	public String getWww() {
		if (_www == null) {
			return StringPool.BLANK;
		}
		else {
			return _www;
		}
	}

	@Override
	public void setWww(String www) {
		_columnBitmask |= WWW_COLUMN_BITMASK;

		if (_originalWww == null) {
			_originalWww = _www;
		}

		_www = www;
	}

	public String getOriginalWww() {
		return GetterUtil.getString(_originalWww);
	}

	@Override
	public int getLevel() {
		return _level;
	}

	@Override
	public void setLevel(int level) {
		_columnBitmask |= LEVEL_COLUMN_BITMASK;

		if (!_setOriginalLevel) {
			_setOriginalLevel = true;

			_originalLevel = _level;
		}

		_level = level;
	}

	public int getOriginalLevel() {
		return _originalLevel;
	}

	@Override
	public int getSort() {
		return _sort;
	}

	@Override
	public void setSort(int sort) {
		_columnBitmask |= SORT_COLUMN_BITMASK;

		if (!_setOriginalSort) {
			_setOriginalSort = true;

			_originalSort = _sort;
		}

		_sort = sort;
	}

	public int getOriginalSort() {
		return _originalSort;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Facility.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Facility toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Facility)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FacilityImpl facilityImpl = new FacilityImpl();

		facilityImpl.setFacilityId(getFacilityId());
		facilityImpl.setParentId(getParentId());
		facilityImpl.setName(getName());
		facilityImpl.setTyp(getTyp());
		facilityImpl.setWww(getWww());
		facilityImpl.setLevel(getLevel());
		facilityImpl.setSort(getSort());

		facilityImpl.resetOriginalValues();

		return facilityImpl;
	}

	@Override
	public int compareTo(Facility facility) {
		long primaryKey = facility.getPrimaryKey();

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

		if (!(obj instanceof Facility)) {
			return false;
		}

		Facility facility = (Facility)obj;

		long primaryKey = facility.getPrimaryKey();

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
		FacilityModelImpl facilityModelImpl = this;

		facilityModelImpl._originalParentId = facilityModelImpl._parentId;

		facilityModelImpl._setOriginalParentId = false;

		facilityModelImpl._originalName = facilityModelImpl._name;

		facilityModelImpl._originalTyp = facilityModelImpl._typ;

		facilityModelImpl._originalWww = facilityModelImpl._www;

		facilityModelImpl._originalLevel = facilityModelImpl._level;

		facilityModelImpl._setOriginalLevel = false;

		facilityModelImpl._originalSort = facilityModelImpl._sort;

		facilityModelImpl._setOriginalSort = false;

		facilityModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Facility> toCacheModel() {
		FacilityCacheModel facilityCacheModel = new FacilityCacheModel();

		facilityCacheModel.facilityId = getFacilityId();

		facilityCacheModel.parentId = getParentId();

		facilityCacheModel.name = getName();

		String name = facilityCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			facilityCacheModel.name = null;
		}

		facilityCacheModel.typ = getTyp();

		String typ = facilityCacheModel.typ;

		if ((typ != null) && (typ.length() == 0)) {
			facilityCacheModel.typ = null;
		}

		facilityCacheModel.www = getWww();

		String www = facilityCacheModel.www;

		if ((www != null) && (www.length() == 0)) {
			facilityCacheModel.www = null;
		}

		facilityCacheModel.level = getLevel();

		facilityCacheModel.sort = getSort();

		return facilityCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{facilityId=");
		sb.append(getFacilityId());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", typ=");
		sb.append(getTyp());
		sb.append(", www=");
		sb.append(getWww());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", sort=");
		sb.append(getSort());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.Facility");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>facilityId</column-name><column-value><![CDATA[");
		sb.append(getFacilityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typ</column-name><column-value><![CDATA[");
		sb.append(getTyp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>www</column-name><column-value><![CDATA[");
		sb.append(getWww());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sort</column-name><column-value><![CDATA[");
		sb.append(getSort());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Facility.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Facility.class
		};
	private long _facilityId;
	private long _parentId;
	private long _originalParentId;
	private boolean _setOriginalParentId;
	private String _name;
	private String _originalName;
	private String _typ;
	private String _originalTyp;
	private String _www;
	private String _originalWww;
	private int _level;
	private int _originalLevel;
	private boolean _setOriginalLevel;
	private int _sort;
	private int _originalSort;
	private boolean _setOriginalSort;
	private long _columnBitmask;
	private Facility _escapedModel;
}