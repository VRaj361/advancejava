	package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionBasic extends HttpServlet {
  @Override
	protected void service(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	
	  System.out.println("Run");
	  String firstNo=request.getParameter("firstN");
	  String secondNo=request.getParameter("secondN");
	  System.out.println(firstNo+" "+secondNo);
	  Integer n1=Integer.parseInt(firstNo);
	  Integer n2=Integer.parseInt(secondNo);
	  System.out.println("sum="+(n1+n2));
	  
	  response.setContentType("text/html");//MIME tag means text and html file
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("firstNO="+firstNo+"<br>");
		out.print("secondNo="+secondNo+"<br>");
		out.print("Addition="+(n1+n2));
		out.print("</body></html>");
	  
	}
}
