<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<section class="product-category article">
		<div class="container">
			<section class="m-b-20"> 
				<div class="row">
					<div class="col-4 side-nav">
						<div class="prod-name">
							<h2>SINK FAUCETS</h2>
							<p>135 products</p>
						</div>
					</div>
					<div class="col-8">
						<div class="action-wrap">
							<select name="sort-by">
								<option value="">Sort by</option>
								<option value="">Name A-Z</option>
								<option value="">Name Z-A</option>
							</select>
							<button><img src="<hst:webfile path="/images/print.png"/>" alt="print"></button>
							<button><img src="<hst:webfile path="/images/share.png"/>" alt="Share"></button>
						</div>
					</div>
				</div>
			</section>
			<section class="m-t-20">
				<div class="row ">
					<div class="col-4">						
						 <hst:include ref="left"/>
					</div>
					<div class="col-8">
						<div class="row">							
							 <hst:include ref="right"/>
						</div>
					</div>
				</div>
			</section>
		</div>
		
	</section>