<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎使用社会面图像信息管理系统</title>
<link rel="stylesheet" type="text/css"
	href="jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="jquery.easyui/themes/icon.css">
<script type="text/javascript" src="jquery.easyui/jquery.min.js"></script>
<script type="text/javascript" src="jquery.easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery.easyui/easyui-lang-zh_CN.js"></script>
<style type="text/css">
body {
	margin: 0px;
	background-image: url("images/bg.jpg");
	text-align: center;
	font-family: 微软雅黑;
}

#mydiv {
	width: 400px;
	height: 280px;
}
</style>
<script type="text/javascript">
	$(function() {
		$(window).resize();
		
		document.onkeydown = function(e){ 
			var ev = document.all ? window.event : e; 
			if(ev.keyCode==13) { 
				submitLogin();
			}
		};
	});

	$(window).resize(function() {
		$("#mydiv").css({
			position : "absolute",
			left : ($(window).width() - $("#mydiv").outerWidth()) / 2,
			top : ($(window).height() - $("#mydiv").outerHeight()) / 2
		});
	});
	
	function submitLogin() {
		$.messager.progress(); // display the progress bar
		$('#ff').form('submit', {
			url : "<%=path%>/base/login.do",
			onSubmit : function() {
				var isValid = $(this).form('validate');
				if (!isValid) {
					$.messager.progress('close'); // hide progress bar while the
				}
				return isValid; // return false will stop the form submission
			},
			success : function(objs) {
				//data=eval("("+objs+")");//转换为json对象
				//setTimeout("javascript:location.href='index.html'", 5000); 
				$.messager.progress('close'); // hide progress bar while submit
				window.location.href = "index.html";
				// successfully
				//$.messager.alert("提示", "操作成功！", "info");
			},
		});
	}
</script>
</head>
<body>
	<div id="mydiv">
		<div class="easyui-panel" title="系统登录"
			style="width: 100%; height: 100%; padding: 30px 70px 20px 70px"">
			<form id="ff" method="post">
				<div style="margin-bottom: 10px">
					<input class="easyui-textbox" name="username"
						style="width: 100%; height: 40px; padding: 12px"
						data-options="prompt:'Username',iconCls:'icon-man',iconWidth:38">
				</div>
				<div style="margin-bottom: 20px">
					<input class="easyui-textbox" type="password" name="password"
						style="width: 100%; height: 40px; padding: 12px"
						data-options="prompt:'Password',iconCls:'icon-lock',iconWidth:38">
				</div>
				<div style="margin-bottom: 20px">
					<input type="checkbox" checked="checked"><span>记住我</span>
				</div>
			</form>
			<div>
				<a href="javascript:void(0);" class="easyui-linkbutton" id="loginme"
					data-options="iconCls:'icon-ok'"
					style="padding: 5px 0px; width: 100%;"> <span
					style="font-size: 14px;" onclick="submitLogin();">Login</span>
				</a>
			</div>
		</div>
	</div>
</body>
</html>