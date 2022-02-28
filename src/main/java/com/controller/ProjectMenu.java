package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

@WebServlet("/ProjectMenu")
public class ProjectMenu extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String menu=request.getParameter("menu");
		System.out.println("main"+menu);
		boolean is_check=false;
		if(menu==null) {
			is_check=true;
			request.setAttribute("menuError", "Please Select menu");
		}else {
			
			if(menu.equals("gujrati")) {
				request.setAttribute("menugujrati", menu);
			}else {
				request.setAttribute("menupunjabi", menu);
			}//end of punjabi
		}
		System.out.println("menu1"+menu);
//		if(is_may) {
		boolean is_checkg=false;
		boolean is_ch=false;
		String menu1=request.getParameter("guj");
		System.out.println("menu11111"+menu1);
		String qty=request.getParameter("qty");
		System.out.println("qty"+qty);
		
		if(menu1==null) {
			is_checkg=true;
			request.setAttribute("menu1Error", "Please Select menu");
		}else if(qty==""){
			is_checkg=true;
			request.setAttribute("menu1Error", "Please Select menu");
		}
		
		
		else {
			System.out.println("in");
			if(menu1.equals("rotisak")) {
				System.out.println("in");
				is_ch=true;
				request.setAttribute("menugp", 120);
				request.setAttribute("billamount","Rotisak "+ Integer.toString(Integer.parseInt(qty)*120));
			}else if(menu1.equals("dalBhat")) {
				is_ch=true;
				request.setAttribute("menugp", 110);
				request.setAttribute("billamount", "dalbhat "+Integer.toString(Integer.parseInt(qty)*110));
			}else if(menu1.equals("sabjinaan")) {
				is_ch=true;
				request.setAttribute("menugp", 130);
				request.setAttribute("billamount", "sabji naan "+Integer.toString(Integer.parseInt(qty)*130));
			}else if(menu1.equals("jeeradalfry")) {
				is_ch=true;
				request.setAttribute("menugp", 150);
				request.setAttribute("billamount", "jeeraricedalfry "+Integer.toString(Integer.parseInt(qty)*150));
			}else {
				request.setAttribute("menu1Error1", "Something Went wrong");
			}
				
		}
		
		System.out.println(is_ch);
		
		
		RequestDispatcher rd=null;

		if(is_check) {
			rd=request.getRequestDispatcher("ProjectMenuS.jsp");
			if(is_ch==true) {
				System.out.println("in server");
				rd=request.getRequestDispatcher("ProjectMenuRedirect.jsp");
			}
		}else {
			if(is_ch==true) {
				System.out.println("in server");
				rd=request.getRequestDispatcher("ProjectMenuRedirect.jsp");
			}else {
				rd=request.getRequestDispatcher("ProjectMenuS.jsp");
			}
		}
		rd.forward(request, response);
		
		
		
//		menu=request.getParameter("menu");
		
		
		
		
//		System.out.println("menu"+menu);
//		if(menu.equals("gujrati")&&menu!=null) {
			
//			System.out.println("guj"+menu1);
//			if(menu1.equals("RotiSak")) {
//				System.out.println("rotisak");
//			}else {
//				System.out.println("dal bhat");
//			}
		
			
//		}
//	else if(menu.equals("punjabi")&&menu!=null){
//			String menu1=request.getParameter("pun");
//			is_checkg=false;
//			if(menu1==null) {
//				is_checkg=true;
//				request.setAttribute("menu1Error", "Please Select menu");
//			}else {
//				
//				if(menu.equals("sabjinaan")) {
//					
//				}else {
//					
//				}
//			}
//			
//		}
		
//		RequestDispatcher rd1=null;
//		if(is_checkg) {
//			rd1=request.getRequestDispatcher("ProjectMenuS.jsp");
//		}else {
//			rd1=request.getRequestDispatcher("ProjectMenuS.jsp");
//		}
//		
//		
//		rd1.forward(request, response);
//		

		

	}
}
