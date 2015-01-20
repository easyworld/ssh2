<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>trainmgmt</title>
</head>

<body>
	<form action="addtrain.action" method="post">
		<table>
			<tr>
				<td>车次名称</td>
				<td>
					<input type="text" name="train.trainno" />
				</td>
			</tr>
			<tr>
				<td>出发地点</td>
				<td>
					<input type="text" name="train.departure" />
				</td>
			</tr>
			<tr>
				<td>到达地点</td>
				<td>
					<input type="text" name="train.arrive" /> 
				</td>
			</tr>
			<tr>
				<td>开车时间</td>
				<td>
					<input type="text" name="train.starttime" /> 
				</td>
			</tr>
			<tr>
				<td>到站时间</td>
				<td>
					<input type="text" name="train.endtime" /> 
				</td>
			</tr>
		</table>
		时间格式：例子 2014-12-02 22:54:37.0<br>
		<input type="submit" value="提交按钮" />
		<input type="reset" value="重置按钮" />
	</form>
</body>
</html>
