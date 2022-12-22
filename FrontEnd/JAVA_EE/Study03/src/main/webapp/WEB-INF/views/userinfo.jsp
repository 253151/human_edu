<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로긴아이디 : ${loginid }<br><br>
비밀번호: ${passcode }<br><br>
실명: ${name }<br><br>
모바일: ${mobile}<br><br>
<input type=button value='확인' id=btnOK>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#btnOK',function(){
	document.location="/login";
})
</script>
</html>