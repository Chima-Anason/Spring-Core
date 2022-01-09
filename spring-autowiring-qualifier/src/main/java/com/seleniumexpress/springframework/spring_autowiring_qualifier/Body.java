package com.seleniumexpress.springframework.spring_autowiring_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Human human =context.getBean("human", Human.class);
		human.startPumping();

	}

}
