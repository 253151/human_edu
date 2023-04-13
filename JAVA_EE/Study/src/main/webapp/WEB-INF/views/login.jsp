<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/checkuser">
<table>
<tr><td>아이디</td><td><input type=text name=userid></td>
<tr><td>비밀번호</td><td><input type=password name=passcode></td>
<tr><td colspan=2 align=center><input type=submit value='로그인'></td></tr>
</table>
</form>
<a href="/">홈으로</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/signin">회원가입</a>
</body>
</html>