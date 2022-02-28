package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/AddCookieBasic")
public class AddCookieBasic extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
	
		String cookiename =request.getParameter("cookiename");
		String cookievalue=request.getParameter("cookievalue");
//		RequestDispatcher rd;
//		rd=request.getRequestDispatcher("AddCookieBasic.jsp");
		
		if(cookiename==null||cookievalue==null||cookiename.length()==0||cookievalue.length()==0) {
			request.setAttribute("cookieError", "The feild is empty");
			RequestDispatcher rd=request.getRequestDispatcher("AddCookieBasic.jsp");
			rd.forward(request, responce);
		}else {
			Cookie c=new Cookie(cookiename, cookievalue);
			c.setMaxAge(15);		
			responce.addCookie(c);
			
			RequestDispatcher rd=request.getRequestDispatcher("AddCookieBasic.jsp");
			rd.forward(request, responce);
		}
		
		
	}
	
}
