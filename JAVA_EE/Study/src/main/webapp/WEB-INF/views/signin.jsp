<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/viewuser" id=frmSignin>
<table>
<tr><td>로긴아이디</td><td><input type=text name=loginid></td></tr>
<tr><td>비밀번호</td><td><input type=password name=passcode1 id=passcode1></td></tr>
<tr><td>비밀번호확인</td><td><input type=password name=passcode2 id=passcode2></td></tr>
<tr><td>실명</td><td><input type=text name=name></td></tr>
<tr><td>모바일</td><td><input type=text name=mobile></td></tr>
<tr><td colspan=2 align=center><input type=submit value='회원가입' id=btnSubmit></td></tr>
</table>
</form>
<a href='/'>홈으로</a>&nbsp;&nbsp;&nbsp;<a href='/login'>로그인하기</a>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
/* .on('submit','#frmSignin',function(){
	if($('#passcode1').val()==$('#passcode2').val()){
		return true;
	} else {
		alert('비밀번호와 확인이 일치하지 않습니다.');
		return false;
	}
}) */
.on('click','#btnSubmit',function(){
	if($('#passcode1').val()==$('#passcode2').val()){
		$('#frmSignin').submit();
	} else {
		alert('비밀번호와 확인이 일치하지 않습니다.');
		return false;
	}
})
</script>
</html>