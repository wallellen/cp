<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="../jquery.easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../jquery.easyui/demo.css">
<script type="text/javascript" src="../jquery.easyui/jquery.min.js"></script>
<script type="text/javascript" src="../jquery.easyui/jquery.easyui.min.js"></script>
<title>设备明细</title>
<style type="text/css">
	body{
		 margin: 0px;
		 font-family: 微软雅黑;
	}
	.cs1{
		width:80px;
		height:24px;
		background-color: #F4F4F4;
		padding-left: 4px;
		text-align: left;
	}
	.cs2{
		width:120px;
		height:24px;
		padding-left: 2px;
		text-align: center;
	}
	hr{
		height:0.1px;
		border:none;
		border-top:1px dashed #0066CC;
	}
</style>

</head>
<body>
<div class="easyui-panel" style="width:580px;height:360px;padding:5px;">
	 <div class="easyui-layout" data-options="fit:true">
	 	<div data-options="region:'west'" style="width:380px;padding:5px">
             <table>
             	<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
             	<tr>
             		<td class="cs1">设备编号</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">组别属性</td>
					<td class="cs2">${ResultList.equid}</td>
             	</tr>
             	<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">IP地址</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">设备名称</td>
					<td class="cs2">${ResultList.equid}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">子网掩码</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">网关</td>
					<td class="cs2">${ResultList.equid}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">操作系统</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">开机用户名</td>
					<td class="cs2">${ResultList.equid}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">开机密码</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">软件用户名</td>
					<td class="cs2">${ResultList.equid}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">软件密码</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">端口号</td>
					<td class="cs2">${ResultList.equid}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">ntp地址</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">软件名称和版本</td>
					<td class="cs2">${ResultList.equid}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">设备品牌</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">设备型号</td>
					<td class="cs2">${ResultList.equid}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">设备类别</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">入网日期</td>
					<td class="cs2">${ResultList.equid}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
				<tr>
					<td class="cs1">建设单位</td>
					<td class="cs2">${ResultList.equid}</td>
					<td class="cs1">备注1</td>
					<td class="cs2">${ResultList.equid}</td>
				</tr>
				<tr><td colspan="4" height="0.1" bgcolor="#F4F4F4"></td></tr>
             </table>	
        </div>
        <div data-options="region:'center'" style="padding:5px">
             <img alt="" src="../images/nopic.jpg" width="170px">                  
         </div>
	 </div>
</div>
</body>
</html>