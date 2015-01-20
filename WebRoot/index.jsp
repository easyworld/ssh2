<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<body>
	<h1>火车站售票管理系统demo1.0</h1>
	<form action="loginProcess.action" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="user.username"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="user.password"></td>
			</tr>
			<tr>	
				<td><input type="submit" value="登录"></td>
			</tr>
		</table>
	</form>

</body>
</html>
