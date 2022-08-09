<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> We are going to learn Core Tags in JSTL</h1>

<c:set var="i" value="23" scope="application">
</c:set>

<c:out value="${i }"></c:out>

<c:forEach var="j" begin="1" end="10">
	<c:out value="${j}"></c:out>

</c:forEach>

</body>
</html>