<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> First JSP Page</h1>
	
	<%!
		int a=50;
	    int b=27;
	    String name="Techsoft India";
	    public int doSum()
	    {
	    	return a+b;
	    }
	    public String reverse()
	    {
	    	StringBuffer br=new StringBuffer(name);
	    	return br.reverse().toString();
	    }
	
	
	%>
	<%
		out.println(a);
		out.println("<br>");
		out.println(b);
		out.println("<br>");
		out.println("Sum of both numbers :"+doSum());
		
	
	
	%>
	
	<h1> Sum is  <%=doSum() %></h1>
</body>
</html>