<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
    <link rel="stylesheet" 
    href="https://stackpath.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <style>
    
    	#wrapper{
    		width:100%;
    		height: 100vh; 
    		/* vh  %    1/1000   */
    		/*  높이는 퍼센테이지를 먹을수 없다  */
    	}
    	#menu{
    	 	text-align: center;
    	 	margin-top: 250px;
    	}
    	
    </style>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script> 
    <script>
    	$(document).ready(function() {
    		$("#toInput").click(function() {
    			//Android.href("inputForm.jsp");
    			$(location).attr("href","inputForm.jsp"); //크롬이 켜짐  앱이 꺼지고
    		})
    		$("#toOutput").click(function() {
    			//Android.href("inputForm.jsp");
    			$(location).attr("href","output.do"); //크롬이 켜짐  앱이 꺼지고
    		})
    	})
    </script>
</head>
<body>
	<div id="wrapper" class="alert alert-success">
		<div id="menu">
			<button id="toInput" class="btn btn-primary">toInput</button>
			<button id="toOutput" class="btn btn-primary">toOutput</button>
		</div>
	</div>
</body>
</html>