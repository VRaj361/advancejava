<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql_rt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource driver="org.postgresql.Driver" password="12345678"
		url="jdbc:postgresql://localhost:5432/advancejava" var="DB"
		user="postgres" />
	<!-- this create every time -->

	<sql:transaction dataSource="${DB }">
		<sql:query var="query" >
		select * from projects where title=?;
		<sql:param value="vraj"></sql:param>
		</sql:query>
	</sql:transaction>
	<!-- use transaction so that you suppose to use one time and use many time -->
	<c:forEach items="${query.rows }" var="i">
		<c:out value="${i.projectid }"></c:out>
		<c:out value="${i.title }"></c:out>
		<c:out value="${i.description }"></c:out>
	</c:forEach>
	<sql:update var="upd" dataSource="${DB }">
		insert into projects values (14,'vrajfd','patfdel');
	</sql:update>
	<c:out value="${upd }"></c:out>
</body>
</html>