package com.seleniumexpress.springframework.spring_property_file_JDBC_connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		JDBCConnection conn = context.getBean("jdbc", JDBCConnection.class);
		conn.display();
		
		//conn.getJDBCConnection();
		
	}

}
