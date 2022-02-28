package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/FilterRegisterServlet")
public class FilterRegisterBasic implements Filter{
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter page");
		String firstName=request.getParameter("firstname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		boolean is_check=false;
		if(firstName==null||firstName.trim().length()==0) {
			is_check=true;
			request.setAttribute("firstNameError", "enter valid name");
		}
		if(email==null||email.trim().length()==0) {
			is_check=true;
			request.setAttribute("emailError", "enter valid email");
		}
		if(password==null||password.trim().length()==0) {
			is_check=true;
			request.setAttribute("passwordError", "enter valid password");
		}
		if(is_check) {
			request.getRequestDispatcher("FilterRegisterBasic.jsp").forward(request, response);
		}

		else {
			chain.doFilter(request, response);//go for next filter or servlet
		}
	}
}
