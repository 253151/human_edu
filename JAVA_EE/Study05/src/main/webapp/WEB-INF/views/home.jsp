<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<div id=dvHead style='width:100%'></div>
<table id=tblList border=1>
<h1>Welcome to my home !!</h1>
<tr><th>게시물번호</th><th width=200>제목</th><th>작성자</th><th>작성일</th><th>수정일</th><th>작업선택</th></tr>
<c:forEach var="post" items="${postlist}">
	<tr><td>${post.post_id}</td><td>${post.title}</td><td>${post.writer}</td>
		<td>${post.created}</td><td>${post.updated}</td><td><input type=button id=btnView value='보기'>
	<c:if test="${gUserid eq post.writer}">
		<input type=button id=btnUpdate value='수정'>
		<input type=button id=btnDelete value='삭제'>
	</c:if>
	</td>
	</tr>
</c:forEach>
</table>

</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	$.post('/logincheck',{},function(data){
		if(data=='') {
			str="<a href='/login'>로그인</a>&nbsp;&nbsp;<a href='/signin'>회원가입</a><br><br>";
		} else {
			str="<label>"+data+"</label>&nbsp;&nbsp;<label id=lblSignout>로그아웃</label><br><br>"
		}
		$('#dvHead').html(str);

		if(data!=''){
			$('body').append('<input type=button id=btnWrite value="글작성">');
		}
	},'text');
})
.on('click','#lblSignout',function(){
	$.post('/signout',{},function(data){
		if(data=='ok') {
			document.location="/";
		} else {
			alert('로그아웃 실패. 다시 시도하십시오.');
		}
	}, 'text');
})

.on('click','#btnWrite',function(){
	document.location='/write';
	return false;
})
.on('click','#btnView',function(){
	let ndx=$(this).parent().parent().index();
	let str=$('#tblList tr:eq('+ndx+') td:eq(0)').text();

	document.location='/view?post_id='+str;
	return false;
	
})

.on('click','#btnDelete',function(){
	let ndx=$(this).parent().parent().index();
	let str=$('#tblList tr:eq('+ndx+') td:eq(0)').text();
	
	document.location='/delete?post_id='+str;
	return false;
})

.on('click','#btnUpdate',function(){
	let ndx=$(this).parent().parent().index();
	let str=$('#tblList tr:eq('+ndx+') td:eq(0)').text();
	document.location='/update?post_id='+str;
	return false;
	
})
</script>
</html>