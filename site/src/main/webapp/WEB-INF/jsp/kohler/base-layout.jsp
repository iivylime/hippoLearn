<!doctype html>
<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
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
					<li><a href="">蒙古</a></li>
				</ul>
				<hst:include ref="top"/> 				
 			</div>
 		</div>
 		<nav class="clearfix">
 			<hst:include ref="menu"/> 			
 			<a href="/site"><img src="<hst:webfile  path="/images/logo.png"/>" class="logo" alt=""></a>
 			<ul class="r">
 				<li><a href="">IDEAS</a></li>
 				<li class="searchwrap">
 					<input type="text" name="searchbar" maxlength="250" placeholder="search" autocomplete="off">
 					<a href="" class="my-cart"><img src="<hst:webfile  path="/images/cart.png"/>" alt=""></a>
 				</li>
 			</ul>

 		</nav>
 	</header><!-- /header -->
    
    <hst:include ref="main"/>
    <%--<hst:include ref="footer"/> --%>
<hst:headContributions categoryIncludes="htmlBodyEnd" xhtml="true"/>
</body>
</html>