package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ValidationSignUp")
public class ValidationSignUp extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName=request.getParameter("firstname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		
		
		
		boolean is_check=false;
		
		if(firstName.trim().length()==0||firstName==null) {
			is_check=true;
			request.setAttribute("firstNameError", "<font color=red>Please Enter FirstName</font>");
			
		}else {
			request.setAttribute("firstNameValue", firstName);
		}
		
		if(email.trim().length()==0||email==null) {
			is_check=true;
			request.setAttribute("emailError", "<font color=red>Please Enter email</font>");
			
		}else {
			request.setAttribute("emailValue", email);
		}
		
		if(password.trim().length()==0||password==null) {
			is_check=true;
			request.setAttribute("passwordError", "<font color=red> Please Enter password</font>");
			
		}else {
			request.setAttribute("passwordValue", password);
		}
		
		if(gender==null) {
			is_check=true;
			request.setAttribute("genderError", "<font color=red>Please Select gender</font>");
			
		}else {
			request.setAttribute("genderValue", gender);
		}
		

		RequestDispatcher rd=null;
		if(is_check) {
			rd=request.getRequestDispatcher("ValidationBasicSignUP.jsp");
		}else {
			rd=request.getRequestDispatcher("Signup.html");
		}
		rd.forward(request, response);
	}
}
