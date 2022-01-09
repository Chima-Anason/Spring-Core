package com.seleniumexpress.springframework.spring_common_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

	@Bean
	public Principal principalBean() {
		
		return new Principal();
	}
	
	
	//Setter Injection Way
	@Bean
	public College collegeBean() //collegeBean = bean ID
	{
		
		College college = new College();
		college.setPrincipal(principalBean()); //use the .set method and insert the bean method in
		return college;
	}
	
	//Constructor Injection Way
//	@Bean
//	public College collegeBean() //collegeBean = bean ID
//	{
//		
//		College college = new College(principalBean()); //insert the bean method(principalBean()) in the new college( )
//		return college;
//	}
}
