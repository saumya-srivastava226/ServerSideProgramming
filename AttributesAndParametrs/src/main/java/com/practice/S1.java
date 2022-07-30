package com.practice;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class S1
 */
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public S1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<!DOCTYPE html>");
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head");
		
		out.println("<body>");
		
		
		String n1=request.getParameter("n1");
		String n2=request.getParameter("n2");
		
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		int s=nn1+nn2;
		
		
		
		
		// setting attribute
		request.setAttribute("sum", s);
		
		
		// WE are now going to forward the request
		
		RequestDispatcher rd=request.getRequestDispatcher("/s2");
		
		rd.forward(request, response);
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
