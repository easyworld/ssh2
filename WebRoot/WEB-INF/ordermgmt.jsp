<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>ordermgmt</title>
</head>
<style type="text/css">
table {
	font-family: verdana, arial, sans-serif;
	font-size: 11px;
	color: #333333;
	border-width: 1px;
	border-color: #999999;
	border-collapse: collapse;
}

table thead tr {
	background-color: #c3dde0;
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}

table tr {
	background-color: #d4e3e5;
}

table td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
</style>
<script type="text/javascript">
	function hasChosen() {
		var x = document.getElementsByName("orderId");
		for ( var i = 0; i < x.length; i++) {
			if (x[i].checked == true)
				return true;
		}
		return false;
	}
	function add() {
		var form1 = document.getElementById("form1");
		form1.action = "addorderpage.action";
		form1.submit();
	}
	function edit() {
		if (!hasChosen()) {
			alert("请选择一个");
			return;
		}
		var form1 = document.getElementById("form1");
		form1.action = "editorderpage.action";
		form1.submit();
	}
	function del() {
		if (!hasChosen()) {
			alert("请选择一个");
			return;
		}
		var form1 = document.getElementById("form1");
		form1.action = "deleteorder.action";
		form1.submit();
	}
</script>
<body>
	<input type="button" value="新增" onclick="add();" />
	<input type="button" value="修改" onclick="edit();" />
	<input type="button" value="删除" onclick="del();" />
	<form id="form1" action="" method="post">
		<table>
			<thead>
				<tr>
					<td>选定</td>
					<td>订单id</td>
					<td>用户id</td>
					<td>车次id</td>
					<td>车厢号</td>
					<td>座位号</td>
				</tr>
			</thead>
			<s:iterator id="temporder" value="orderList">
				<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
					<td align="center"><input type="radio" name="orderId"
						value="${temporder.OId}" />
					</td>
					<td align="center">${temporder.OId}</td>
					<td align="center">${temporder.user.username}</td>
					<td align="center">${temporder.train.trainno}</td>
					<td align="center">${temporder.carriageno}</td>
					<td align="center">${temporder.seatno}</td>
				</tr>
			</s:iterator>
		</table>
	</form>
	<input type="button" value="回主页" onclick="javascript:window.location.href='goadmin.action'" />
</body>
</html>
