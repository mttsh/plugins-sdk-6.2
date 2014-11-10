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

package de.uhh.l2g.plugins.service.impl;

import com.liferay.portal.kernel.exception.SystemException;

import de.uhh.l2g.plugins.service.base.Video_LectureseriesLocalServiceBaseImpl;
import de.uhh.l2g.plugins.service.persistence.Video_LectureseriesUtil;

/**
 * The implementation of the video_ lectureseries local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.uhh.l2g.plugins.service.Video_LectureseriesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Iavor Sturm
 * @see de.uhh.l2g.plugins.service.base.Video_LectureseriesLocalServiceBaseImpl
 * @see de.uhh.l2g.plugins.service.Video_LectureseriesLocalServiceUtil
 */
public class Video_LectureseriesLocalServiceImpl
	extends Video_LectureseriesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link de.uhh.l2g.plugins.service.Video_LectureseriesLocalServiceUtil} to access the video_ lectureseries local service.
	 */
	public boolean removeByLectureseriesId(Long lectureseriesId) {
		boolean ret = false;
		try {
			Video_LectureseriesUtil.removeByLectureseries(lectureseriesId);
		} catch (SystemException e) {
			ret = true;
			e.printStackTrace();
		}
		return ret;
	}
	
	public boolean removeByVideoId(Long videoId) {
		boolean ret = false;
		try {
			Video_LectureseriesUtil.removeByVideo(videoId);
		} catch (SystemException e) {
			ret = true;
			e.printStackTrace();
		}
		return ret;
	}
	
}