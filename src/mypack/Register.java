package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{
	doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		System.out.println("Register Servlet..........");
		String name=request.getParameter("name");
		if(name.equalsIgnoreCase("imran"))
		{
			System.out.println("if block");
			String referer=(String)request.getParameter("ss");
			System.out.println("########    "+referer);
			RequestDispatcher rd=request.getRequestDispatcher(referer);
			rd.forward(request,response);
		}
		else
			out.println("InValid");
		out.close();
	}
}
