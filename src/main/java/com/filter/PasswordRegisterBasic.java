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
public class PasswordRegisterBasic implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String password=request.getParameter("password");
		if(password.trim().length()<=8) {
			request.setAttribute("passwordError", "Atleast length of password of 8 ");
			request.getRequestDispatcher("FilterRegisterBasic.jsp").forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
		
	}

	public void init(FilterConfig arg0) throws ServletException {
	}
	
}
