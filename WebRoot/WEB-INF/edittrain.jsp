<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>trainmgmt</title>
</head>

<body>
	<form action="edittrain.action" method="post">
		<table>
			<tr>
				<td>车次名称</td>
				<td>
					<input type="text" name="train.trainno" value="${train.trainno}"/>
				</td>
			</tr>
			<tr>
				<td>出发地点</td>
				<td>
					<input type="text" name="train.departure" value="${train.departure}" />
				</td>
			</tr>
			<tr>
				<td>到达地点</td>
				<td>
					<input type="text" name="train.arrive"  value="${train.arrive}" /> 
				</td>
			</tr>
			<tr>
				<td>开车时间</td>
				<td>
					<input type="text" name="train.starttime" value="${train.starttime}" /> 
				</td>
			</tr>
			<tr>
				<td>到站时间</td>
				<td>
					<input type="text" name="train.endtime" value="${train.endtime}" /> 
				</td>
			</tr>
		</table>
		<input type="hidden" name="train.TId" value="${trainId}" />
		<input type="submit" value="提交按钮" />
		<input type="reset" value="重置按钮" />
	</form>
</body>
</html>
