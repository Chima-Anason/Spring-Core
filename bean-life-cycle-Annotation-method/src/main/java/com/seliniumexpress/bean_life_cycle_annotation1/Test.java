package com.seliniumexpress.bean_life_cycle_annotation1;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDAO stu = context.getBean("studentDAO", StudentDAO.class);
		stu.selectAllRows();

		((ClassPathXmlApplicationContext)context).close();
	}

}
