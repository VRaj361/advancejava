package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AddProjectBeanDB;
import com.dao.AddProjectDao;

public class AddProjectServlet extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title=request.getParameter("title");
		String description=request.getParameter("description");
		AddProjectBeanDB beandb=new AddProjectBeanDB();
		beandb.setTitle(title);
		beandb.setDescription(description);
		AddProjectDao dao=new AddProjectDao(); 
		dao.insertData(beandb);
		response.sendRedirect("AddProjectDB.jsp");
		
		
	}

}
