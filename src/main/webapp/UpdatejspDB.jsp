<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UpdateServletFinalDB">
		Title <input type="text" name="title" value="${project.title}"><br><br>
		Description<input type="text" name="description" value="${project.description}"><br><br>
		<input type="hidden" name="projectId" value="${project.projectId}"><br><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>