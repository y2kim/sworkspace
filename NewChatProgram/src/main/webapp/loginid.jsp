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
<style >
	div{
    	box-sizing: border-box;
  	  }
    
    #wrapper{
    		width:100%;
    		height: 100vh; 
    		/* vh  %    1/1000   */
    		/*  높이는 퍼센테이지를 먹을수 없다  */
    	}
    
    #loginform{
    	text-align: center;
    	align-content: center;
    }
    #alienlogin{
    	margin-top: 20%;
    }
    
</style>

</head>
<body>
	<div id="wrapper" class="alert alert-success">
		<div id="loginform" class="formit">
			<div id="alienlogin">
				<form action="chat.do" method="post">
				<input type="text" name="nickname" id="names"> <br>
				<button  id="formnick">send</button>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		
	</script>
</body>
</html>