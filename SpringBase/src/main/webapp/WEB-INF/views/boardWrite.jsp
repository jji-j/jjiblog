<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<title>�۾���</title>
	</head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		
	<body>
		<form method = "post" action="/tempStore" id="frm"> 
			<p><label>EMPNO</label><input type="text" name ="empno"></p>
			<p><label>����̸�</label><input type="text" name ="ename"></p>
			<p><label>����</label><input type="text" name="job" size="15">
			
			</p>
			<label>MGR</label><p>
			<input type="text" name ="mgr"><p>
			<label>����</label><p>
			<input type="radio" name="sal" value="2">�Ķ�
			<input type="radio" name="sal" value="3">����
			<input type="radio" name="sal" value="4">���
			
			<button type = "submit">���</button>
			<button type = "button" id="temp">�ӽ�����</button>
			<button type = "submit">���</button>
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

