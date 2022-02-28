<%@page import="java.util.spi.LocaleServiceProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%  String emailError=(String)request.getAttribute("emailError");
		String passError=(String)request.getAttribute("passError");
		String passCError=(String)request.getAttribute("passCError");
		String email=(String) request.getAttribute("emailValue");
		session.setAttribute("emailVal",email );
	%>
	
	
	
	<form action="ProHotel1" method="post" >
		<h1>Signup</h1>
		
		Email <input type="text" name="emailpro" value="<%=email==null?"":email%>"><%=emailError==null ? "":emailError %><br>
		Password <input type="password" name="password"><%=passError==null?"":passError %><br>
		
		<input type="submit" value="submit">
		<br>
		
		<%= passCError==null?"":passCError %>
	</form>
</body>
</html>