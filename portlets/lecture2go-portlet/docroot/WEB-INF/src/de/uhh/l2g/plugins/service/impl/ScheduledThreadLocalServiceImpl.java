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

package de.uhh.l2g.plugins.service.impl;

import de.uhh.l2g.plugins.service.base.ScheduledThreadLocalServiceBaseImpl;

/**
 * DummyTable! This could be used to persist Thread Information in the Future 
 * 
 * The implementation of the scheduled thread local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.uhh.l2g.plugins.service.ScheduledThreadLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Iavor Sturm
 * @see de.uhh.l2g.plugins.service.base.ScheduledThreadLocalServiceBaseImpl
 * @see de.uhh.l2g.plugins.service.ScheduledThreadLocalServiceUtil
 */
public class ScheduledThreadLocalServiceImpl
	extends ScheduledThreadLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link de.uhh.l2g.plugins.service.ScheduledThreadLocalServiceUtil} to access the scheduled thread local service.
	 */
}
