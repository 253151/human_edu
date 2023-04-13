<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글 작성</title>
</head>
<body>
<form id=frmInsert method=post action="/insert"></form>
<table>
<!-- <tr><td>게시물번호</td><td><label id=lblPost_id></label></td></tr> -->
<tr><td>제목</td><td><input type=text name=title id=title></td></tr>
<tr><td>내용</td><td valign=top><textarea id=content name=content rows=10 cols=80 required></textarea></td></tr>
<tr><td colspan=2 align=right><input type=submit id=submit value='등록'>&nbsp;<input type=reset id=reset value='비우기'></td></tr>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)

.on('click','#submit',function(){
	console.log($('#title').val()+","+$('#content').val());
	$.post('/insert',{title:$('#title').val(),content:$('#content').val()},function(data){
	document.location='/';
	console.log("ok/");
	return false;
	}, 'text');

})

.on('click','#reset',function(){
	$('#title,#content').val('');
	return false;
})
</script>
</html>