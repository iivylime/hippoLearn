<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<c:if test="${not empty requestScope.pageable}">
<section class="section">
		<div class="container article clearfix">
			<ul class="promotion-list">
			 <c:forEach var="item" items="${requestScope.pageable.items}" varStatus="status">
         		<hst:link var="link" hippobean="${item}"/>
				<li class="col-4">
					<a href="${link}">
						<c:if test="${not empty  item.thumbnail}">
							<hst:link var="img" hippobean="${item.thumbnail}"/>
							<div class="img-cont"><img src="${img}" alt="${item.title}"></div>
						</c:if>
						<div class="content">
							<h3>${item.string}</h3>
							<p>${item.text}</p>
						</div>
					</a>
				</li>
			</c:forEach>
			</ul>
		</div>
	</section>	
</c:if>