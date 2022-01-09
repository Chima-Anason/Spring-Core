package com.seleniumexpress.springframework.spring_common_annotations;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		College college = context.getBean("college", College.class);
		college.test();
		
		context.close();
		
	}

}
