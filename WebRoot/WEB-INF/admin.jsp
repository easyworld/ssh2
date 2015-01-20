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
	<input type="button" value="车票管理" onclick="javascript:window.location.href='ordermgmt.action'" />
	<input type="button" value="车次管理" onclick="javascript:window.location.href='trainmgmt.action'" />
	<input type="button" value="用户管理" onclick="javascript:window.location.href='usermgmt.action'" />
</body>
</html>
