<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1> Error Handling in JSP</h1>
	
	<!--  We are going to declare two variable inside declarative tag -->
	
	<%!
		int n1=200;
		int n2=10;
		int n3=0;
	
	%>
	
	<!--  We are now going to use these variables with the  help of scriptlet tag -->
	<%  
			int division=n1/n2;
			int divisionS=n1/n3;
				
	
	%>
	<h1> Division : <%=division %></h1>
	<h1>Division  :<%=divisionS %></h1>

</body>
</html>