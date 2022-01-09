package com.seliniumexpress.bean_life_cycle_XML_Configuration2;

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
		
	
		
		
		/*
		 * 1) registerShutdownHook method can be called on any line of the code.
		 * 2) The method does the same function as the context.close() method.
		 * 3) registerShutdownHook() will execute once the Main thread ends(Main method ends)
		 *    so once all the codes gets executed, it will be called and closes your container
		 *    so it won't give us an exception irrespective of the line number we are calling it.
		 *    
		 * 4) but the close() method is executed within the Main method so it will throw an exception if trying to create a new object.
		 */
//		context.registerShutdownHook();
//		StudentDAO stu1 = context.getBean("studentDAO", StudentDAO.class);
	}

}
