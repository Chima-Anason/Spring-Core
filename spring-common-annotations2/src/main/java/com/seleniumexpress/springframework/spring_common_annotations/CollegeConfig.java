package com.seleniumexpress.springframework.spring_common_annotations;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/*
 * 1. @Configuration : this annotation tells the spring container that this is the Config Class
 * 2. @ComponentScan : this tells the spring container the location to where all the classes are to create the bean/object for
 * 3. @PropertySource is use to define the location of the properties file for the container to use to inject values to the (collegeName)
 */
@Configuration                                                                                   //.1           
@ComponentScan(basePackages = "com.seleniumexpress.springframework.spring_common_annotations")   //.2
@PropertySource("classpath:college-info.properties")                                             //.3
public class CollegeConfig {


//@Component and @Bean are both used for creating bean or object of a class But here we only use the @Component, @Bean was used in version1 project
	/*   
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
	*/
	
}
