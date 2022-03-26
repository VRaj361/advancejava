<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="hi"></c:out>	
	<c:out value="${param.fname}"></c:out>
	<c:set var="selectfruit" value="${param.fruit}"></c:set>
	<c:out value="${selectfruit}"></c:out>
	<c:if test="${selectfruit=='mango' }">
		<c:out value="I like it "></c:out>
	</c:if>
	<c:choose>
		<c:when test="${selectfruit=='mango' }">
			<c:out value="I like it MANGO AGAIN"></c:out>
		</c:when>
		<c:when test="${selectfruit=='grapes' }">
			<c:out value="I like it grapes AGAIN"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="I like it all AGAIN"></c:out>
		</c:otherwise>
	</c:choose>
	
	<c:forEach begin="1" end="10" var="i" step="2"><!-- increment of two element -->
		<c:out value="${i}"></c:out>
	</c:forEach>
	
<%-- 	<c:redirect url="StandardActionTagColl.jsp">
		<c:param name="username" value="adminuser"/>
	</c:redirect>
--%>

	<c:set var="name" value="abc:pqr:xyz"/>
	<c:forTokens items="${name}" delims=":" var="name1">
		<c:out value="${name1}"></c:out>
	</c:forTokens>
	
	
	<c:import url="Signup.html"></c:import>
</body>
</html>