<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<title>글쓰기</title>
	</head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		
	<body>
		<form method = "post" action="/tempStore" id="frm"> 
			<p><label>EMPNO</label><input type="text" name ="empno"></p>
			<p><label>사원이름</label><input type="text" name ="ename"></p>
			<p><label>직업</label><input type="text" name="job" size="15">
			
			</p>
			<label>MGR</label><p>
			<input type="text" name ="mgr"><p>
			<label>연봉</label><p>
			<input type="radio" name="sal" value="2">파랑
			<input type="radio" name="sal" value="3">빨강
			<input type="radio" name="sal" value="4">노랑
			
			<button type = "submit">등록</button>
			<button type = "button" id="temp">임시저장</button>
			<button type = "submit">취소</button>
		</form>
		
		<script>
			$(document).ready(function(){
				$("#temp").click(function(){
					$("#frm").submit();
				});
			});
		</script>
	</body>
</html>

