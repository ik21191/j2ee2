package mypack;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest req=(HttpServletRequest)arg0;
		HttpServletResponse res=(HttpServletResponse)arg1;
		System.out.println("filter preprocessing..........");
		System.out.println("doFilter(ServletRequest,ServletResponse,FilterChain) of MyFilter.");
		RequestDispatcher rd=req.getRequestDispatcher("test.jsp");
		//rd.forward(req, res);
		arg2.doFilter(req,res);
		System.out.println("\nRequest processed......");
		System.out.println("filter post processing in 1st Filter.........");
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
