<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="AddCookieBasic" method="post">
		Cookie name<input type="text" placeholder="cookie name" name="cookiename"><br>
		Cookie value<input type="text" placeholder="cookie value" name="cookievalue"><br>
		<input type="submit" value="submit"><br><br>
		${cookieError}
	</form>
	<a href="PrintAllCookieBasic">PrintAllCookie<br>
	
</body>
</html>