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
<body>
	<form action="userOrderAdd.action" method="post">
		<table>
			<thead>
				<tr>
					<td>选定</td>
					<td>车次名称</td>
					<td>出发地</td>
					<td>到达地</td>
					<td>出发时间</td>
					<td>到达时间</td>
				</tr>
			</thead>
			<s:iterator id="temptrain" value="trainList">
				<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
					<td align="center"><input type="radio" name="order.train.TId"
						value="${temptrain.TId}" />
					</td>
					<td align="center">${temptrain.trainno}</td>
					<td align="center">${temptrain.departure}</td>
					<td align="center">${temptrain.arrive}</td>
					<td align="center">${temptrain.starttime}</td>
					<td align="center">${temptrain.endtime}</td>
				</tr>
			</s:iterator>
		</table>
		<table>
			<tr>
				<td>车厢号</td>
				<td><input type="text" name="order.carriageno" /></td>
			</tr>
			<tr>
				<td>座位号</td>
				<td><input type="text" name="order.seatno" /></td>
			</tr>
		</table>
		<input type="hidden" name="order.user.UId" value='<s:property value="#session.usercontext.UId"/>'/>
		<input type="submit" value="提交按钮" />
		<input type="button" value="返回" onclick="javascript:window.location.href='gouser.action'" />
	</form>
</body>
</html>
