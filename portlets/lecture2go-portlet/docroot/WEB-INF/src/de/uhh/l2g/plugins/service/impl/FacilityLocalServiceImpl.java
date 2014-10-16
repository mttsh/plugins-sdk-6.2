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

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.liferay.portal.kernel.exception.SystemException;

import de.uhh.l2g.plugins.model.Facility;
import de.uhh.l2g.plugins.service.base.FacilityLocalServiceBaseImpl;
import de.uhh.l2g.plugins.service.persistence.FacilityFinderUtil;

/**
 * The implementation of the facility local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link de.uhh.l2g.plugins.service.FacilityLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Iavor Sturm
 * @see de.uhh.l2g.plugins.service.base.FacilityLocalServiceBaseImpl
 * @see de.uhh.l2g.plugins.service.FacilityLocalServiceUtil
 */
public class FacilityLocalServiceImpl extends FacilityLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * de.uhh.l2g.plugins.service.FacilityLocalServiceUtil} to access the
	 * facility local service.	
	 */

	public List<Facility> getByParentId(long parentId, String type) throws SystemException {
		return facilityPersistence.findByParent(parentId);
	}
	
	public Map<String, String> getByParent(long parentId) throws SystemException {
		Map<String,String> facilities = new LinkedHashMap<String, String>();
		List <Facility> fList = facilityPersistence.findByParent(parentId);

		for (Facility faculty : fList) {
			String id = "" + faculty.getFacilityId();
			String name = "" + faculty.getName();
			facilities.put(id, name);
		}
		return facilities;
	}

	public List<Facility> getByLevel(int level) throws SystemException {
		return facilityPersistence.findBylevel(level);
	}

	public List<Facility> getByLectureseriesId(long lectureseriesId, int begin, int end) throws SystemException {
		return FacilityFinderUtil.findByLectureseriesId(lectureseriesId, begin, end);
	}

	public Map<String, String> getAllSortedAsTree(int begin, int end) throws SystemException {
		Map<String,String> allFaculties = new LinkedHashMap<String, String>();
		List <Facility> einListAll = FacilityFinderUtil.findAllSortedAsTree(begin, end);

		for (Facility faculty : einListAll) {
			String id = "" + faculty.getFacilityId();
			String name = _indentFromPath(faculty.getPath(), "/") + faculty.getName();
			allFaculties.put(id, name);
		}
		
		return allFaculties;
	}
	
	private String _indentFromPath(String path, String sep) {
		String s = "";
		for (int i = 1; i <= path.split(sep).length - 1; i++) {
			s += "--";
		}
		return s;
	}
}