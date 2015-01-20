<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>usermgmt</title>
</head>

<body>
	<form action="adduser.action" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="user.username" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="user.password" /></td>
			</tr>
			<tr>
				<td>是否管理员</td>
				<td><select name="user.isadmin">
						<option value="true">是</option>
						<option value="false">否</option>
				</select></td>
			</tr>
		</table>
		<input type="submit" value="提交按钮" /> <input type="reset" value="重置按钮" />
	</form>
</body>
</html>
