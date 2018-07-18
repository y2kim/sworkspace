<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
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
		
		$("#send").click(function() {
			$("#modify").submit();
		})
		
	})
</script>
<style type="text/css">
	div{
		box-sizing: border-box;
		border: 1px dotted black; 
	}
	
	#wrapper{
	width:300px;
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
		<div id="div-input">
		<form action="updateProc.do" method="post" id="modify">
			<input type="text" placeholder="귀찮으니 수정할 번호를 적으쉬오" name="seq">
			<input type="text" placeholder="input writer" name="writer">
			<textarea  placeholder="input contents" name="contents"></textarea>
				<button id="send" type="button">Send</button>
				<button id="back" type="button">Back</button>
		</form>
		</div>
	</div>
	
</body>
</html>