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
		if(session.isNew()){
			out.println("First time visited");
		}
		Integer count=(Integer)session.getAttribute("count");
		if(count==null){
			count=new Integer(0);
			session.setAttribute("count", ++count);
			out.println("count of first condition would be "+count);
		}else{
			session.setAttribute("count", ++count);
			out.println("count of second condition would be "+count);
		}
	
	%>
</body>
</html>