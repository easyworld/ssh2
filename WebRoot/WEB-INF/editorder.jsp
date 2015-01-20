<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>ordermgmt</title>
</head>
<script type="text/javascript">
	function putdata(){
		var UID_Select = document.getElementById("UID_Select");
		var TID_Select = document.getElementById("TID_Select");
		for(var i = 0; i < UID_Select.options.length;i++){
			if(UID_Select.options[i].value == '${order.user.UId}'){
				UID_Select.options[i].selected = true;
				break;
			}
		}
		for(var i = 0; i < TID_Select.options.length;i++){
			if(TID_Select.options[i].value == '${order.train.TId}'){
				TID_Select.options[i].selected = true;
				break;
			}
		}
	}
	window.onload = putdata;
</script>
<body>
	<form action="editorder.action" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td>
					<select name="order.user.UId" id="UID_Select" >
						<s:iterator value="userList" id="tempuser">
							<option value="${tempuser.UId}">${tempuser.username}</option>
						</s:iterator>
				</select>
				</td>
			</tr>
			<tr>
				<td>车次</td>
				<td>
					<select name="order.train.TId" id="TID_Select">
						<s:iterator value="trainList" id="temptrain">
							<option value="${temptrain.TId}">${temptrain.trainno}</option>
						</s:iterator>
					</select>
				</td>
			</tr>
			<tr>
				<td>车厢号</td>
				<td>
					<input type="text" name="order.carriageno" value="${order.carriageno}" /> 
				</td>
			</tr>
			<tr>
				<td>座位号</td>
				<td>
					<input type="text" name="order.seatno" value="${order.seatno}"/> 
				</td>
			</tr>
		</table>
		<input type="hidden" name="order.OId" value="${orderId}" />
		<input type="submit" value="提交按钮" />
		<input type="reset" value="重置按钮" />
	</form>
</body>
</html>
