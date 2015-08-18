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

package de.uhh.l2g.plugins.migration.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LegacyCoordinator service. Represents a row in the &quot;coordinator&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.migration.model.impl.LegacyCoordinatorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.migration.model.impl.LegacyCoordinatorImpl}.
 * </p>
 *
 * @author unihh
 * @see LegacyCoordinator
 * @see de.uhh.l2g.plugins.migration.model.impl.LegacyCoordinatorImpl
 * @see de.uhh.l2g.plugins.migration.model.impl.LegacyCoordinatorModelImpl
 * @generated
 */
public interface LegacyCoordinatorModel extends BaseModel<LegacyCoordinator> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a legacy coordinator model instance should use the {@link LegacyCoordinator} interface instead.
	 */

	/**
	 * Returns the primary key of this legacy coordinator.
	 *
	 * @return the primary key of this legacy coordinator
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this legacy coordinator.
	 *
	 * @param primaryKey the primary key of this legacy coordinator
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the user ID of this legacy coordinator.
	 *
	 * @return the user ID of this legacy coordinator
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this legacy coordinator.
	 *
	 * @param userId the user ID of this legacy coordinator
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this legacy coordinator.
	 *
	 * @return the user uuid of this legacy coordinator
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this legacy coordinator.
	 *
	 * @param userUuid the user uuid of this legacy coordinator
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the facility ID of this legacy coordinator.
	 *
	 * @return the facility ID of this legacy coordinator
	 */
	public long getFacilityId();

	/**
	 * Sets the facility ID of this legacy coordinator.
	 *
	 * @param facilityId the facility ID of this legacy coordinator
	 */
	public void setFacilityId(long facilityId);

	/**
	 * Returns the office ID of this legacy coordinator.
	 *
	 * @return the office ID of this legacy coordinator
	 */
	public long getOfficeId();

	/**
	 * Sets the office ID of this legacy coordinator.
	 *
	 * @param officeId the office ID of this legacy coordinator
	 */
	public void setOfficeId(long officeId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(LegacyCoordinator legacyCoordinator);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LegacyCoordinator> toCacheModel();

	@Override
	public LegacyCoordinator toEscapedModel();

	@Override
	public LegacyCoordinator toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}