<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>高大上的系统</title>

</head>

<body>
	<div>
		<s:property value="#session.usercontext.username"/>，你好
		<input type="button" value="注销" onclick="javascript:window.location.href='logoutProccess.action'" />
	</div>
	<hr> 
	<input type="button" value="订票" onclick="javascript:window.location.href='userorderaddpage.action'" />
	<input type="button" value="我的订单" onclick="javascript:window.location.href='userorderpage.action'" />
</body>
</html>
