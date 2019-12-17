<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="/register.do" id="frm">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
				
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="pass"></td>
			</tr>
			
			<tr>
				<td>재비밀번호</td>
				<td><input type="text" name="repass"></td>
			</tr>
			
			<tr>
				<td><input type="button" value="취소"></td>
				<td><input type="button" value="확인" id="regi"></td>
			</tr>
		</table>
	</form>
	
	
	<script>
		$(document).ready(function(){
				$("#regi").click(function(){
						$("#frm").submit();
					});
	
		});

	</script>
</body>
</html>