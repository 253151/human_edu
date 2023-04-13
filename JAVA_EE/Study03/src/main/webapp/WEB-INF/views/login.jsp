<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/checkuser" id=frmLogin>
<table>
<tr><td>아이디</td><td><input type=text name=userid id=userid></td>
<tr><td>비밀번호</td><td><input type=password name=passcode id=userid></td>
<tr><td colspan=2 align=center><input type=submit value='로그인'></td></tr>
</table>
</form>
<a href="/">홈으로</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/signin">회원가입</a>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('submit','#frmLogin',function(){
	if($('loginud').val()=='' || $('#userid').val()=='' || $('#mobile').val=='') {
		alert('빈 값은 허용되지 않습니다');
		return false;
})
</script>
</html>