<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	

	<% String FirstName=(String)request.getAttribute("firstNameError"); 
	   String Email=(String)request.getAttribute("emailError");
	   String Password=(String)request.getAttribute("passwordError");
	   String Gender=(String)request.getAttribute("genderError");
	   
	   String firstNamevalue=(String)request.getAttribute("firstNameValue");
	   String emailValue=(String)request.getAttribute("emailValue");
	   String genderValue=(String)request.getAttribute("genderValue");
	  
	%>
	<form action="ValidationSignUp" method="post">
		FirstName:<input type="text" name="firstname"  value="<%=firstNamevalue==null?"":firstNamevalue %>"/>
		<%=FirstName == null ? "":FirstName %>
		<br>
		
		Email:<input type="email" name="email" value="<%=emailValue==null?"":emailValue%>"/>
		<%=Email==null?"":Email%><br>
		
		Password:<input type="password" name="password"/>
		<%= Password==null?"":Password %>
		<br>
		
		Gender  
		Male:<input type="radio" name="gender" value="male" <%= genderValue!=null&&genderValue.equals("male")?"checked":"" %>/>
		Female:<input type="radio" name="gender" value="female" <%= genderValue!=null&&genderValue.equals("female")?"checked":"" %>/>
		<%= Gender==null?"":Gender %>
		
		<br><input type="submit" value="SignUp">
	</form>
</body>
</html>