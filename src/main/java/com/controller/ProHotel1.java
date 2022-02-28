package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ProHotel1")

public class ProHotel1  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pass=request.getParameter("password");
		String email=request.getParameter("emailpro");
		boolean is_check=false;
		
		
		if(email.trim().length()==0||email==null) {
			is_check=true;
			request.setAttribute("emailError", "<font color=red>Please Enter email</font>");
			
		}else {
			request.setAttribute("emailValue", email);

		}
		
		if(pass.trim().length()==0||pass==null) {
			is_check=true;
			request.setAttribute("passError", "<font color=red> Please Enter password</font>");
			
		}else {
			request.setAttribute("passValue", pass);
		}
		
		if(!pass.equals("admin")) {
			is_check=true;
			request.setAttribute("passCError", "Inavalid Crendentails");
		}
		
		
		
//		else if(email.length()==0||email==null) {
//			request.setAttribute("emailError", "Enter the Email");
//			is_check=true;
//		}
//		else if(pass.equals("admin")) {
//			
//		}else {
//			is_check=true;
//			request.setAttribute("passCError","Invalid Creditails");
//		}
		RequestDispatcher rd=null;
		if(is_check==false) {
			rd=request.getRequestDispatcher("ProHotel1.jsp");
		}else {
			rd=request.getRequestDispatcher("ProHotel.jsp");
		}
		rd.forward(request, response);
		
		
		
	}
}
