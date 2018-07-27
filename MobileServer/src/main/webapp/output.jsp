<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<title>Insert title here</title>
<script >
	$(document).ready(function() {
		
		$("#back").click(function() {
			$(location).attr("href","index.do");
		});
		
	})
</script>
<style type="text/css">
	div{
		box-sizing: border-box;
		border: 1px dotted black; 
	}
	
	#wrapper{
	width:100%;
	margin: 0px auto;
	}
	
	#div-writter input{
		width: 100%;
		box-sizing: border-box;
	}
	
	#div-contents textarea {
	text-align: center;
	width: 100%;
	height: 50%;
	margin-top:5px;
	box-sizing: border-box;
	resize: none;
	}
	
	#div-button{
		text-align: center;
	}
</style>
</head>
<body>

		<div id="wrapper">
			<div id="text">
			 	<c:forEach items="${list}" var="vals">
			 		<div>
			 		${vals.seq }
			 		${vals.writer }
			 		${vals.contents }
			 		</div>
			 	</c:forEach>
			</div>
			<button id="back" type="button">Back</button>
		</div>
</body>
</html>