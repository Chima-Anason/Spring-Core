package com.seleniumexpress.springframework.spring_common_annotations;


public class College {
	
	private Principal principal;
	
	
	//Setter Injection way
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	
	
	//Constructor Injection way
//	public College(Principal principal) {
//		
//		this.principal = principal;
//	}




	public void test() {
		principal.principalInfo();
		System.out.println("testing this methods");
	}

}
