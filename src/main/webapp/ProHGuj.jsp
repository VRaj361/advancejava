<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% String errorGuj= (String)request.getAttribute("errorGuj");%>
	<h1>Gujrati Menu</h1>
	<form action="ProhGuj" method="post">
		
		Rotlo -> 120 Rs<input type="checkbox" name="guj" value="rolto:120"><br><br>
		Odo -> 100 Rs<input type="checkbox" name="guj" value="odo:100"><br><br>
		DalBhat -> 110 Rs<input type="checkbox" name="guj" value="dalbhat:110"><br><br>
		SavTamata nu sak -> 80 Rs<input type="checkbox" name="guj" value="sak:80"><br><br>
		Bhakhri -> 20 Rs<input type="checkbox" name="guj" value="bhakhri:20"><br><br>
		
		<input type="submit" value="submit">
		<%=errorGuj==null?"":errorGuj %>
		
	</form>
</body>
</html>