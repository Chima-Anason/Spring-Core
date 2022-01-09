package com.selinium.bean_life_cycle_Interface_Implementation_method;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDAO stu = context.getBean("studentDAO", StudentDAO.class);
		stu.selectAllRows();
		
		Hello heloHello = context.getBean("hello", Hello.class);

		context.close();
		
	}

}
