<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.AddProjectBeanDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<AddProjectBeanDB> project=(ArrayList<AddProjectBeanDB>)request.getAttribute("project");
	
	%>
	
	<br><br>
	<a href="AddProjectDB.jsp">home</a>
	<br>
	
	
	<%
		if(project.size()==0){
	%>
	no record found
	<%
		}else{
	%>
		<table border="1">
		
			<tr>
				<th>ProjectId</th>
				<th>Title</th>
				<th>Description</th>
				
			</tr>
			
			<%
			
				for(AddProjectBeanDB b:project){
			%>
			<tr>
				<th><%= b.getProjectId()%></th>
				<th><%=b.getTitle() %></th>
				<th><%=b.getDescription() %></th>
				
			</tr>
			<%
			
				}
			%>
		</table>
	<%
	
		}
	%>
</body>
</html>