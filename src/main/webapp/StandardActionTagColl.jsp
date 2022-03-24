<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<!--<jsp:include page="StandardActionTagColl1.jsp"/>--!>
	<!-- jsp:include and jsp:forward -->
	<jsp:useBean class="com.bean.BeanUsingActionTagColl" id="bean"></jsp:useBean>
	<jsp:setProperty property="id" name="bean" value="12"/>
	<jsp:setProperty property="name" name="bean" value="fha"/>
	<jsp:getProperty property="id" name="bean"/>
	<jsp:getProperty property="name" name="bean"/>
	<!-- jsp:usebean must contain id and setproperty and getproperty must contain those id in name attribute  -->
	<!-- one class which extends applet method override (paint) Graphic interface in that argument DrawString method call -->
	<!--<jsp:forward page="StandardActionTagColl1.jsp">
		<jsp:param value="admin" name="useradmin"/>
	</jsp:forward>--!>
	<!-- jsp:param -->
	
</body>
</html>
 