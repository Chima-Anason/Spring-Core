package com.seleniumexpress.springframework.springIOC;

public class Vodaphone implements Sim {

	public void calling() {
		System.out.println("calling using vodaphone sim");
	}

	public void data() {

		System.out.println("browsing internet using vodaphone sim");
	}

}
