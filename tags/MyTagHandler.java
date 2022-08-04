package tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {
	
	
	// We need to override the methods of TagSupport class which will be executed to run the program
	public int doStartTag() throws JspException{
		try {
			
			JspWriter out=pageContext.getOut();
			out.println("<h1> This is my custom tag </h1>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}

}
