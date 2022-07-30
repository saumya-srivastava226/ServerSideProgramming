package com.practice;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class S2
 */
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		/*out.println("<!DOCTYPE html>");
		out.println("<html");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");*/
		int nn1=Integer.parseInt(request.getParameter("n1"));
		int nn2=Integer.parseInt(request.getParameter("n2"));
		int p=nn1*nn2;
		// get atrribite from request object

		
		int sum=(int)request.getAttribute("sum");
		out.println("<h1>");
		out.println("Sum is: "+sum);
		out.println("Product is "+p);
		out.println("</h1>");
		out.println("</body>");
		
		out.println("</html");
		
		
	}

}
