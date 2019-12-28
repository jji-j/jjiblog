<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<!DOCTYPE html> 
<html>
<head>
<title></title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<form method ="post" action="tt">

<p><label>Á¦¸ñ</label><input type="text" name ="bno"></p>
<input type="button" id="regi">
</form>

        <c:forEach items="${TestVO}" var="TestV">  
	  
		${TestV.title}
		 ${TestV.bno}
		  ${TestV.content}
		   ${TestV.writer}
		    ${TestV.regdate}
		     ${TestV.viewcnt}
		    
	 </c:forEach>
	
	
	<script>
		$(document).ready(function(){
				$("#regi").click(function(){
						$("#frm").submit();
					});
	
		});

	</script>
</body>
</html>

