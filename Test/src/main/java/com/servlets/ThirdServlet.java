package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class ThirdServlet extends HttpServlet{
		
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,  IOException 
	{
		
		System.out.println("This is output on console");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1> This is output from Servlet </h1> ");
		out.println("<h2>This is HttpServlet Example</h2");
		
	}
		
}
