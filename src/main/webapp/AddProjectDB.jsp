<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddProjectServlet">
		Title <input type="text" name="title"><br><br>
		Description<input type="text" name="description"><br><br>
		<input type="submit" value="submit">
	</form>
	<a href="ListProjectServletDB">List all projects</a>
	<a href="SearchProject.jsp">Search</a>
	<a href="UpdatejspDB.jsp">Update Data</a>
	
</body>
</html>