<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/templates/header.jsp"></jsp:include>
</head>
<body>
	
	 <%--@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" --%>
	 
	 
	<% ArrayList<int[]> result = (ArrayList<int[]>)request.getAttribute("result"); %>
	<% int count = 1; %>
	<form action="lottery" method="post">
		<input type="hidden" name="times" value="${ requestScope.times }" readonly="readonly"/>
		<input type="hidden" name="numbers" value="${ requestScope.excludeNums }" readonly="readonly"/>
		<table>
			<thead>
				<tr><th>總生成組數: ${ requestScope.times } 組</th></tr>
				<tr><th>排除的數字: ${ requestScope.excludeNums } </th></tr>
			</thead>
			<tbody>
<%--
			 	<c:forEach var="nums" items=${ requestScope.result }>
				 	<tr>
						<td>第 ${ count } 組</td>
						<td>
							<c:forEach var="num" items="${ nums }">
								${ num }
							</c:forEach>
						</td>
					</tr>	
			 	</c:forEach>
--%>
				<% for(int[] nums : result) { %>
				<tr>
					<td>第 <%= count %> 組</td>
					<td>
						<% for(int num : nums) { %>
							<%= num %>				
						<% } %>
					</td>
					
				</tr>
				<% count++; %>
				<% } %>
				<tr>			
					<td><input class="btn btn-primary" type="submit" value="再來一次"/></td>
					<td><a href=""><input class="btn btn-primary" type="button" value="返回"/></a></td>
				</tr>
	
			</tbody>
		</table>
	</form>
	<jsp:include page="/templates/footer.jsp"></jsp:include>
</body>
</html>