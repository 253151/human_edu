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
<tr><td>아이디</td><td><input type=text id=userid></td>
<tr><td>비밀번호</td><td><input type=password id=passcode></td>
<tr><td colspan=2 align=center><input type=button value='로그인' id=btnGo></td></tr>
</table>
</form>
<a href="/">홈으로</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/signin">회원가입</a>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#btnGo',function(){
	if($('#userid').val()=='' || $('#passcode').val()=='') {
		alert('아이디/비밀번호는 반드시 입력하십시오.');
		return false;
	}
	$.post('/checkuser',{userid:$('#userid').val(),passcode:$('#passcode').val()},function(data){
		if(data=='ok'){
			document.location="/";
		} else {
			alert('로그인 실패. 아이디와 비밀번호가 정확히 입력돼야 합니다.');
			$('#userid,#passcode').val('');
		}
	},'text');
	return true;
})
</script>
</html>