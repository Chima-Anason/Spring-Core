package com.selinium.bean_life_cycle_Interface_Implementation_method;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean {
	
//	public void init() {
//		
//		System.out.println("inside Hello class init method");
//		
//	}
//	
//	public void destroy() {
//		
//		System.out.println("inside Hello class destroy method");
//		
//	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside Hello class init method");
		
	}

@Override
public void destroy() throws Exception {
	System.out.println("inside Hello class destroy method");
	
}

}
