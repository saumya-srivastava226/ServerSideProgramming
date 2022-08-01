package com.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		// All The data that we have submitted in the form the request object of  specified servlet
		// will have that
		
		// getting the data from form
		
		String name=request.getParameter("user_name");
		String email=request.getParameter("user_email");
		String password=request.getParameter("user_password");
		
		out.println(name+password+email);
		
		
		// We are now going to create a connection using JDBC
		try {
			// First step is to load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// The driver is loaded
			
			// Second step is to create the connection
			String url="jdbc:mysql://localhost:3306/registration";
			Connection con= DriverManager.getConnection(url, "root", "SRIVASTAVa22#");
			
			String q="insert into user(name, password, email) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.setString(3, email);
			
			pstmt.executeUpdate();
			
			out.println("<h1> Done.. </h1>");
			
			con.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			out.println("<h1> Error.. </h1>");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
