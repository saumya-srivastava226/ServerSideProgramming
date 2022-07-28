package com.servlets;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
public class SecondServlet  extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1> This is my second servlet output from servlet</h1>");
		out.println("<h2> You are finally learning Saumya</h2>");
		
	}

}

