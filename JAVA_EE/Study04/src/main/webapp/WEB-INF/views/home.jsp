<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to MyBatis World!@!</h1>
<table>
<tr><th>사번</th><th>이름</th><th>급여</th><th>매니저이름</th></tr>
<c:forEach var="person" items="${worker}">
	<tr><td>${person.employee_id}</td><td>${person.emp_name}</td>
		<td>${person.salary}</td><td>${person.manager_name}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>