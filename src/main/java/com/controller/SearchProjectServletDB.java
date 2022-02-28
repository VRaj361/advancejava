package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AddProjectBeanDB;
import com.dao.AddProjectDao;

public class SearchProjectServletDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str=request.getParameter("searchname");
		System.out.println(str);
		AddProjectDao pd=new AddProjectDao();
		ArrayList<AddProjectBeanDB> arr=pd.searchData(str);
		System.out.println(arr);
		request.setAttribute("project", arr);
		System.out.println(arr+" dfasdfads");
		request.getRequestDispatcher("PrintSelectedItemSearchDB.jsp").forward(request, response);
	}

}
