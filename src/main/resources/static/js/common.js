$(function() {
    var onload = function() {
    	$("#search-button").on("click",function(){
    		var inputValue = $("#search-input").val();
    		if (inputValue.length > 0) {
    			$.ajax({
            type: "GET",
            url: "http://121.41.95.194:9000/renshenInfo/detail",
            data: {productCode: inputValue},
            dataType: "json",
            success: function(res){
            	if (res.code == 1000) {
            		$('#result').empty();
            		var defaultImg = '/images/product.jpg'
	              var html = '';
	              html += '<div class="detail-search">';
	              html += '<div class="detail-search-title">';
	              html += '<span>查询结果</span>';
	              html += '</div>';
	              html += '<div class="detail-row row-border">';
	              html += '<div class="detail-column-half">';
	              html += '<div class="detail-label">';
	              html += '<span>产品编号</span>';
	              html += '</div>';
	              html += '<div class="detail-value">';
	              html += '<span>' + res.data.productCode + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="detail-column-half">';
	              html += '<div class="detail-label border-right">';
	              html += '<span>鉴定日期</span>';
	              html += '</div>';
	              html += '<div class="detail-value">';
	              html += '<span>' + res.data.checkDate + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="detail-row">';
	              html += '<div class="detail-column-all">';
	              html += '<div class="detail-label">';
	              html += '<span>鉴定结论</span>';
	              html += '</div>';
	              html += '<div class="detail-value">';
	              html += '<span>' + res.data.checkResult + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="detail-image">';
	              html += '<div class="detail-image-title">';
	              html += '<span>图片信息</span>';
	              html += '</div>';
	              html += '<div class="detail-image-content">';
	              // html += '<img src="' + res.data.imageUrl + '"  alt="goods">';
	              html += '<img src="http://121.41.95.194:8080/images/' + res.data.imageUrl + '" onerror="javascript:this.src=\'/images/product.jpg\'" alt="goods">';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="detail-goods">';
	              html += '<div class="detail-goods-title">';
	              html += '<span>产品信息</span>';
	              html += '</div>';
	              html += '<div class="detail-row row-border">';
	              html += '<div class="detail-column-half">';
	              html += '<div class="detail-label">';
	              html += '<span>种类</span>';
	              html += '</div>';
	              html += '<div class="detail-value">';
	              html += '<span>' + res.data.productType + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="detail-column-half">';
	              html += '<div class="detail-label border-right">';
	              html += '<span>是否合格</span>';
	              html += '</div>';
	              html += '<div class="detail-value">';
	              html += '<span>' + res.data.qualifiedFlag + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="detail-row">';
	              html += '<div class="detail-column-half">';
	              html += '<div class="detail-label">';
	              html += '<span>产地</span>';
	              html += '</div>';
	              html += '<div class="detail-value">';
	              html += '<span>' + res.data.productOrigin + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="detail-column-half">';
	              html += '<div class="detail-label border-right">';
	              html += '<span>等级</span>';
	              html += '</div>';
	              html += '<div class="detail-value">';
	              html += '<span>' + res.data.productLevel + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
              	$('#result').html(html);
              	$('#home-layout').hide();
              	$('#detail-layout').show();
            	} else if (res.code == 1001) {
            		console.log(123)
            		$("#home-search").hide();
            		$("#home-tip").show();
            		setTimeout(function(){
            			$("#home-tip").hide();
            			$("#home-search").show();
            		}, 1500);
            	} else {
            		$("#home-search").hide();
            		$("#home-tip").show();
            		setTimeout(function(){
            			$("#home-tip").hide();
            			$("#home-search").show();
            		}, 1500);
            	}
            },
            error: function(){            	
              alert("请求服务器失败");
            }
         });
    		} else {
    			alert("请输入要查询的产品编号");
    		}
			});
			
			$("#go-home").on("click",function(){
				$("#search-input").val("")
				$('#result').empty();
        $('#detail-layout').hide();
        $('#home-layout').show();
			});
    }
    onload();
});