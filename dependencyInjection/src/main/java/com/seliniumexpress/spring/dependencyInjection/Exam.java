package com.seliniumexpress.spring.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		
		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();

	}

}
