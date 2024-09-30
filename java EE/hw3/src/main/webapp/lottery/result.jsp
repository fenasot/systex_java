<%@page import="java.util.Arrays"%>
<%@page import="java.util.stream.Collectors"%>
<%@page import="java.text.Collator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../resources/jsp/header.jsp" />
</head>
<body>
	<%
		String excludeNums = (String)request.getAttribute("excludeNums");
		int times = (int)request.getAttribute("times");
		
		@SuppressWarnings("unchecked") 
		ArrayList<int[]> allNums = (ArrayList<int[]>)request.getAttribute("allNums");

		ArrayList<String> strAllNums = new ArrayList<String>();
		for(int[] nums : allNums) {
			String strNums = Arrays.stream(nums)
					.mapToObj(String::valueOf)
					.collect(Collectors.joining(", "));
			strAllNums.add(strNums);
		}
		
		int cnt = 1;
	%>

	<div class="container-fluid">
		<table class="">
			<tbody>
				<tr>
					<td>排除的數字</td>
					<td><%= excludeNums %></td>
				</tr>
				<tr>
					<td>生成組數</td>
					<td><%= times %></td>
				</tr>
				<% for(String i : strAllNums) { %>
				<tr>
					<td>第<%= cnt %>組</td>
					<td><%= i %></td>
				</tr>
				<% 
					cnt++;
				} 
				%>
			</tbody>
		</table>
	</div>
	<jsp:include page="../resources/jsp/footer.jsp" />

</body>
</html>