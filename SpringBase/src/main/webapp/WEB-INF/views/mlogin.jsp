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
아이디<input type="text" name="id">
비번<input type="text" name="pass">
<input type="button" id="regi" value="로그인">

</form>




<script>
	$(document).ready(function(){
		$("#regi").click(function(){
			$("#frm").submit();
		});
		var fail = ${fail};
		if(fail==1){
			alert("로긴실패");
		}
		
	});
</script>
</body>
</html>