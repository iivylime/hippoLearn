<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<hst:setBundle basename="essentials.faucets"/>
<c:if test="${not empty requestScope.facets}">
<div class="prod-name">
	<h2>${facets.name}</h2>
	<p>${facets.childCountsCombined} <fmt:message key="products"/></p>
</div>
<div class="side-section">
 		<hst:link var="rootlink" hippobean="${facets.rootFacetNavigationBean}" />		 
		<div class="title">
			<fmt:message key="filter.by"/>: <a href="${rootlink}"><fmt:message key="clear.all"/></a>
		</div>
		<div class="side-section-list">
			<ul>
			<c:forEach items="${requestScope.facets.folders}" var="facet" >
			<c:forEach items="${facet.folders}" var="value" >						
			<c:if test="${value.count >0}">
                     <c:choose><c:when test="${value.leaf}">
                     <hst:facetnavigationlink var="link" remove="${value}" current="${facets}" />
                      <!--   <li> <input type="checkbox" id="p1" name="p1" value=""><label for="p1"> ${value.name}</label></li> -->
                      <li><a class="filter" href="${link}">${value.name}</a></li>
                     </c:when><c:otherwise>
                       <hst:link var="link" hippobean="${value}" />
                       <!--  <li> <input type="checkbox" id="p1" name="p1" value=""><label for="p1">${value.name}</label></li> -->
                       <li><a href="${link}">${value.name}</a>&nbsp;(${value.count})</li>
                       </c:otherwise></c:choose>  
                       </c:if>                   
				</c:forEach>
				</c:forEach>				
			</ul>
		</div>
	</div>
</c:if>