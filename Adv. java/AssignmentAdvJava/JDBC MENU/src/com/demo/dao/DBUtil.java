package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	//singleton pattern
	
	static Connection conn=null;
	
	public static Connection getMyConnection() {
		if(conn==null) {
			try {
				
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				
				String url="jdbc:mysql://192.168.10.117:3306/dac39?useSSL=false";
				String user="dac39";
				String password="welcome";
				conn=DriverManager.getConnection(url, user, password);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static void closeMyconnection() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	
	
	
}
