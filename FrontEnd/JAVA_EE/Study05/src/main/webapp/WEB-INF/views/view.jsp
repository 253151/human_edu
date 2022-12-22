<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 보기</title>
</head>
<body>
<table border=1>
<tr><td>게시물번호</td><td>${post.post_id}</td><tr>
<tr><td height=30>제목</td><td><label id=lblTitle>${post.title}</label></td></tr>
<tr><td>내용</td>
	<td valign=top width=500 height=600>${post.content}</td></tr>
<tr><td>작성자</td>
	<td><label id=lblWriter>${post.writer}</label></td></tr>
<tr><td>작성시각</td><td>${post.created}</td></tr>
<tr><td>수정시각</td><td>${post.updated}</td></tr>		
<tr><td colspan=2 align=right><a href='/'>목록보기</a></td></tr>
</table>
</body>
</html>