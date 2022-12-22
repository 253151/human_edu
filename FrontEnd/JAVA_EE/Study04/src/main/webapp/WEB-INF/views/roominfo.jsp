<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Room Information</title>
</head>
<body>

<table id=tblRoom border=1>
<tr><th>객실번호</th><th>객실종류</th><th>객실명</th><th>숙박가능인원</th><th>1박요금</th></tr>
<c:forEach var="room" items="${roominfo}">
	<tr><td>${room.num}</td><td>${room.type}</td><td>${room.name}</td>
		<td>${room.howmany}</td><td>${room.howmuch}</td></tr>
</c:forEach>
</table>
<br><br>
<form id=frmRoom action="/controlRoomInfo">
<input type=hidden name=optype id=optype value='insert'>
<table border=1>
<tr><td>객실번호</td><td><input type=text name=num id=num readonly></td></tr>
<tr><td>객실명</td><td><input type=text name=name id=name></td></tr>
<tr><td>객실타입</td><td>
	<select id=type name=type>
		<c:forEach var="rtype" items="${rt}">
			<option value="${rtype.typenum}">${rtype.typename}</option>
		</c:forEach>	
	</select>
</td></tr>
<tr><td>숙박가능인원</td><td><input type=number name=howmany id=howmany></td></tr>
<tr><td>1박요금</td><td><input type=number name=howmuch id=howmuch></td></tr>
<tr><td colspan=2 align=center>
	<input type=button value='등록' id=btnAddNew>
	<input type=button value='삭제' id=btnDelete>
	<input type=button value='비우기' id=btnReset>
</td></tr>
</table>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#tblRoom tr',function(){
	$('#num').val($(this).find('td:eq(0)').text());
	$('#name').val($(this).find('td:eq(2)').text());
	$('#type').val($(this).find('td:eq(1)').text());
	$('#howmany').val($(this).find('td:eq(3)').text());
	$('#howmuch').val($(this).find('td:eq(4)').text());
	$('#optype').val('update');
	return false;
})
.on('click','#btnDelete',function(){
	if($('#num').val()=='')  return false;
	$('#optype').val('delete');
	$('#frmRoom').submit();
})
.on('click','#btnReset',function(){
	$('#num,#name,#type,#howmany,#howmuch').val('');
	$('#optype').val('insert');
	return false;
})
.on('click','#btnAddNew',function(){
	if( $('#name').val()=='') return false;
	$('#frmRoom').submit();
})
</script>
</html>