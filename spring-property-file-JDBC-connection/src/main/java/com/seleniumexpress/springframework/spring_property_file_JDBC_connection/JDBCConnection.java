package com.seleniumexpress.springframework.spring_property_file_JDBC_connection;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.username}")
	private String username;
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.driver}")
	private String driver;
	
	
	public void display() {
		
		System.out.println(username + " " + url + " " + password + " " + driver + " ");
		
	}
	
	public void getJDBCConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("connection successful : " + con);
		
	}

}
