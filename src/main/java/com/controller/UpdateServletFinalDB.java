package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AddProjectBeanDB;
import com.dao.AddProjectDao;

public class UpdateServletFinalDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
		int projectid=Integer.parseInt(request.getParameter("projectId"));
		System.out.println("get "+projectid);
		String title=request.getParameter("title");
		System.out.println("get "+title);
		String description=request.getParameter("description");
		System.out.println("get "+description);
		AddProjectBeanDB bean=new AddProjectBeanDB();
		bean.setProjectId(projectid);
		bean.setTitle(title);
		bean.setDescription(description);
		
		AddProjectDao projectdao=new AddProjectDao();
		System.out.println("dfahiofhdsa");
		projectdao.updateValue(bean);
		response.sendRedirect("ListProjectServletDB");
	}

}
