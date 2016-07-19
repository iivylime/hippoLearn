<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<c:if test="${not empty requestScope.pageable}">

<div class="action-wrap">
	<select name="sort-by">
		<option value="">Sort by</option>
		<option value="">Name A-Z</option>
		<option value="">Name Z-A</option>
	</select>
	<button><img src="<hst:webfile path="/images/print.png"/>" alt="print"></button>
	<button><img src="<hst:webfile path="/images/share.png"/>" alt="share"></button>
</div>
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
				<p class="sku">${item.sku}</p>
				<p class="price"><fmt:formatNumber value="${item.price}" type="currency" /></p>
			</div>
		</a>
	</li>
	</c:forEach>
</ul>
</c:if>