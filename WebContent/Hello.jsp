<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- 
	<%! int a = 2; %>
	
	<% int b = 4; %>

	<h1>Username : ${user.name }</h1>
	<h2>Password: ${user.password }</h2>
	
	
	--%>
	
	<form action='/servlet1' method='post'>
		<label for='username'>Username</label><br>
		<input type='text' name='username'><br>
		<label for='password'>Password</label><br>
		<input type='password' name='password'><br>
		<input type='submit' value='Login'><br>
	</form>
</body>
</html>