package com.listner;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.util.UserStatic;

public class UserCounter implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {

		UserStatic.user_counter++;
		System.out.println("Db connected-"+UserStatic.user_counter);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		UserStatic.user_counter--;
		System.out.println("Db Destroyed-"+UserStatic.user_counter);
		
	}



}
