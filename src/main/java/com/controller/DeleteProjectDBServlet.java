package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AddProjectDao;


public class DeleteProjectDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int projectid=Integer.parseInt(request.getParameter("projectId"));
		AddProjectDao pd=new AddProjectDao();
		pd.deleteRecord(projectid);
		response.sendRedirect("ListProjectServletDB");
	}

}
