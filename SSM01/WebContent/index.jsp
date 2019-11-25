<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"  src="${pageContext.request.contextPath}/js/jquery-1.10.1.js"></script>
<script type="text/javascript">
$(function(){
	var pageCurrent = 1;//显示第几页
	var pageSize = 3;//每页显示多少笔
	var allCount = 0;//总共的数据笔数
	var allPage = 0;//总共的数据页数
	var lastName = "";
	query();//执行query
	function query(){
		lastName = $("#lastName").val();
		var param = {
				lastName:lastName,
				pageCurrent:pageCurrent,
				pageSize:pageSize
		};
		var url = "${pageContext.request.contextPath}/emp/query";
		$.get(url,param,function(data){
			console.log(data);
			//显示页面
			
			//异步请求emp/queryCount 获取数据笔数
			
			
			//进而计算页数
			
			//进而控制分页按钮
			
			//进而.....
		});
		
		
	}
	$("#query").click(function(){
		pageCurrent = 1;
		query();
		return false;
	});
});
</script>
</head>
<body>
	<form>
		lastName:<input type="text" id="lastName">
		<button id="query">查询</button>
	</form>
	<hr/>
	<div id="showEmp">
		
	</div>
	<div>
		
	</div>
</body>
</html>