<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<style>
.fileDrop{

	width:100%;
	height:200px;
	border:1px dotted blue;

}

small{
	
	margin-left:3px;
	font-weight:bold;
	color:gray;

}

</style>
</head>
<body>
	<h3>Ajax File Upload</h3>
	<div class="fileDrop"></div>
	
	<div class="uploadList"></div>
	
	<script>
		$(".fileDrop").on("dragenter dragover", function(event){
			event.preventDefault();

			var files = event.originalEvent.dataTransfer.files;

			var file = files[0];

			console.log(file);

			var formData = new FormData();

			formData.append("file",file);

			$.ajax({
				url:"/uploadAjax",
				data:formData,
				dataType:"text",
				processData:false,
				contentType:false,
				type:'POST',
				success:function(data){
						alert(data);
					}




				});
				
			
			});

		$(".fileDrop").on("drop", function(event){

			event.preventDefault();
			});
			
	</script>
</body>
</html>