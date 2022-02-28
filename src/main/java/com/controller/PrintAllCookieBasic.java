package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/PrintAllCookieBasic")
public class PrintAllCookieBasic extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		Cookie c[]=request.getCookies();
		
		responce.setContentType("text/html");
		PrintWriter pw=responce.getWriter();
		
		pw.print("<html><body>");
		
		for(Cookie x:c) {
			
			pw.print(x.getName()+" -> "+x.getValue()+"<br>");
		}
		
		pw.print("</body></html>");
		
	}
}
