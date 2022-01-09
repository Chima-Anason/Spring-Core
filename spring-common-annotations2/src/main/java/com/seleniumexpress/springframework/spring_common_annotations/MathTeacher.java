package com.seleniumexpress.springframework.spring_common_annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
 * 1. This @Component will generate a bean/object for this class & note: @ComponentScan must be used at the Config class when  using it
 * 
 * 2. @primary : if there are multiple implementations(e.g MathTeacher and ScienceTeacher) implements the Teacher interface 
 *    @Primary will be used to inject this class and make this class the primary implementation of Teacher interface
 *    But if the @Qualifier(other impl e.g ScienceTeacher) is used on the property/dependency(Teacher) at the  College.java class @Quailifer will override @Primary
 */
@Component   //.1
@Primary     //.2
public class MathTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("I am your Math Teacher");
		System.out.println("My name is Angela David \n");
		
	}

}
