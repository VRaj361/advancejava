<%@page import="com.bean.AddProjectBeanDB"%>
<%@page import="java.util.ArrayList"%>
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
				<th>Action</th>
			</tr>
			
			<%
			
				for(AddProjectBeanDB b:project){
			%>
			<tr>
				<th><%= b.getProjectId()%></th>
				<th><%=b.getTitle() %></th>
				<th><%=b.getDescription() %></th>
				<th><a href="DeleteProjectDBServlet?projectId=<%=b.getProjectId() %>">delete</a>
				|<a href="UpdateServletDB?projectId=<%=b.getProjectId() %>">edit</a>
				
				</th>
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