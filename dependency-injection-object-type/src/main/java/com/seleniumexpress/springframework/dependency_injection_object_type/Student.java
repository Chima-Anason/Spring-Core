package com.seleniumexpress.springframework.dependency_injection_object_type;

public class Student {
	
	private String id;
	private Cheat cheat;
	
	
	public void setId(String id) {
		this.id = id;
	}
	

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}


	public void cheating() {
		cheat.cheat();
		System.out.println("hey my id is " + id + " try to find me hahaha... ");
	}

}
