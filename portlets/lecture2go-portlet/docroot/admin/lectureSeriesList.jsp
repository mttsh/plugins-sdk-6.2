<%@include file="/init.jsp"%>

<portlet:renderURL var="addLectureseriesURL"><portlet:param name="jspPage" value="/admin/editLectureseries.jsp" /></portlet:renderURL>

<%
	Map<String,String> facilities = new LinkedHashMap<String, String>();
	List<Producer> producers = new ArrayList<Producer>();
	
	List<Lectureseries> tempLectureseriesList = new ArrayList();
	List<String> semesters = LectureseriesLocalServiceUtil.getAllSemesters(com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS , com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS);
	
	Long facilityId = ServletRequestUtils.getLongParameter(request, "facilityId", 0);
	
	Long producerId = ServletRequestUtils.getLongParameter(request, "producerId", 0);
	String semesterId = ServletRequestUtils.getStringParameter(request, "semesterId", "");
	Integer statusId = ServletRequestUtils.getIntParameter(request, "statusId", 0);
	
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("facilityId", facilityId+"");
	portletURL.setParameter("producerId", producerId+"");
	portletURL.setParameter("semesterId", semesterId+"");
	portletURL.setParameter("statusId", statusId+"");

	if(permissionAdmin){
		facilities = FacilityLocalServiceUtil.getAllSortedAsTree(com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS , com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS);
		producers = ProducerLocalServiceUtil.getAllProducers(com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS , com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS);
		permissionCoordinator = false;
	}
	
	if(permissionCoordinator){
		if(facilityId==0)facilityId = CoordinatorLocalServiceUtil.getCoordinator(remoteUser.getUserId()).getFacilityId();
		facilities = FacilityLocalServiceUtil.getByParent(CoordinatorLocalServiceUtil.getCoordinator(remoteUser.getUserId()).getFacilityId());
		producers = ProducerLocalServiceUtil.getProducersByFacilityId(CoordinatorLocalServiceUtil.getCoordinator(remoteUser.getUserId()).getFacilityId());
	}	
%>

<aui:fieldset helpMessage="choose-filter" column="true">
		<aui:layout>
 			<aui:column>
						<portlet:renderURL var="sortByFacility">
							<portlet:param name="jspPage" value="/admin/lectureSeriesList.jsp" />
							<portlet:param name="producerId" value="<%=producerId.toString()%>"/>
							<portlet:param name="semesterId" value="<%=semesterId.toString()%>"/>
							<portlet:param name="statusId" value="<%=statusId.toString()%>"/>
						</portlet:renderURL>
						<aui:form action="<%= sortByFacility.toString() %>" method="post">
							<aui:select name="facilityId" label="select-facility" onChange="submit();">
								<aui:option value="">select-facility</aui:option>

								<%for (Map.Entry<String, String> f : facilities.entrySet()) {
										if(f.getKey().equals(facilityId.toString())){
											%>
											<aui:option value='<%=f.getKey()%>' selected="true"><%=f.getValue()%></aui:option>
											<%}else{%>
											<aui:option value='<%=f.getKey()%>'><%=f.getValue()%></aui:option>
											<%}	
								}%>
							</aui:select>
						</aui:form>	
				</aui:column>			
				<aui:column>
						<portlet:renderURL var="sortByProducer">
							<portlet:param name="jspPage" value="/admin/lectureSeriesList.jsp" />
							<portlet:param name="facilityId" value="<%=facilityId.toString()%>"/>
							<portlet:param name="semesterId" value="<%=semesterId.toString()%>"/>
							<portlet:param name="statusId" value="<%=statusId.toString()%>"/>
						</portlet:renderURL>
						<aui:form action="<%= sortByProducer.toString() %>" method="post">
							<aui:select name="producerId" label="select-producer" onChange="submit();">
								<aui:option value="">select-producer</aui:option>
								<%for (int i = 0; i < producers.size(); i++) {
										if(producers.get(i).getProducerId()==producerId){
											%>
											<aui:option value='<%=producers.get(i).getProducerId()%>' selected="true"><%=producers.get(i).getLastName()+", "+producers.get(i).getFirstName()%></aui:option>
											<%}else{%>
											<aui:option value='<%=producers.get(i).getProducerId()%>'><%=producers.get(i).getLastName()+", "+producers.get(i).getFirstName()%></aui:option>
											<%}					
								}%>
							</aui:select>
						</aui:form>		
				</aui:column>	
				<aui:column>
						<portlet:renderURL var="sortBySemester">
							<portlet:param name="jspPage" value="/admin/lectureSeriesList.jsp" />
							<portlet:param name="facilityId" value="<%=facilityId.toString()%>"/>
							<portlet:param name="statusId" value="<%=statusId.toString()%>"/>
							<portlet:param name="producerId" value="<%=producerId.toString()%>"/>
						</portlet:renderURL>
						<aui:form action="<%= sortBySemester.toString() %>" method="post">
							<aui:select name="semesterId" label="select-semester" onChange="submit();">
								<aui:option value="">select-semester</aui:option>
								<%for (int i = 0; i < semesters.size(); i++) {
										if(semesters.get(i).equals(semesterId)){
											%>
											<aui:option value='<%=semesters.get(i)%>' selected="true"><%=semesters.get(i)%></aui:option>
											<%}else{%>
											<aui:option value='<%=semesters.get(i)%>'><%=semesters.get(i)%></aui:option>
											<%}					
								}%>
							</aui:select>
						</aui:form>				
				</aui:column>	
				<aui:column>
						<portlet:renderURL var="sortByStatus">
							<portlet:param name="jspPage" value="/admin/lectureSeriesList.jsp" />
							<portlet:param name="facilityId" value="<%=facilityId.toString()%>"/>
							<portlet:param name="producerId" value="<%=producerId.toString()%>"/>
							<portlet:param name="semesterId" value="<%=semesterId.toString()%>"/>
						</portlet:renderURL>
						<aui:form action="<%= sortByStatus.toString() %>" method="post">
							<aui:select name="statusId" label="select-status" onChange="submit();">
								<aui:option value="3">select-status</aui:option>
										<%if(statusId==0){%>
											<aui:option value='0' selected="true">approved-false</aui:option>
										<%}else{%>
											<aui:option value='0'>approved-false</aui:option>
										<%}%>				
										<%if(statusId==1){%>
											<aui:option value='1' selected="true">approved-true</aui:option>
										<%}else{%>
											<aui:option value='1'>approved-true</aui:option>
										<%}%>
							</aui:select>
						</aui:form>
				</aui:column>		
		</aui:layout>
		<aui:layout>
			<aui:row>
				<aui:button value="add-new-lectureseries" onClick="<%=addLectureseriesURL%>"/>
			</aui:row>
		</aui:layout>
</aui:fieldset>

<liferay-ui:search-container emptyResultsMessage="no-lectureseries-found" delta="10" iteratorURL="<%= portletURL %>">
	<liferay-ui:search-container-results>
		<%
			tempLectureseriesList = LectureseriesLocalServiceUtil.getFilteredBySemesterFacultyProducer(statusId, semesterId, new Long(facilityId), new Long(producerId));
			results = ListUtil.subList(tempLectureseriesList, searchContainer.getStart(), searchContainer.getEnd());
			total = tempLectureseriesList.size();
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="de.uhh.l2g.plugins.model.Lectureseries" keyProperty="lectureseriesId" modelVar="lectser">
		<portlet:actionURL name="viewLectureseries" var="editURL">
			<portlet:param name="lectureseriesId" value="<%= String.valueOf(lectser.getLectureseriesId())%>" />
			<portlet:param name="facilityId" value="<%=facilityId.toString()%>"/>
			<portlet:param name="producerId" value="<%=producerId.toString()%>"/>
			<portlet:param name="semesterId" value="<%=semesterId.toString()%>"/>		
			<portlet:param name="statusId" value="<%=statusId.toString()%>"/>
		</portlet:actionURL>
		<liferay-ui:search-container-column-text name="name">
			<aui:a  href="<%=editURL.toString()%>"><%=lectser.getName()%></aui:a>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>