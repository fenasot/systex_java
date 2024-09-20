<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="aform" action="ccController.do" method="post">
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
		<table style="margin: auto;">
			<thead><tr><td colspan="2" style="text-align: center; color: #c12463;">新增顧客</td></tr></thead>
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
						<div>生日</div>
					</td>		
					<td>
						<input type="date" name="birth" value="${ param.birth }"/>
					</td>
				</tr>
				<tr>
					<td>
						<div>性別</div>
					</td>		
					<td>
						<%
						String isMale = "";
						String isFemale = "";
						String gender = request.getParameter("gender");
						if(gender != null) {
							isMale = gender.equals("male") ? "checked" : "" ;
							isFemale = gender.equals("female") ? "checked" : "";
						}
						%>
						<input type="radio" name="gender" value="male" <%= isMale %>/> 男
						<input type="radio" name="gender" value="female" <%= isFemale %>/> 女
					</td>
				</tr>
				<tr>
					<td>
						<div>嗜好</div>
					</td>		
					<td>
						<%
						String musicSelected = "";
						String shoppingSelected = "";
						String readingSelected = "";
						String[] habits = request.getParameterValues("habits");
						
						if(habits != null) {
							for(String habit : habits) {
								if(habit.equals("music")) {
									musicSelected = "checked";
								}
								if(habit.equals("shopping")) {
									shoppingSelected = "checked";
								}
								if(habit.equals("reading")) {
									readingSelected = "checked";
								}
							}
						}
						%>

						<input type="checkbox" name="habits" value="music" <%= musicSelected %>/> 聽音樂
						<input type="checkbox" name="habits" value="shopping" <%= shoppingSelected %>/> 逛大街
						<input type="checkbox" name="habits" value="reading" <%= readingSelected %>/> 讀好書
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