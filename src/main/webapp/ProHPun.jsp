<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String errorPun= (String)request.getAttribute("errorPun");%>
	<h1>Punjabi Menu</h1>
	<form action="ProhPun" method="post">
		
		Roti -> 20 Rs<input type="checkbox" name="pun" value="roti:20"><br><br>
		sabji -> 100 Rs<input type="checkbox" name="pun" value="sabji:100"><br><br>
		Jeerarice -> 110 Rs<input type="checkbox" name="pun" value="jeeraricedalfry:110"><br><br>
		Biryani -> 80 Rs<input type="checkbox" name="pun" value="biryani:80"><br><br>
		Veg kadae -> 130 Rs<input type="checkbox" name="pun" value="vegsabji:130"><br><br>
		
		<input type="submit" value="submit">
		<%=errorPun==null?"":errorPun %>
		
	</form>
</body>
</html>