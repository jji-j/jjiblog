<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
    
<!DOCTYPE html> 
<html>
<head>
<title>�Խ��� ���</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>

	<form action = "regist" method = "get">
	<c:if test="${id!='�α����ʿ�'}">
		${fn:length(list)}��
	</c:if>
	
	<table border="1" width="880">
        <tr>
	        <td width="77">
	            <p align="center">�����ȣ</p>
	        </td>
	        
	        <td width="327">
	            <p align="center">����̸�</p>
	        </td>
	
	        <td width="197">
	            <p align="center">����</p>
	        </td>
	
	        <td width="155">
	            <p align="center">MGR</p>
	        </td>
	
	        <td width="90">
	            <p align="center">�ӽ����忩��</p>
	        </td>
	        
	        <td>
	        	<p align="center">����</p>
	        </td>
	        
        </tr>
    
        
        <c:choose>
			<c:when test="${fn:length(list)==0}">
				<tr>
					<td colspan="5" align="center">�����Ͱ� �����ϴ�.</td>
				</tr>
			</c:when>
			
			<c:when test="${fn:length(list)>0}">
				<c:forEach items="${list}" var="card">
				
					<tr>
						
							<td>${card.EMPNO}</td>
							<td><a href="/tempRead?EMPNO=${card.EMPNO}">${card.ENAME}</a></td>
							<td>${card.JOB}</td>
							<td>${card.MGR}</td>
							<td>
								<c:if test="${card.SIGNAL==1}">
									�����
								</c:if>
								<c:if test="${card.SIGNAL==0}">
									�ӽ�����
								</c:if>
							</td>
							<td>${card.SAL}</td>
						
						
					</tr>
				</c:forEach>
			</c:when>
       	</c:choose>
	
		<tr>
		<c:if test="${id!='�α����ʿ�'}">
			${id}�� ȯ���մϴ�.
		</c:if>
		</tr>

    </table>

     <input type = "button" value="�۾���" style="display:none;" id="write">
     <input type = "button" value="�α���" id="login">
     <a href="/memberRegist"><input type = "button" value="ȸ������"></a>

    </form>
</body>


	<script>
		$(document).ready(function(){
			$("#login").click(function(){
				location.href = "mLogin";
			});

			var id = ${id};
			if(id!="�α����ʿ�"){
				$("#write").show();
			}

			$("#write").click(function(){
				location.href = "boardWrite";
			});
			
		});
	</script>

</html>

