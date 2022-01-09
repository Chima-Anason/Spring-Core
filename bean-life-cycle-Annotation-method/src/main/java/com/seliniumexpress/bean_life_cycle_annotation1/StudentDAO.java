package com.seliniumexpress.bean_life_cycle_annotation1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class StudentDAO {

	private String driver;
	private String url ;
	private String username;
	private String password;
	//my connection object
	Connection con;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	/*
	 * NB: the spring container sees the  @PostConstruct as the init method. 
	 * After the spring container initialize the bean(object), and does the dependency injection, it finds the @Postconstruct annotation and runs the method as the init method.
	 * The method name can be any name, it must not be (init).
	 */
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		
		//calling the createDBConnection method in the init method
		System.out.println("Inside the custom Init method");
		createDBConnection();
	}
	
	
	public void createDBConnection() throws ClassNotFoundException, SQLException {

		// load driver
		Class.forName(driver);

		// get connection
		con = DriverManager.getConnection(url, username, password);

	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {

		System.out.println("Retrieve all user data");


		// execute query
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM fllblogwebsite.user");

		while (rs.next()) {
			int id = rs.getInt(1);
			// String avatar_img = rs.getString(2);
			String email = rs.getString(3);
			String first_name = rs.getString(4);
			// String gender = rs.getString(5);
			String last_name = rs.getString(6);
			// String password = rs.getString(7);
			String phone_number = rs.getString(8);
			String username = rs.getString(11);

			System.out.println(
					id + "  " + email + "  " + first_name + "  " + last_name + "  " + phone_number + "  " + username);

		}
		
		
	}

	public void deleteUser(int id) throws ClassNotFoundException, SQLException {

		
		// execute query
		Statement stmt = con.createStatement();

		stmt.executeUpdate("delete from fllblogwebsite.user where id = " + id);

		System.out.println("Record of user with id " + id + " is deleted");
		
		
				
	}
	
	
	
	public void closeConnection() throws SQLException {
		
		
		//closing the connection
		con.close();
		
	}
	
	
	/*
	 * NB: the spring container sees the  @PreDestroy as the destroy method. 
	 * After the spring container finished using the bean(object)  it finds the @PreDestroy annotation and runs the method as the destroy method to clean up the connection.
	 * NB: if it is a Standalone project the @PreDestroy can be created and used but for Web application project it is automatically called, so no need for creating destroy method.
	 */
	@PreDestroy
	public void destroy() throws SQLException {
		
		//Clean up 
		System.out.println("Inside Destroy method");
		closeConnection();
		
	}

}
