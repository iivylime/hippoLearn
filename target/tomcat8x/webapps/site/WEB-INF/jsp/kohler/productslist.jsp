<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<hst:setBundle basename="essentials.global"/>
<c:if test="${not empty requestScope.pageable}">
<div class="productcontainer">
<div class="action-wrap"><%-- 
	<select name="sort-by">
		<option value="">Sort by</option>
		<option value="">Name A-Z</option>
		<option value="">Name Z-A</option>
	</select> --%>
	<div class="sort-dropdown">
		<p><fmt:message key="sort.orderby"/></p>
		<ul class="dropdownlist">
			<%-- <li class="option" data-type="name" data-ascend="true">Name: A-Z </li>
			<li class="option" data-type="name" data-ascend="false">Name: Z-A </li>--%>
			<li class="option" data-type="price" data-ascend="false"><fmt:message key="sort.price.hightolow"/></li>
			<li class="option" data-type="price"data-ascend="true"><fmt:message key="sort.price.lowtohigh"/></li>
		</ul>
	</div>
	<div class="buttons">
		<button><img src="<hst:webfile path="/images/print.png"/>" alt="print"></button>
		<button><img src="<hst:webfile path="/images/share.png"/>" alt="share"></button>
	</div>
</div>

<ul class="product-category-list">
 <c:forEach var="item" items="${requestScope.pageable.items}" varStatus="status">
         		<hst:link var="link" hippobean="${item}"/>
	<li class="col-4" data-price="${item.price}">
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
</div>
 <hst:headContribution category="htmlBodyEnd">
    <script type="text/javascript" src="<hst:webfile path="/js/jquery-2.1.0.min.js"/>"></script>
  </hst:headContribution>
   <hst:headContribution category="htmlBodyEnd">
    <script type="text/javascript" src="<hst:webfile path="/js/sort.min.js"/>"></script>
  </hst:headContribution>
</c:if>