package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AddProjectBeanDB;
import com.dao.AddProjectDao;

public class UpdateServletDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int projectId=Integer.parseInt(request.getParameter("projectId"));
		AddProjectDao dao=new AddProjectDao();
		AddProjectBeanDB bean=dao.getUpdateData(projectId);
		request.setAttribute("project", bean);
		request.getRequestDispatcher("UpdatejspDB.jsp").forward(request, response);
		//send the data on the updatejsp
	}

}
