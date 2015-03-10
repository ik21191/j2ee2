package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//try{Class.forName("mypack.AbstractClass1").newInstance();}catch(Exception e){System.out.println(e);}
		// Above line will throw exception when executed.
		out.println("hello<br/><a href=login.jsp>login</a>");
		System.out.println("Called from hello servlet.......");
		//response.addHeader("refresh","5");
		response.addHeader("site_id","12345");
		System.out.println("Value;;;;;;;;  "+request.getHeader("site_id"));
		Enumeration<String> en=request.getHeaderNames();
		while(en.hasMoreElements())
		{
			String s=en.nextElement();
			System.out.println(s+"       "+request.getHeader(s));
		}
		out.close();
	}
}
