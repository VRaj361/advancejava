<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set value="HIHELLOHOW" var="str"></c:set>
	<c:set var="str1" value="${fn:toLowerCase(str) }"></c:set>
	<!-- same as uppercase -->
	<c:out value="${str1}"/>
	
	<c:set value=" Chaman has choti " var="s"></c:set>
	<c:set value="${fn:replace(s,'choti','loti')}" var="s1"></c:set>
	<c:out value="${s1 }"></c:out> 
	
	<c:set value="${fn:substring(s,1,3) }" var="s2"></c:set>
	<c:out value="${s2 }"></c:out> 
	
	<c:out value="${fn:endsWith(s,'choti')}" />
	<c:out value="${fn:contains(s,'has')}" />
	<c:out value="${fn:length(s)}" />
	<c:set value="${fn:trim(s) }" var="ts"></c:set>
	<c:out value="${fn:length(ts)}" />
	
	<c:set value="abc:pqr:xyz" var ="ad"></c:set>
	<c:set value="${fn:split(ad,':') }" var="ads"></c:set>
	<c:forEach items="${ ads}" var="i">
		<c:out value="${i}"></c:out>
	</c:forEach>
	<c:set var='join' value="${ fn:join(ads,':')}"></c:set>
	<c:out value="${join}"></c:out>
</body>
</html>