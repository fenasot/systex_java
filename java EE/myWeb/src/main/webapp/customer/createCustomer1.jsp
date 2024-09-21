<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增顧客(1)</title>
</head>
<body>
	<form id="aform" action="createCustomer" method="post">
		<% LinkedList<String> errors = (LinkedList<String>)request.getAttribute("errors"); %>
		<% if(errors != null) { %>
			<ul style="color: red; font-size: 10px;">
				<table border="0" style="margin: auto; text-align: left">
					<% for(String error : errors) { %>
					<tr><td><li> <%= error %> </li></td></tr>
					<% } %>
				</table>
			</ul>
		<% } %>
		<input type="hidden" name="action" value="cc1"/>
		<table style="margin: auto;">
			<thead><tr><td colspan="2" style="text-align: center; color: #c12463;">新增顧客(1)</td></tr></thead>
			<tbody>
				<tr>
					<td>
						<div>姓名</div>
					</td>		
					<td>
						<input type="text" name="name" value="${ param.name }"/>
					</td>
				</tr>
				<tr>
					<td>
						<div>電郵</div>
					</td>		
					<td>
						<input type="email" name="email" value="${ param.email }"/>
					</td>
				</tr>
				<tr>
					<td>
						<div>電話</div>
					</td>		
					<td>
						<input type="text" name="telephone" value="${ param.telephone }"/>
					</td>
				</tr>
				<tr>
					<td>
						<div>地址</div>
					</td>		
					<td>
						<input type="text" name="address" value="${ param.address }"/>
					</td>
				</tr>
			
				<tr>
					<td>
						<div></div>
					</td>		
					<td>
						<input type="reset" value="重設"/>
						<input type="submit" value="新增"/>
					</td>
				</tr>				
			</tbody>
		</table>
	</form>
</body>
</html>