<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<title>Insert title here</title>
</head>
<body>
	<button id="ajaxdo">ajax!</button>
	<script type="text/javascript">
		$("#ajaxdo").click(function() {
			var val = "hello";
			
			$.ajax({
				
				url:"listcall.do",
				type:"post",
				data:{val:val},
				dataType : "json",
				success:function(response){
					console.log("AJAX Request 성공 ");
					console.log(response);
					//$("#response").text(response);
					
				},
				error:function(request,status,error){
					console.log(request.status+":"+status.responseText+":"+ error);
				},
				complete:function(){
					console.log("성공이건 실패건 어찌되었든 ajax 종료");
				}
			});
			
		})
	</script>
</body>
</html>