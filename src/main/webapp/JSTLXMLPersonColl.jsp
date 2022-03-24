<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml_rt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="JSTLXMLPersonCollXML.xml" var="per"></c:import>
	<x:parse var="dis" xml="${per}"></x:parse>
	<x:out select="$dis/Person/Student[2]/marks" />
	<x:if select="$dis/Person/Student[1]/marks">
	student exits
	</x:if>
	<x:forEach var="student" select="$dis/Person/Student">
		<tr>
			<td><x:out select="name" /></td>
			<td><x:out select="marks" /></td>

		</tr>
	</x:forEach>


	<x:choose>
		<x:when select="$dis/Person/Student[2]/name='rv'">
			eligible
		</x:when>
		<x:when select="$dis/Person/Student[1]/name='vr'">
			eligible both
		</x:when>
		<x:otherwise>
			both 		
		</x:otherwise>
	</x:choose>
</body>
</html>