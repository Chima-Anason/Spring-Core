package com.seleniumexpress.springframework.spring_autowiring_qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	@Autowired
	private Heart heart;

	
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping() {
		
		if(heart!=null) {
			heart.pump();
		}else {
			System.out.println("you are dead");
		}
		
	}
	

}
