<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<c:if test="${not empty requestScope.pageable}">
	<ul class="r">
		 <c:forEach var="item" items="${requestScope.pageable.items}" varStatus="status">
		    <hst:link var="link" hippobean="${item}"/>
			<li>
				<a href="${link}">${item.title}</a>
			</li>
		</c:forEach>
	</ul>
</c:if>

					