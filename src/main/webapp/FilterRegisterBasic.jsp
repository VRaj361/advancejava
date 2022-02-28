<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="FilterRegisterServlet" method="post">
		Firstname <input type="text" name="firstname"><br>
		Email <input type="text" name="email"><br>
		Password <input type="password" name="password"><br>
		<br>
		<input type="submit" value="Submit"><br><br>
		${firstNameError}<br>
		${emailError}<br>
		${passwordError}<br>
	</form>
	
	
</body>
</html>