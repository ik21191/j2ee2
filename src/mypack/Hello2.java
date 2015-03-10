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
public class Hello2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String referer=request.getHeader("referer");
		String uri=request.getRequestURI();
		System.out.println("uri is :  "+uri);
		System.out.println("Query String is :  "+request.getQueryString());
		System.out.println("Request URL is : "+request.getRequestURL().toString());
		out.println("Referer is : "+referer);
		System.out.println("Third Servlet Response..........");
		out.close();
	}
}
