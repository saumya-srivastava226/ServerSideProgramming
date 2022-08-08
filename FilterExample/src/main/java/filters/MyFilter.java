package filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter{
	
	//If you implement any interface you need to override all its methods
	public void init(FilterConfig filterConfig)
	{
		
	}
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException , ServletException
	{
		System.out.println("Before Filter");
		//..
		//..
		
		chain.doFilter(req, res);
		System.out.println("after servlet"); 
		
	}
	public void destroy()
	{
		
	}
}
