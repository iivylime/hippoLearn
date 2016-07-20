<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<c:if test="${not empty requestScope.pageable}">
<div class="productcontainer">
<div class="action-wrap"><%-- 
	<select name="sort-by">
		<option value="">Sort by</option>
		<option value="">Name A-Z</option>
		<option value="">Name Z-A</option>
	</select> --%>
	<div class="sort-dropdown">
		<p>order by</p>
		<ul class="dropdownlist">
			<li class="option" data-type="sku" data-ascend="true">Sort Default </li>
			<li class="option" data-type="price" data-ascend="false">Price from high to low</li>
			<li class="option" data-type="price"data-ascend="true">Price from low to high</li>
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
	<li class="col-4" data-price="${item.price}" data-sku="${item.sku}">
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
    <script type="text/javascript" src="<hst:webfile path="/js/sort_jso.js"/>"></script>
  </hst:headContribution>
</c:if>