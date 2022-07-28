package com.practice;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class RegisterServlet extends HttpServlet {

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		String cond=req.getParameter("condition");
		
		if(cond!=null)
		{
			if(cond.equals("checked"))
		
		{
			out.println("<h2> Name:"+name+"</h2"+"<br");
			out.println("<h2> Password:"+password+"</h2"+"<br");
			out.println("<h2> Email:"+email+"</h2"+"<br");
			out.println("<h2> Gender:"+gender+"</h2"+"<br");
			out.println("<h2> Course"+course+"</h2");
			
			
			
			// let us assume that the data is saved to database
			RequestDispatcher rd=req.getRequestDispatcher("success");
			
			rd.forward(req, res);
			
			
		}
		
		}
		else
		{
			out.println("<h2>You have not accepted terms and conditions.</h2>");
			
			// I want to include the output of index.html
			//if in  place of index.html we wantted the output of another servlet then we would have passed the url pattern of that servlet2
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, res);
			
			
			
			
		}
		
	}
}
