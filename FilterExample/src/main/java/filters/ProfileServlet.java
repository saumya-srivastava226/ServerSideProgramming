package filters;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
public class ProfileServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		out.println("This is the profile servlet");
		
		
	}

}
// WE have created a servlet, we now need to do its mapping in deployment descriptor