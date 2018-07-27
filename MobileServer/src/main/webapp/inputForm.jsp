<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" 
    href="https://stackpath.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script> 
<title>Insert title here</title>
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
<script type="text/javascript">
$(document).ready(function() {
	
	$("#back").click(function() {
		$(location).attr("href","index.do");
	});
	
	$("#send").click(function() {
		$("#tospring").submit();
	})
	
})
</script>
</head>
<body>
	<div id="wrapper">
		<div id="div-input">
		<form action="inputProc.do" id="tospring" method="post">
			<input type="hidden" name="hidden" value="hidden" id="hidden">
			<div id="div-writter">
				<input type="text" placeholder="input writer" name="writer">
			</div>
			<div id="div-contents">
				<textarea  placeholder="input contents" name="contents"></textarea>
			</div>
			<div id="div-button">
				<button id="send" type="button">Send</button>
				<button id="back" type="button">Back</button>
			</div>
		</form>	
		</div>
	</div>
</body>
</html>