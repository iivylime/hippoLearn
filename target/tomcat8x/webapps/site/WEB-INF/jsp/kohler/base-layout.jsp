<!doctype html>
<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<hst:setBundle basename="essentials.global"/>
<html lang="en">
<head>
  <meta charset="utf-8"/>
  <link rel="stylesheet" href="<hst:webfile  path="/css/bootstrap.css"/>" type="text/css"/>
  <link rel="stylesheet" href="<hst:webfile  path="/css/bootstrap.min.css"/>" type="text/css"/>
  <link rel="stylesheet" href="<hst:webfile  path="/css/styles.css"/>" type="text/css"/>
  
 <hst:headContributions categoryIncludes="htmlHead" xhtml="true"/>
</head>
<body class="base">
    <header id="header" class="">
 		<div class="mini">
 			<div class="container clearfix">
				<ul class="l">
					<li><a href="">Kohler Company <img src="<hst:webfile  path="/images/arrow-right.png"/>" alt=""></a></li>
					
					<c:if test="${not empty pageContext.request and not empty pageContext.request.locale}">	
						<c:choose><c:when test="${pageContext.request.locale.language == 'en'}">
							<c:set var="path" value="/site/cn"/>
						</c:when><c:otherwise>
							<c:set var="path" value="/site/"/>
						</c:otherwise></c:choose>
					</c:if>
					<li><a href="${path}"><fmt:message key="lang.text"/></a></li>
				</ul>
				<hst:include ref="top"/> 				
 			</div>
 		</div>
 		<nav class="clearfix">
 			<hst:include ref="menu"/> 			
 			<%-- <a href="/site"><img src="<hst:webfile  path="/images/logo.png"/>" class="logo" alt=""></a>
 			<ul class="r">
 				<li><a href="">IDEAS</a></li>
 				<li class="searchwrap">
 					<input type="text" name="searchbar" maxlength="250" placeholder="search" autocomplete="off">
 					<a href="" class="my-cart"><img src="<hst:webfile  path="/images/cart.png"/>" alt=""></a>
 				</li>
 			</ul>
			 --%>
 		</nav>
 	</header><!-- /header -->
    
    <hst:include ref="main"/>
    <%--<hst:include ref="footer"/> --%>
<hst:headContributions categoryIncludes="htmlBodyEnd" xhtml="true"/>
</body>
</html>