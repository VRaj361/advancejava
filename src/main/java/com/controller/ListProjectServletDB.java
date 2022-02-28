package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AddProjectBeanDB;
import com.dao.AddProjectDao;

public class ListProjectServletDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AddProjectDao prodao=new AddProjectDao();
		System.out.println("servlet in");
		ArrayList<AddProjectBeanDB> project=prodao.getAllProjects();
		System.out.println("servlet out");
		request.setAttribute("project", project);
		System.out.println("servlet inout");
		System.out.println(project);
		request.getRequestDispatcher("ListAllProject.jsp").forward(request, response);
		
	}

}
