package com.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProhPun")
public class ProhPun extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pun[]=request.getParameterValues("pun");
		System.out.println(Arrays.toString(pun));
		
		boolean is_check=false;
		if(pun==null) {
			is_check=true;
			request.setAttribute("errorPun", "Please Select any one dish");
		}
		
		RequestDispatcher rd=null;
		if(is_check) {
			rd=request.getRequestDispatcher("ProHPun.jsp");
		}else {
			rd=request.getRequestDispatcher("ProHBill.jsp");
		}
	
		rd.forward(request, response);
	}
}
