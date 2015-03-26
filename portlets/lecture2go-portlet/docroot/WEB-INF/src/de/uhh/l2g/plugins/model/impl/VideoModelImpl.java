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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.uhh.l2g.plugins.model.Video;
import de.uhh.l2g.plugins.model.VideoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Video service. Represents a row in the &quot;LG_Video&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.model.VideoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VideoImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see VideoImpl
 * @see de.uhh.l2g.plugins.model.Video
 * @see de.uhh.l2g.plugins.model.VideoModel
 * @generated
 */
public class VideoModelImpl extends BaseModelImpl<Video> implements VideoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a video model instance should use the {@link de.uhh.l2g.plugins.model.Video} interface instead.
	 */
	public static final String TABLE_NAME = "LG_Video";
	public static final Object[][] TABLE_COLUMNS = {
			{ "videoId", Types.BIGINT },
			{ "title", Types.VARCHAR },
			{ "lectureseriesId", Types.BIGINT },
			{ "producerId", Types.BIGINT },
			{ "containerFormat", Types.VARCHAR },
			{ "filename", Types.VARCHAR },
			{ "resolution", Types.VARCHAR },
			{ "duration", Types.VARCHAR },
			{ "hostId", Types.BIGINT },
			{ "fileSize", Types.VARCHAR },
			{ "generationDate", Types.VARCHAR },
			{ "openAccess", Types.INTEGER },
			{ "downloadLink", Types.INTEGER },
			{ "metadataId", Types.BIGINT },
			{ "surl", Types.VARCHAR },
			{ "hits", Types.BIGINT },
			{ "uploadDate", Types.TIMESTAMP },
			{ "permittedToSegment", Types.INTEGER },
			{ "rootInstitutionId", Types.BIGINT },
			{ "citation2go", Types.INTEGER },
			{ "termId", Types.BIGINT },
			{ "videoCreatorId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table LG_Video (videoId LONG not null primary key,title VARCHAR(75) null,lectureseriesId LONG,producerId LONG,containerFormat VARCHAR(75) null,filename VARCHAR(75) null,resolution VARCHAR(75) null,duration VARCHAR(75) null,hostId LONG,fileSize VARCHAR(75) null,generationDate VARCHAR(75) null,openAccess INTEGER,downloadLink INTEGER,metadataId LONG,surl VARCHAR(75) null,hits LONG,uploadDate DATE null,permittedToSegment INTEGER,rootInstitutionId LONG,citation2go INTEGER,termId LONG,videoCreatorId LONG)";
	public static final String TABLE_SQL_DROP = "drop table LG_Video";
	public static final String ORDER_BY_JPQL = " ORDER BY video.videoId DESC, video.uploadDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_Video.videoId DESC, LG_Video.uploadDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Video"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Video"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.de.uhh.l2g.plugins.model.Video"),
			true);
	public static long DOWNLOADLINK_COLUMN_BITMASK = 1L;
	public static long FILENAME_COLUMN_BITMASK = 2L;
	public static long LECTURESERIESID_COLUMN_BITMASK = 4L;
	public static long OPENACCESS_COLUMN_BITMASK = 8L;
	public static long PRODUCERID_COLUMN_BITMASK = 16L;
	public static long ROOTINSTITUTIONID_COLUMN_BITMASK = 32L;
	public static long UPLOADDATE_COLUMN_BITMASK = 64L;
	public static long VIDEOID_COLUMN_BITMASK = 128L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.Video"));

	public VideoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _videoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVideoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _videoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Video.class;
	}

	@Override
	public String getModelClassName() {
		return Video.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("videoId", getVideoId());
		attributes.put("title", getTitle());
		attributes.put("lectureseriesId", getLectureseriesId());
		attributes.put("producerId", getProducerId());
		attributes.put("containerFormat", getContainerFormat());
		attributes.put("filename", getFilename());
		attributes.put("resolution", getResolution());
		attributes.put("duration", getDuration());
		attributes.put("hostId", getHostId());
		attributes.put("fileSize", getFileSize());
		attributes.put("generationDate", getGenerationDate());
		attributes.put("openAccess", getOpenAccess());
		attributes.put("downloadLink", getDownloadLink());
		attributes.put("metadataId", getMetadataId());
		attributes.put("surl", getSurl());
		attributes.put("hits", getHits());
		attributes.put("uploadDate", getUploadDate());
		attributes.put("permittedToSegment", getPermittedToSegment());
		attributes.put("rootInstitutionId", getRootInstitutionId());
		attributes.put("citation2go", getCitation2go());
		attributes.put("termId", getTermId());
		attributes.put("videoCreatorId", getVideoCreatorId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long videoId = (Long)attributes.get("videoId");

		if (videoId != null) {
			setVideoId(videoId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Long lectureseriesId = (Long)attributes.get("lectureseriesId");

		if (lectureseriesId != null) {
			setLectureseriesId(lectureseriesId);
		}

		Long producerId = (Long)attributes.get("producerId");

		if (producerId != null) {
			setProducerId(producerId);
		}

		String containerFormat = (String)attributes.get("containerFormat");

		if (containerFormat != null) {
			setContainerFormat(containerFormat);
		}

		String filename = (String)attributes.get("filename");

		if (filename != null) {
			setFilename(filename);
		}

		String resolution = (String)attributes.get("resolution");

		if (resolution != null) {
			setResolution(resolution);
		}

		String duration = (String)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		Long hostId = (Long)attributes.get("hostId");

		if (hostId != null) {
			setHostId(hostId);
		}

		String fileSize = (String)attributes.get("fileSize");

		if (fileSize != null) {
			setFileSize(fileSize);
		}

		String generationDate = (String)attributes.get("generationDate");

		if (generationDate != null) {
			setGenerationDate(generationDate);
		}

		Integer openAccess = (Integer)attributes.get("openAccess");

		if (openAccess != null) {
			setOpenAccess(openAccess);
		}

		Integer downloadLink = (Integer)attributes.get("downloadLink");

		if (downloadLink != null) {
			setDownloadLink(downloadLink);
		}

		Long metadataId = (Long)attributes.get("metadataId");

		if (metadataId != null) {
			setMetadataId(metadataId);
		}

		String surl = (String)attributes.get("surl");

		if (surl != null) {
			setSurl(surl);
		}

		Long hits = (Long)attributes.get("hits");

		if (hits != null) {
			setHits(hits);
		}

		Date uploadDate = (Date)attributes.get("uploadDate");

		if (uploadDate != null) {
			setUploadDate(uploadDate);
		}

		Integer permittedToSegment = (Integer)attributes.get(
				"permittedToSegment");

		if (permittedToSegment != null) {
			setPermittedToSegment(permittedToSegment);
		}

		Long rootInstitutionId = (Long)attributes.get("rootInstitutionId");

		if (rootInstitutionId != null) {
			setRootInstitutionId(rootInstitutionId);
		}

		Integer citation2go = (Integer)attributes.get("citation2go");

		if (citation2go != null) {
			setCitation2go(citation2go);
		}

		Long termId = (Long)attributes.get("termId");

		if (termId != null) {
			setTermId(termId);
		}

		Long videoCreatorId = (Long)attributes.get("videoCreatorId");

		if (videoCreatorId != null) {
			setVideoCreatorId(videoCreatorId);
		}
	}

	@Override
	public long getVideoId() {
		return _videoId;
	}

	@Override
	public void setVideoId(long videoId) {
		_columnBitmask = -1L;

		_videoId = videoId;
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public long getLectureseriesId() {
		return _lectureseriesId;
	}

	@Override
	public void setLectureseriesId(long lectureseriesId) {
		_columnBitmask |= LECTURESERIESID_COLUMN_BITMASK;

		if (!_setOriginalLectureseriesId) {
			_setOriginalLectureseriesId = true;

			_originalLectureseriesId = _lectureseriesId;
		}

		_lectureseriesId = lectureseriesId;
	}

	public long getOriginalLectureseriesId() {
		return _originalLectureseriesId;
	}

	@Override
	public long getProducerId() {
		return _producerId;
	}

	@Override
	public void setProducerId(long producerId) {
		_columnBitmask |= PRODUCERID_COLUMN_BITMASK;

		if (!_setOriginalProducerId) {
			_setOriginalProducerId = true;

			_originalProducerId = _producerId;
		}

		_producerId = producerId;
	}

	public long getOriginalProducerId() {
		return _originalProducerId;
	}

	@Override
	public String getContainerFormat() {
		if (_containerFormat == null) {
			return StringPool.BLANK;
		}
		else {
			return _containerFormat;
		}
	}

	@Override
	public void setContainerFormat(String containerFormat) {
		_containerFormat = containerFormat;
	}

	@Override
	public String getFilename() {
		if (_filename == null) {
			return StringPool.BLANK;
		}
		else {
			return _filename;
		}
	}

	@Override
	public void setFilename(String filename) {
		_columnBitmask |= FILENAME_COLUMN_BITMASK;

		if (_originalFilename == null) {
			_originalFilename = _filename;
		}

		_filename = filename;
	}

	public String getOriginalFilename() {
		return GetterUtil.getString(_originalFilename);
	}

	@Override
	public String getResolution() {
		if (_resolution == null) {
			return StringPool.BLANK;
		}
		else {
			return _resolution;
		}
	}

	@Override
	public void setResolution(String resolution) {
		_resolution = resolution;
	}

	@Override
	public String getDuration() {
		if (_duration == null) {
			return StringPool.BLANK;
		}
		else {
			return _duration;
		}
	}

	@Override
	public void setDuration(String duration) {
		_duration = duration;
	}

	@Override
	public long getHostId() {
		return _hostId;
	}

	@Override
	public void setHostId(long hostId) {
		_hostId = hostId;
	}

	@Override
	public String getFileSize() {
		if (_fileSize == null) {
			return StringPool.BLANK;
		}
		else {
			return _fileSize;
		}
	}

	@Override
	public void setFileSize(String fileSize) {
		_fileSize = fileSize;
	}

	@Override
	public String getGenerationDate() {
		if (_generationDate == null) {
			return StringPool.BLANK;
		}
		else {
			return _generationDate;
		}
	}

	@Override
	public void setGenerationDate(String generationDate) {
		_generationDate = generationDate;
	}

	@Override
	public int getOpenAccess() {
		return _openAccess;
	}

	@Override
	public void setOpenAccess(int openAccess) {
		_columnBitmask |= OPENACCESS_COLUMN_BITMASK;

		if (!_setOriginalOpenAccess) {
			_setOriginalOpenAccess = true;

			_originalOpenAccess = _openAccess;
		}

		_openAccess = openAccess;
	}

	public int getOriginalOpenAccess() {
		return _originalOpenAccess;
	}

	@Override
	public int getDownloadLink() {
		return _downloadLink;
	}

	@Override
	public void setDownloadLink(int downloadLink) {
		_columnBitmask |= DOWNLOADLINK_COLUMN_BITMASK;

		if (!_setOriginalDownloadLink) {
			_setOriginalDownloadLink = true;

			_originalDownloadLink = _downloadLink;
		}

		_downloadLink = downloadLink;
	}

	public int getOriginalDownloadLink() {
		return _originalDownloadLink;
	}

	@Override
	public long getMetadataId() {
		return _metadataId;
	}

	@Override
	public void setMetadataId(long metadataId) {
		_metadataId = metadataId;
	}

	@Override
	public String getSurl() {
		if (_surl == null) {
			return StringPool.BLANK;
		}
		else {
			return _surl;
		}
	}

	@Override
	public void setSurl(String surl) {
		_surl = surl;
	}

	@Override
	public long getHits() {
		return _hits;
	}

	@Override
	public void setHits(long hits) {
		_hits = hits;
	}

	@Override
	public Date getUploadDate() {
		return _uploadDate;
	}

	@Override
	public void setUploadDate(Date uploadDate) {
		_columnBitmask = -1L;

		if (_originalUploadDate == null) {
			_originalUploadDate = _uploadDate;
		}

		_uploadDate = uploadDate;
	}

	public Date getOriginalUploadDate() {
		return _originalUploadDate;
	}

	@Override
	public int getPermittedToSegment() {
		return _permittedToSegment;
	}

	@Override
	public void setPermittedToSegment(int permittedToSegment) {
		_permittedToSegment = permittedToSegment;
	}

	@Override
	public long getRootInstitutionId() {
		return _rootInstitutionId;
	}

	@Override
	public void setRootInstitutionId(long rootInstitutionId) {
		_columnBitmask |= ROOTINSTITUTIONID_COLUMN_BITMASK;

		if (!_setOriginalRootInstitutionId) {
			_setOriginalRootInstitutionId = true;

			_originalRootInstitutionId = _rootInstitutionId;
		}

		_rootInstitutionId = rootInstitutionId;
	}

	public long getOriginalRootInstitutionId() {
		return _originalRootInstitutionId;
	}

	@Override
	public int getCitation2go() {
		return _citation2go;
	}

	@Override
	public void setCitation2go(int citation2go) {
		_citation2go = citation2go;
	}

	@Override
	public long getTermId() {
		return _termId;
	}

	@Override
	public void setTermId(long termId) {
		_termId = termId;
	}

	@Override
	public long getVideoCreatorId() {
		return _videoCreatorId;
	}

	@Override
	public void setVideoCreatorId(long videoCreatorId) {
		_videoCreatorId = videoCreatorId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Video.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Video toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Video)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VideoImpl videoImpl = new VideoImpl();

		videoImpl.setVideoId(getVideoId());
		videoImpl.setTitle(getTitle());
		videoImpl.setLectureseriesId(getLectureseriesId());
		videoImpl.setProducerId(getProducerId());
		videoImpl.setContainerFormat(getContainerFormat());
		videoImpl.setFilename(getFilename());
		videoImpl.setResolution(getResolution());
		videoImpl.setDuration(getDuration());
		videoImpl.setHostId(getHostId());
		videoImpl.setFileSize(getFileSize());
		videoImpl.setGenerationDate(getGenerationDate());
		videoImpl.setOpenAccess(getOpenAccess());
		videoImpl.setDownloadLink(getDownloadLink());
		videoImpl.setMetadataId(getMetadataId());
		videoImpl.setSurl(getSurl());
		videoImpl.setHits(getHits());
		videoImpl.setUploadDate(getUploadDate());
		videoImpl.setPermittedToSegment(getPermittedToSegment());
		videoImpl.setRootInstitutionId(getRootInstitutionId());
		videoImpl.setCitation2go(getCitation2go());
		videoImpl.setTermId(getTermId());
		videoImpl.setVideoCreatorId(getVideoCreatorId());

		videoImpl.resetOriginalValues();

		return videoImpl;
	}

	@Override
	public int compareTo(Video video) {
		int value = 0;

		if (getVideoId() < video.getVideoId()) {
			value = -1;
		}
		else if (getVideoId() > video.getVideoId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = DateUtil.compareTo(getUploadDate(), video.getUploadDate());

		value = value * -1;

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

		if (!(obj instanceof Video)) {
			return false;
		}

		Video video = (Video)obj;

		long primaryKey = video.getPrimaryKey();

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
		VideoModelImpl videoModelImpl = this;

		videoModelImpl._originalLectureseriesId = videoModelImpl._lectureseriesId;

		videoModelImpl._setOriginalLectureseriesId = false;

		videoModelImpl._originalProducerId = videoModelImpl._producerId;

		videoModelImpl._setOriginalProducerId = false;

		videoModelImpl._originalFilename = videoModelImpl._filename;

		videoModelImpl._originalOpenAccess = videoModelImpl._openAccess;

		videoModelImpl._setOriginalOpenAccess = false;

		videoModelImpl._originalDownloadLink = videoModelImpl._downloadLink;

		videoModelImpl._setOriginalDownloadLink = false;

		videoModelImpl._originalUploadDate = videoModelImpl._uploadDate;

		videoModelImpl._originalRootInstitutionId = videoModelImpl._rootInstitutionId;

		videoModelImpl._setOriginalRootInstitutionId = false;

		videoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Video> toCacheModel() {
		VideoCacheModel videoCacheModel = new VideoCacheModel();

		videoCacheModel.videoId = getVideoId();

		videoCacheModel.title = getTitle();

		String title = videoCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			videoCacheModel.title = null;
		}

		videoCacheModel.lectureseriesId = getLectureseriesId();

		videoCacheModel.producerId = getProducerId();

		videoCacheModel.containerFormat = getContainerFormat();

		String containerFormat = videoCacheModel.containerFormat;

		if ((containerFormat != null) && (containerFormat.length() == 0)) {
			videoCacheModel.containerFormat = null;
		}

		videoCacheModel.filename = getFilename();

		String filename = videoCacheModel.filename;

		if ((filename != null) && (filename.length() == 0)) {
			videoCacheModel.filename = null;
		}

		videoCacheModel.resolution = getResolution();

		String resolution = videoCacheModel.resolution;

		if ((resolution != null) && (resolution.length() == 0)) {
			videoCacheModel.resolution = null;
		}

		videoCacheModel.duration = getDuration();

		String duration = videoCacheModel.duration;

		if ((duration != null) && (duration.length() == 0)) {
			videoCacheModel.duration = null;
		}

		videoCacheModel.hostId = getHostId();

		videoCacheModel.fileSize = getFileSize();

		String fileSize = videoCacheModel.fileSize;

		if ((fileSize != null) && (fileSize.length() == 0)) {
			videoCacheModel.fileSize = null;
		}

		videoCacheModel.generationDate = getGenerationDate();

		String generationDate = videoCacheModel.generationDate;

		if ((generationDate != null) && (generationDate.length() == 0)) {
			videoCacheModel.generationDate = null;
		}

		videoCacheModel.openAccess = getOpenAccess();

		videoCacheModel.downloadLink = getDownloadLink();

		videoCacheModel.metadataId = getMetadataId();

		videoCacheModel.surl = getSurl();

		String surl = videoCacheModel.surl;

		if ((surl != null) && (surl.length() == 0)) {
			videoCacheModel.surl = null;
		}

		videoCacheModel.hits = getHits();

		Date uploadDate = getUploadDate();

		if (uploadDate != null) {
			videoCacheModel.uploadDate = uploadDate.getTime();
		}
		else {
			videoCacheModel.uploadDate = Long.MIN_VALUE;
		}

		videoCacheModel.permittedToSegment = getPermittedToSegment();

		videoCacheModel.rootInstitutionId = getRootInstitutionId();

		videoCacheModel.citation2go = getCitation2go();

		videoCacheModel.termId = getTermId();

		videoCacheModel.videoCreatorId = getVideoCreatorId();

		return videoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{videoId=");
		sb.append(getVideoId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", lectureseriesId=");
		sb.append(getLectureseriesId());
		sb.append(", producerId=");
		sb.append(getProducerId());
		sb.append(", containerFormat=");
		sb.append(getContainerFormat());
		sb.append(", filename=");
		sb.append(getFilename());
		sb.append(", resolution=");
		sb.append(getResolution());
		sb.append(", duration=");
		sb.append(getDuration());
		sb.append(", hostId=");
		sb.append(getHostId());
		sb.append(", fileSize=");
		sb.append(getFileSize());
		sb.append(", generationDate=");
		sb.append(getGenerationDate());
		sb.append(", openAccess=");
		sb.append(getOpenAccess());
		sb.append(", downloadLink=");
		sb.append(getDownloadLink());
		sb.append(", metadataId=");
		sb.append(getMetadataId());
		sb.append(", surl=");
		sb.append(getSurl());
		sb.append(", hits=");
		sb.append(getHits());
		sb.append(", uploadDate=");
		sb.append(getUploadDate());
		sb.append(", permittedToSegment=");
		sb.append(getPermittedToSegment());
		sb.append(", rootInstitutionId=");
		sb.append(getRootInstitutionId());
		sb.append(", citation2go=");
		sb.append(getCitation2go());
		sb.append(", termId=");
		sb.append(getTermId());
		sb.append(", videoCreatorId=");
		sb.append(getVideoCreatorId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.Video");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>videoId</column-name><column-value><![CDATA[");
		sb.append(getVideoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lectureseriesId</column-name><column-value><![CDATA[");
		sb.append(getLectureseriesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>producerId</column-name><column-value><![CDATA[");
		sb.append(getProducerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>containerFormat</column-name><column-value><![CDATA[");
		sb.append(getContainerFormat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filename</column-name><column-value><![CDATA[");
		sb.append(getFilename());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resolution</column-name><column-value><![CDATA[");
		sb.append(getResolution());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duration</column-name><column-value><![CDATA[");
		sb.append(getDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hostId</column-name><column-value><![CDATA[");
		sb.append(getHostId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileSize</column-name><column-value><![CDATA[");
		sb.append(getFileSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>generationDate</column-name><column-value><![CDATA[");
		sb.append(getGenerationDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>openAccess</column-name><column-value><![CDATA[");
		sb.append(getOpenAccess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>downloadLink</column-name><column-value><![CDATA[");
		sb.append(getDownloadLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>metadataId</column-name><column-value><![CDATA[");
		sb.append(getMetadataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>surl</column-name><column-value><![CDATA[");
		sb.append(getSurl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hits</column-name><column-value><![CDATA[");
		sb.append(getHits());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uploadDate</column-name><column-value><![CDATA[");
		sb.append(getUploadDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>permittedToSegment</column-name><column-value><![CDATA[");
		sb.append(getPermittedToSegment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rootInstitutionId</column-name><column-value><![CDATA[");
		sb.append(getRootInstitutionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citation2go</column-name><column-value><![CDATA[");
		sb.append(getCitation2go());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>termId</column-name><column-value><![CDATA[");
		sb.append(getTermId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoCreatorId</column-name><column-value><![CDATA[");
		sb.append(getVideoCreatorId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Video.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Video.class };
	private long _videoId;
	private String _title;
	private long _lectureseriesId;
	private long _originalLectureseriesId;
	private boolean _setOriginalLectureseriesId;
	private long _producerId;
	private long _originalProducerId;
	private boolean _setOriginalProducerId;
	private String _containerFormat;
	private String _filename;
	private String _originalFilename;
	private String _resolution;
	private String _duration;
	private long _hostId;
	private String _fileSize;
	private String _generationDate;
	private int _openAccess;
	private int _originalOpenAccess;
	private boolean _setOriginalOpenAccess;
	private int _downloadLink;
	private int _originalDownloadLink;
	private boolean _setOriginalDownloadLink;
	private long _metadataId;
	private String _surl;
	private long _hits;
	private Date _uploadDate;
	private Date _originalUploadDate;
	private int _permittedToSegment;
	private long _rootInstitutionId;
	private long _originalRootInstitutionId;
	private boolean _setOriginalRootInstitutionId;
	private int _citation2go;
	private long _termId;
	private long _videoCreatorId;
	private long _columnBitmask;
	private Video _escapedModel;
}