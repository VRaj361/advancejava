<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 	Integer menugp=(Integer) request.getAttribute("menugp");
		String billamount=(String) request.getAttribute("billamount");
		
	%>
	<div>Total Bill</div>
	<div><%=menugp!=null?menugp:"" %></div>
	<div><%=billamount!=null?billamount:"" %></div>
</body>
</html>