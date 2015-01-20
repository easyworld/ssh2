<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>usermgmt</title>
</head>
<script type="text/javascript">
	function putdata(){
		var select_isadmin = document.getElementById("select_isadmin");
		var values = "${user.isadmin}";
		for(var i = 0; i < select_isadmin.options.length;i++){
			if(select_isadmin.options[i].value == values){
				select_isadmin.options[i].selected = true;
				break;
			}
		}
	}
	window.onload = putdata;
</script>
<body>
	<form action="edituser.action" method="post">
		<table>
			<tr>
				<td>用户名称</td>
				<td>
					<input type="text" name="user.username" value="${user.username}"/>
				</td>
			</tr>
			<tr>
				<td>用户密码</td>
				<td>
					<input type="text" name="user.password" value="${user.password}" />
				</td>
			</tr>
			<tr>
				<td>是否管理员</td>
				<td>
					<select id="select_isadmin" name="user.isadmin">
						<option value="true">是</option>
						<option value="false">否</option>
					</select>
				</td>
			</tr>
		</table>
		<input type="hidden" name="user.UId" value="${userId}" />
		<input type="submit" value="提交按钮" />
		<input type="reset" value="重置按钮" />
	</form>
</body>
</html>
