<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Page 2</h1>
	<%--<%=//request.getParameter("useradmin") --%>
	<jsp:element name="book">
		<jsp:attribute name="author">Dhiraj Sir</jsp:attribute>
		<jsp:body>He written very nice book</jsp:body>
	</jsp:element>
	<!-- jsp:element only jsp:body can show in the browser -->
</body>
</html>