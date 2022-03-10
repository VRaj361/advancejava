package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet{
	@Override
	public void init(ServletConfig con) throws ServletException {
	String email=con.getInitParameter("email");
	System.out.println(email);
	String password=con.getInitParameter("password");
	System.out.println(password);
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Run");
		String firstName=request.getParameter("firstname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		System.out.println(firstName+" "+email+" "+password);
		
		//produce the content using servlet
		System.out.println("context value");
		ServletContext con=request.getServletContext();
		System.out.println(con.getInitParameter("email"));
		System.out.println(con.getInitParameter("email"));
		
		response.setContentType("text/html");//MIME tag means text and html file
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("firstname="+firstName+"<br>");
		out.print("Email="+email+"<br>");
		out.print("Password="+password+"<br>");
		out.print("</body></html>");
	}
}
