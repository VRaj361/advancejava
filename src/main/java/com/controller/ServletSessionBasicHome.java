package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ServletSessionBasicHome extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		HttpSession session=request.getSession();
		session.setAttribute("email", email);
		session.setMaxInactiveInterval(12);//in second and session-config in minute 
		response.sendRedirect("SessionHome1.jsp");
	}

}
