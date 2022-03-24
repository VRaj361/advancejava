<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.servlet.http.Cookie" errorPage="ErrorImplicitObjectColl.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- out,request,response,session,exception,config,application,page,pagecontext -->
	<!-- implicit object -->
	<% 	out.println("Hello babaji"); //out
		out.println(request.getParameter("name"));//request	
		Cookie c=new Cookie("username","chaman");
		response.addCookie(c);//response
		out.println(session.isNew());//session
		application.setAttribute("username", "chaman");//context
		out.println(application.getAttribute("username"));
		//this is for servlet context
		out.println(config.getServletContext());	//config
		double er=1/0;//which is redirect on ErrorImplicitObjectColl.jsp 
				//do errorPage tag and make iserrorpage true on the other side
	%>
</body>
</html>