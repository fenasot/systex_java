<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>遊樂場</title>
<jsp:include page="/templates/header.jsp"></jsp:include>
</head>
<body>
	<% String user = (String)session.getAttribute("user"); %>
	<h1>Welcome To My Spring Boot Playground</h1>
	<% if(user != null && !user.equals("")) { %>
	<h2>歡迎您， ${ sessionScope.user }</h2>
	<p><a href="<%= request.getContextPath() %>/login/logout">登出</a></p>
	<% } else { %>
	<h2>您還尚未登入，請先登入後才可進行遊戲</h2>
	<p><a href="<%= request.getContextPath() %>/login">登入</a></p>
	<% } %>
	

	
	<p><a href="<%= request.getContextPath() %>/lottery">大樂透</a></p>

	<jsp:include page="/templates/footer.jsp"></jsp:include>
</body>
</html>