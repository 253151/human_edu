<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
</head>
<body>
<!--  <form action="/viewuser" id=frmSignin> -->
<table>
<tr><td>로긴아이디</td><td><input type=text id=loginid>&nbsp;
	<input type=button id=btnDuplicate value='중복확인'>
	<input type=hidden id=bDuplicate></td></tr>
<tr><td>비밀번호</td><td><input type=password id=passcode1></td></tr>
<tr><td>비밀번호확인</td><td><input type=password id=passcode2></td></tr>
<tr><td>실명</td><td><input type=text id=name></td></tr>
<tr><td>모바일</td><td><input type=text id=mobile></td></tr>
<tr><td colspan=2 align=center><input type=button value='회원가입' id=btnSubmit></td></tr>
</table>
<!-- </form>  -->
<a href='/'>홈으로</a>&nbsp;&nbsp;&nbsp;<a href='/login'>로그인하기</a>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#btnDuplicate',function(){
	if($('#loginid').val()=='') return false;
	
	$.post('/checkDup',{loginid:$('#loginid').val()}, function(data){
		if(data=='1'){
			alert('이미 사용중인 아이디입니다.');
		} else {

			alert('사용가능한 아이디 입니다.');
			$('#bDuplicate').val('ok');
		}
	},'text')
})

.on('click','#btnSubmit',function(){
	if($('#loginid').val()=='' || $('#name').val()=='' || $('#mobile').val=='') {
		alert('빈 값은 허용되지 않습니다');
		return false;
	}
	if($('#bDuplicate').val()!="ok"){
		alert('중복확인하십시오');
		return false;
	}
	if($('#passcode1').val()!=$('#passcode2').val()){
		
		alert('비밀번호와 확인이 일치하지 않습니다.');
		return false;
	}
	if($('#passcode1').val()==$('#passcode2').val()){
		

	$.post("/viewuser",{loginid:$('#loginid').val(),passcode1:$('#passcode1').val(),
		name:$('#name').val(),mobile:$('#mobile').val()},function(data){
			if(data=='ok'){
				document.location='/login';
			} else {
				alert('회원가입 실패');
				$('#loginid,#passcode1,#passcode2,#name,#mobile,#bDuplicate').val('');
			}
		},'text');
	}
})
</script>
</html>