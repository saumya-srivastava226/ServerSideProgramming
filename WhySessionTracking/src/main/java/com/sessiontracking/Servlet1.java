package com.sessiontracking;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		out.println("<h1> Hello "+name +" Welcome to my website....</h1>");
		
		// We will create a cookie so that next time if name is fetched server remembers it
		
		
		Cookie c=new Cookie("user_name",name);// Our cookie is ready and now we need to give it to response
		response.addCookie(c);
		
		
		out.println("<h2> <a href='servlet2'> Go to Servlet2 </a></h2>");
		
		
		
		
		
	}

}
