<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" 
    href="https://stackpath.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script> 
<title>Insert title here</title>
    <style>
    div{
    	box-sizing: border-box;
    }
    
    	#wrapper{
    		width:100%;
    		height: 100vh; 
    		/* vh  %    1/1000   */
    		/*  높이는 퍼센테이지를 먹을수 없다  */
    	}
    	#talk{
    		width:100%;
    		
    	}
    	
    	#textmsg{
    		width:100%;
    		position: absolute;
    		bottom: 0;
    	}
    	
    	#textline{
    		width: 70%;
    		height: 30px;
    	}
    	#send{
    		width: 20%;
    		text-align: center;
    	}
    	
    	#talkmag{
    		width: 100%;
    		height: 80%;
    	}
    	
    	#msgtalk {
    		width: 100%;
    		height: 60vh;
    	}
    	
    </style>
    
   
</head>
<body>

	<div id="wrapper" class="alert alert-success">
		<div id="talk" class="talkmag">
			<textarea rows="" cols="" id="msgtalk" style="resize: none;" readonly="readonly">
					
			</textarea>
		</div>
		<div id="textmsg" class="tm ">
		 <input type="text" id="textline" placeholder="채팅을 입력하시오. "> 
		 <input onclick="sendMessage()" value="send" type="button" id="send" class="btn btn-primary" >
		</div>
	</div>
	
	
	
	<script type="text/javascript">
	 var webSocket = new WebSocket('ws://localhost:8080/socket/ws'); 
	 var ar =  ${names};
	 alert(ar);
	 webSocket.onopen = function(message) {prosessOpen (message)};
	 webSocket.onerror = function(message) {prosessError (message)};
	 webSocket.onclose = function(message) {prosessClose (message)};
	 webSocket.onmessage = function(message) {prosessMessage (message)};
     //alert(p
     
	 function prosessOpen(message) {
		 msgtalk.value += "Server connect....\n";
	}
	 function prosessClose(message) {
		 msgtalk.value += "Server Disconnect....\n";
	}
	 function prosessMessage(message) {
		 msgtalk.value += "Recieve From Server = > "+message.data+"\n";
	}
	 function prosessError(message) {
		 msgtalk.value += "error....\n";
	} 
	 function disconnect() {
		webSocket.close();
	} 
	 function sendMessage() {
		var message = $("#textline").val();
		webSocket.send($("#textline").val());
		$("#textline").text("");
		//webSocket.send("abc");
		//$("#text").html("");
	 }
		 
    </script>
	
</body>
</html>