<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>ordermgmt</title>
</head>

<body>
	<form action="addorder.action" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td>
					<select name="order.user.UId">
						<s:iterator value="userList" id="tempuser">
							<option value="${tempuser.UId}">${tempuser.username}</option>
						</s:iterator>
				</select>
				</td>
			</tr>
			<tr>
				<td>车次</td>
				<td>
					<select name="order.train.TId">
						<s:iterator value="trainList" id="temptrain">
							<option value="${temptrain.TId}">${temptrain.trainno}</option>
						</s:iterator>
					</select>
				</td>
			</tr>
			<tr>
				<td>车厢号</td>
				<td>
					<input type="text" name="order.carriageno" /> 
				</td>
			</tr>
			<tr>
				<td>座位号</td>
				<td>
					<input type="text" name="order.seatno" /> 
				</td>
			</tr>
		</table>
		<input type="submit" value="提交按钮" />
		<input type="reset" value="重置按钮" />
	</form>
</body>
</html>
