package com.seleniumexpress.springframework.spring_common_annotations;

import org.springframework.stereotype.Component;

/*
 * This @Component will generate a bean/object for this class & note: @ComponentScan must be used at the Config class when  using it
 */
@Component    
public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("I am your Science Teacher");
		System.out.println("My name is Thomas Andrew \n");
		
	}

}
