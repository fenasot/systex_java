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
	<form method="post" action="lottery">
		
		<table>
			<thead>
				<tr><td> ${ requestScope.errorMsg } </td></tr>
			</thead>
			<tbody>
				<tr>
					<td><label class="">請輸入欲限制的數字，範圍為1~49，超出範圍將直接忽略，最多可限制42個數字，並用,分開，可能出現重複的結果，範例(3,5,9,6)</label></td>
					<td><input class="form-control" name="numbers" value=""/></td>
				</tr>
				<tr>
					<td><label class="">請輸入要生成的組數，預設為2組</label></td>
					<td><input class="form-control" name="times" value=""></input></td>
				</tr>
				<tr>
					<td></td>
					<td><input class="btn btn-primary" type="submit" value="新增"/></td>
				</tr>
			</tbody>
		</table>
	</form>	
	
<jsp:include page="/templates/footer.jsp"></jsp:include>
</body>
</html>