package com.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProhGuj")
public class ProhGuj extends HttpServlet{
@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String guj[]=request.getParameterValues("guj");
		System.out.println(Arrays.toString(guj));
		
		boolean is_check=false;
		if(guj==null) {
			is_check=true;
			request.setAttribute("errorGuj", "Please Select any one dish");
		}
		
		RequestDispatcher rd=null;
		if(is_check) {
			rd=request.getRequestDispatcher("ProHGuj.jsp");
		}else {
			rd=request.getRequestDispatcher("ProHBill.jsp");
		}
	
		rd.forward(request, response);
		
	}
}
