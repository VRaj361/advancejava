package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Web {
	public static Connection getConnection(){
		String driver="org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/advancejava";
		String userName = "postgres";
		String password = "12345678";
		Connection con = null; 
		try {
			// load driver
			Class.forName(driver);//driver load by class

			// jdbc api open connection
			con = DriverManager.getConnection(url, userName, password);

			if (con == null) {
				System.out.println("db not connected");
			} else {
				System.out.println("db connected");
			}
 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return con;
	}
	
}
