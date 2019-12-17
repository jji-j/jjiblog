<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form method="get" action="/login.do" id="frm">
<input type="text" name="pass">비번
<input type="text" name="id">아이디
<input type="button" id="regi">
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