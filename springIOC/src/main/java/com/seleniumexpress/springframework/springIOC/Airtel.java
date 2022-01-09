package com.seleniumexpress.springframework.springIOC;

public class Airtel implements Sim {
	
	public void calling() {
		System.out.println("calling using Airtel sim");
	}

	public void data() {

		System.out.println("browsing internet using Airtel sim");
	}

}
