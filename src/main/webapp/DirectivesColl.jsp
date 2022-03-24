<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
    <!-- page is one of directives  -->
    <!-- three type of directives which is page,include,taglib -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Signup.html" %>	
	<!-- include directives use  -->
	<%=new Date() %>
	
</body>
</html>