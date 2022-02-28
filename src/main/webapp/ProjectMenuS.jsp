<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Form</h1>
	<div>Please Select any one</div>
	<%
		String menuError=(String) request.getAttribute("menuError");
		String menugujrati=(String) request.getAttribute("menugujrati");
		String menupunjabi=(String) request.getAttribute("menupunjabi");
		
		String menu1Error=(String) request.getAttribute("menu1Error");
		Integer menugp=(Integer) request.getAttribute("menugp");
		String billamount=(String) request.getAttribute("billamount");
	%>
	
	<form action="ProjectMenu">
	
	
		Gujrati : <input type="radio" name="menu" value="gujrati" <%= menugujrati!=null&&menugujrati.equals("gujrati")?"checked":"" %> />
		Punjabi : <input type="radio" name="menu" value="punjabi" <%= menupunjabi!=null&&menupunjabi.equals("punjabi")?"checked":"" %> />
		<%=menuError==null?"":menuError %>
		<br>
		
		<input type="submit" value="Submit"/>
		<br>
		
	</form>
	
	<form action="ProjectMenu" style="display:none;<%="gujrati".equals(menugujrati)&&menugujrati!=null? "display:block":"display:none"%>">
		Roti and Sak<input type="radio" name="guj" value="rotisak" /> <span>Rs.120</span>	
		Dal bhat<input type="radio" name="guj" value="dalBhat" /> <span>Rs.110</span>
		qty<input type="text" name="qty"  placeholder="Enter the qty"><br>
		<input type="submit" value="Submit"/>
	</form>
	
	<form action="ProjectMenu"  style="display:none;<%="punjabi".equals(menupunjabi)&&menupunjabi!=null? "display:block":"display:none"%>">
		Subji and naan<input type="radio" name="guj" value="sabjinaan" /> <span>Rs.130</span>
		JeeraRice and DalFry<input type="radio" name="guj" value="jeeradalfry" /> <span>Rs.150</span>
		qty<input type="text" name="qty" placeholder="Enter the qty"><br>
		<input type="submit" value="Submit"/>
	</form>
	

	<div><%=menugp!=null?menugp:"" %></div>
	<div><%=billamount!=null?billamount:"" %></div>
	
	
	<br>
	<!--  <input type="submit" value="Submit"/>-->
</body>
</html>