package com.seleniumexpress.springframework.dependency_injection_object_type;

public class AnotherStudent {
	
	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void startCheating() {
		cheat.cheat();
	}

}
