<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="aform" action="admin/dump.view" method="get">
		<table style="margin: auto;">
			<thead><tr><td colspan="2" style="text-align: center; color: #c12463;">新增顧客</td></tr></thead>
			<tbody>
				<tr>
					<td>
						<div>姓名</div>
					</td>		
					<td>
						<input type="text" name="name"/>
					</td>
				</tr>
				<tr>
					<td>
						<div>電郵</div>
					</td>		
					<td>
						<input type="email" name="email"/>
					</td>
				</tr>
				<tr>
					<td>
						<div>電話</div>
					</td>		
					<td>
						<input type="text" name="telephone"/>
					</td>
				</tr>
				<tr>
					<td>
						<div>地址</div>
					</td>		
					<td>
						<input type="text" name="address"/>
					</td>
				</tr>
				<tr>
					<td>
						<div>生日</div>
					</td>		
					<td>
						<input type="date" name="birth"/>
					</td>
				</tr>
				<tr>
					<td>
						<div>性別</div>
					</td>		
					<td>
						<input type="radio" name="gander" value="male"/> 男
						<input type="radio" name="gander" value="female"/> 女
					</td>
				</tr>
				<tr>
					<td>
						<div>嗜好</div>
					</td>		
					<td>
						<input type="checkbox" name="habit" value="music"/> 聽音樂
						<input type="checkbox" name="habit" value="shopping"/> 逛大街
						<input type="checkbox" name="habit" value="reading"/> 讀好書
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