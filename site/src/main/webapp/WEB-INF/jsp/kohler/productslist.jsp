<%@ include file="/WEB-INF/jsp/include/imports.jsp" %> ffffffff
<c:if test="${not empty requestScope.pageable}">
<ul class="product-category-list">
 <c:forEach var="item" items="${requestScope.pageable.items}" varStatus="status">
         		<hst:link var="link" hippobean="${item}"/>
	<li class="col-4">
		<a href="${link}">
			<c:if test="${not empty  item.thumbnail}">
							<hst:link var="img" hippobean="${item.thumbnail}"/>
							<div class="img-cont"><img src="${img}" alt="${item.string}"></div>
						</c:if>
			<div class="content">
				<h5>${item.string}</h5>
				<hst:html hippohtml="${item.description}" fullyQualifiedLinks="true"/>
			</div>
		</a>
	</li>
	</c:forEach>
</ul>
</c:if>