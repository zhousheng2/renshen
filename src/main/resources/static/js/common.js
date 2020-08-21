// var baseUrl = "http://127.0.0.1:9000/"
// var baseUrl = "http://192.168.126.101:9000/"
var baseUrl = "http://119.28.8.143:80/"
$(function() {
  var onload = function() {
  	// 客户端环境验证
  	if ((navigator.userAgent.match(/(phone|pad|pod|iPhone|iPod|ios|iPad|Android|Mobile|BlackBerry|IEMobile|MQQBrowser|JUC|Fennec|wOSBrowser|BrowserNG|WebOS|Symbian|Windows Phone)/i))) {
		  // WAP端布局展示
		  $("#wap-home-layout").show();
		  // WAP端查询按钮点击事件
		  $("#wap-search-button").on("click", function(){
				var inputValue = $("#wap-search-input").val();
				if (inputValue.length > 0) {
					$.ajax({
						type: "GET",
						url: baseUrl+"renshenInfo/detail",
						data: {productCode: inputValue},
						dataType: "json",
						success: function(res){
	          	if (res.code == 1000) {
	          		$('#wap-result').empty();
	          		var defaultImg = '/images/default.jpg';
	          		var html = '';
	          		html += '<div class="wap-detail-search">';
	              html += '<div class="wap-detail-search-title">';
	              html += '<span>查询结果</span>';
	              html += '</div>';
	              html += '<div class="wap-detail-row row-border">';
	              html += '<div class="wap-detail-column-half">';
	              html += '<div class="wap-detail-label">';
	              html += '<span>产品编号</span>';
	              html += '</div>';
	              html += '<div class="wap-detail-value">';
	              html += '<span>' + res.data.productCode + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="wap-detail-column-half">';
	              html += '<div class="wap-detail-label">';
	              html += '<span>日期</span>';
	              html += '</div>';
	              html += '<div class="wap-detail-value">';
	              html += '<span>' + res.data.checkDate + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="wap-detail-row">';
	              html += '<div class="wap-detail-column-all">';
	              html += '<div class="wap-detail-label">';
	              html += '<span>注</span>';
	              html += '</div>';
	              html += '<div class="wap-detail-value">';
	              html += '<span>' + res.data.checkResult + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="wap-detail-image">';
	              html += '<div class="wap-detail-image-title">';
	              html += '<span>图片信息</span>';
	              html += '</div>';
	              html += '<div class="wap-detail-image-content">';
	              // html += '<img src="http://116.62.51.46:9000/images/' + res.data.imageUrl + '" onerror="javascript:this.src=\'baseurl/images/default.jpg\'" alt="goods">';
	              // html += '<img src="http://192.168.126.101:9000/' + res.data.imageUrl + '" onerror="javascript:this.src=\'/images/default.jpg\'" alt="goods">';
	              html += '<img src="http://119.28.8.143:80/' + res.data.imageUrl + '" onerror="javascript:this.src=\'/images/default.jpg\'" alt="goods">';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="wap-detail-goods">';
	              html += '<div class="wap-detail-goods-title">';
	              html += '<span>产品信息</span>';
	              html += '</div>';
	              html += '<div class="wap-detail-row wap-row-border">';
	              html += '<div class="wap-detail-column-half">';
	              html += '<div class="wap-detail-label">';
	              html += '<span>品名</span>';
	              html += '</div>';
	              html += '<div class="wap-detail-value">';
	              html += '<span>' + res.data.productType + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="wap-detail-column-half">';
	              html += '<div class="wap-detail-label wap-border-right">';
	              html += '<span>是否合格</span>';
	              html += '</div>';
	              html += '<div class="wap-detail-value">';
	              html += '<span>' + res.data.qualifiedFlag + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="wap-detail-row">';
	              html += '<div class="wap-detail-column-half">';
	              html += '<div class="wap-detail-label">';
	              html += '<span>产地</span>';
	              html += '</div>';
	              html += '<div class="wap-detail-value">';
	              html += '<span>' + res.data.productOrigin + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="wap-detail-column-half">';
	              html += '<div class="wap-detail-label wap-border-right">';
	              html += '<span>等级</span>';
	              html += '</div>';
	              html += '<div class="wap-detail-value">';
	              html += '<span>' + res.data.productLevel + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	          		$('#wap-result').html(html);
	          		$('#wap-home-layout').hide();
	          		$('#wap-detail-layout').show();
	          	} else if (res.code == 1001) {
	          		$("#wap-home-search").hide();
	          		$("#wap-home-tip").show();
	          		setTimeout(function(){
	          			$("#wap-home-tip").hide();
	          			$("#wap-home-search").show();
	          		}, 1500);
	          	} else {
	          		$("#wap-home-search").hide();
	          		$("#wap-home-tip").show();
	          		setTimeout(function(){
	          			$("#wap-home-tip").hide();
	          			$("#wap-home-search").show();
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
			// WAP端返回按钮点击事件
			$("#wap-go-home").on("click",function(){
				$("#wap-search-input").val("")
				$('#wap-result').empty();
		    $('#wap-detail-layout').hide();
		    $('#wap-home-layout').show();
			});
		}else{
			// PC端布局展示
		  $("#home-layout").show();
		  // PC端查询按钮点击事件
			$("#search-button").on("click", function(){
				var inputValue = $("#search-input").val();
				if (inputValue.length > 0) {
					$.ajax({
	          type: "GET",
	          url: baseUrl+"renshenInfo/detail",
	          data: {productCode: inputValue},
	          dataType: "json",
	          success: function(res){
	          	if (res.code == 1000) {
	          		$('#result').empty();
	          		var defaultImg = '/images/default.jpg'
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
	              html += '<span>日期</span>';
	              html += '</div>';
	              html += '<div class="detail-value">';
	              html += '<span>' + res.data.checkDate + '</span>';
	              html += '</div>';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="detail-row">';
	              html += '<div class="detail-column-all">';
	              html += '<div class="detail-label">';
	              html += '<span>注</span>';
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
	              // html += '<img src="http://116.62.51.46:9000/images/' + res.data.imageUrl + '" onerror="javascript:this.src=\'baseurl/images/default.jpg\'" alt="goods">';
	              // html += '<img src="http://192.168.126.101:9000/' + res.data.imageUrl + '" onerror="javascript:this.src=\'/images/default.jpg\'" alt="goods">';
	              html += '<img src="http://119.28.8.143:80/' + res.data.imageUrl + '" onerror="javascript:this.src=\'/images/default.jpg\'" alt="goods">';
	              html += '</div>';
	              html += '</div>';
	              html += '<div class="detail-goods">';
	              html += '<div class="detail-goods-title">';
	              html += '<span>产品信息</span>';
	              html += '</div>';
	              html += '<div class="detail-row row-border">';
	              html += '<div class="detail-column-half">';
	              html += '<div class="detail-label">';
	              html += '<span>品名</span>';
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
			// PC端返回按钮点击事件
			$("#go-home").on("click",function(){
				$("#search-input").val("")
				$('#result').empty();
		    $('#detail-layout').hide();
		    $('#home-layout').show();
			});
		}
  }
  onload();
});