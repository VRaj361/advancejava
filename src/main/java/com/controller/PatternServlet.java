package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatternServlet  extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		
		try {
			int no=Integer.parseInt(request.getParameter("Number"));
					
			String radioSubmit=request.getParameter("pattern");
			response.setContentType("text/html");
//			if(request.getParameter("Number").length()==0) {
//				out.print("Please Enter the Number");
//			}
	//		if() {
	//			out.print("Number is not there");
	//			out.print("Please try again");
	//		}
			
			
//			if(radioSubmit==null||radioSubmit=="") {
//				out.print("Error is there");
//			}
	
			
			if(radioSubmit.equals("upper")) {
				out.print("Upper pyramid"+"<br>");
				int i=1;
				while(i<=no) {
					int s=1;
					while(s<=no-i+1) {
						out.print("&nbsp");
						s++;
					}
					int j=1;
					while(j<=i) {
						out.print(" *");
						j++;
					}
					i++;
					out.print("<br>");
				}
			}else if(radioSubmit.equals("lower")) {
				out.print("lower pyramid"+"<br>");
				int i=1;
				while(i<=no) {
					int s=0;
					while(s<=i) {
						out.print("&nbsp");
						s++;
					}
					int j=no-i+1;
					while(j>=1) {
						out.print(" * ");
						j--;
					}
					i++;
					out.print("<br>");
				}
			}else {
				System.out.println("non");
				out.print("Error is not");
			}
			
			
		}
		
		catch(NullPointerException e) {
			out.print("Please Select the radio button");
		}
		catch(NumberFormatException e) {
			out.print("Please Enter the Number");
		}
	}
	
	
}
