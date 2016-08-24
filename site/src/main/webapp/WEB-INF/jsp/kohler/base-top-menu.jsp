<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>

<%--@elvariable id="menu" type="org.hippoecm.hst.core.sitemenu.HstSiteMenu"--%>
<%--@elvariable id="editMode" type="java.lang.Boolean"--%>
<ul class="l">
<c:choose>
  <c:when test="${menu ne null}">
    <c:if test="${not empty menu.siteMenuItems}">
        <c:forEach var="item" items="${menu.siteMenuItems}"> 
        <%--  <c:if test="${not empty items.childMenuItems}">
        	 <c:forEach var="child" items="${items.childMenuItems}">
        	 	${item.name}-->${child.name}
        	 </c:forEach>
        </c:if>--%>
          <c:choose>
           <c:when test="${fn:toLowerCase(item.name) eq 'home'}">
             <li  class="logo"><a href="<hst:link link="${item.hstLink}"/>"><img src="<hst:webfile path="/images/logo.png"/>" alt="Logo"/></a></li>
            </c:when>
            <c:when test="${item.selected or item.expanded}">
              <li class="active"><a href="<hst:link link="${item.hstLink}"/>"><c:out value="${item.name}"/></a></li>
            </c:when> 
            <c:otherwise>
              <li><a href="<hst:link link="${item.hstLink}"/>"><c:out value="${item.name}"/></a></li>
            </c:otherwise>
          </c:choose>
        </c:forEach>
	   </c:if>
	   <hst:cmseditmenu menu="${menu}"/>
	  </c:when>
  <%--Placeholder reminding us to configure a valid menu in the component parameters--%>
  <c:otherwise>
    <c:if test="${requestScope.editMode}">
      <h5>[Menu Component]</h5>
      <sub>Click to edit Menu</sub>
    </c:if>
  </c:otherwise>
</c:choose>
	<li class="searchwrap">
		<input type="text" name="searchbar" maxlength="250" placeholder='<fmt:message key="search.submit.text"/>' autocomplete="off">		
	</li>
	<li class="my-cart">
		<a href=""><img src="<hst:webfile  path="/images/cart.png"/>" alt=""></a>
	</li>
 </ul>