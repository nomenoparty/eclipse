<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Username : ${user.name }</h1>
	<h2>Password: ${user.password }</h2>
	
	<c:forEach var="item" items = "${collection}" >
		<p>${item}</p>
	</c:forEach >
	
</body>
</html>