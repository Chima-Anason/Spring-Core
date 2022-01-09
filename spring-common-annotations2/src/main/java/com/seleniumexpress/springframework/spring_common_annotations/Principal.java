package com.seleniumexpress.springframework.spring_common_annotations;

import org.springframework.stereotype.Component;

@Component
public class Principal {

	public void principalInfo() {
		System.out.println("Hi i am your principal");
		System.out.println("My name is James Harden \n");
	}
}
