<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정하기</title>
</head>
<body >
<form action='/modify'>
<table>
	<tr><td>게시물번호<td>${post.post_id}</td></tr>
	<tr><td>제목</td><td><input width= 200 type=text id=modiTitle>${post.title}</td></tr>
	<tr><td>내용<textarea rows=10 cols=80 id=modiContent>${post.content}</textarea></td></tr>
	<tr><td>작성시각</td><td>${post.created}</td></tr>
	<tr><td>수정시각</td><td>${post.updated}</td></tr>
	<tr><td align=right><input type=button id=btnModify value=수정></td></tr>
	</table>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#btnModify',function(){
	
	
})
</script>
</html>