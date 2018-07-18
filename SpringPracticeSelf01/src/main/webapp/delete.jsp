<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<title>Insert title here</title>
</head>
<body>
		<form action="deleteProc.do" method="get" >
			<div id="div-writter">
				<input type="text" placeholder="귀찮으니 삭제할 번호를 적으쉬오" name="seq">
				<button>삭제</button>
			</div>
		</form>
		<a href="index.do">귀찮은 돌아가기</a>
</body>
</html>