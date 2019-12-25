<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
iframe{
	width:0px;
	height:0px;
	border:0px	
	
	
}

</style>
</head>
<body>
	<h1>파일 업로드</h1>
	
	<form action="upload" method="post" enctype="multipart/form-data" id="form1" target="zeroFrame">
	    <input type="file" name="file"  /><br/>
	    <input type="submit" value="업로드">
	</form>

	<iframe>
		function addFilePath(msg){
			alert(msg);
			document.getElementById("form1").reset();
			}
	
	</iframe>

</body>
</html>