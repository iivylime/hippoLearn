(function($) {

	var productSort = {
		
		init : function (){
			var self = this;
			self.container = $(".productcontainer");			
			if(self.container.length === 0){return;}
			
			self.product = $(".product-category-list li",self.container);			

			$(".sort-dropdown",self.container).on("click",function(e){
				e.preventDefault();
				$(this).toggleClass("active");
			});
			
			self.productSorting();
		},
		productSorting : function() {
			var self = this;			
			if(self.product.length === 0) {return;}			
			var productData = self.product;		
			var sorting = function (compareVal,sortDirection){
				var filteredProductData = [];				
				productData.each(function(){
					if($(this).attr(compareVal)){
						filteredProductData.push(this);
					} else {
						$(this).addClass("inactive");
					}
				});				
				//sorting			
				filteredProductData.sort(function(a,b){
					if(sortDirection=="true") {
						if (compareVal==="data-price"){
							return parseFloat($(a).attr(compareVal)) - parseFloat($(b).attr(compareVal));
						}else{
							return $(a).attr(compareVal) > $(b).attr(compareVal);
						}
					}else if (sortDirection=="false"){
						if (compareVal==="data-price"){
							return parseFloat($(b).attr(compareVal)) - parseFloat($(a).attr(compareVal));
						}else{
							return $(a).attr(compareVal) < $(b).attr(compareVal);
						}
					}
				});
				//dom manipulate
				$(filteredProductData).each(function(){
					$(this).appendTo($(this).closest(".product-category-list"));
				});
			};
			$(".sort-dropdown li",self.container).on("click",function(){
				var sortType = $(this).attr("data-type"),
				sortDirection = $(this).attr("data-ascend"),
				compareVal = "data-"+sortType;
				//active current option
				$(".sort-dropdown p",self.container).html($(this).text());
				$(this).addClass("active");		
				$(".sort-dropdown",self.container)
				sorting(compareVal,sortDirection);
			});
		}
	};

	$(function(){
		productSort.init();
	});		

}(jQuery));