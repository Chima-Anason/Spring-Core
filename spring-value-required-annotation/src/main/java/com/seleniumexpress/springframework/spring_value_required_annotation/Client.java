package com.seleniumexpress.springframework.spring_value_required_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Student stu = context.getBean("student", Student.class);
		stu.displayStudentInfo();
		
		
		
	}

}
