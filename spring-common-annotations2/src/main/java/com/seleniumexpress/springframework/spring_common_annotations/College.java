package com.seleniumexpress.springframework.spring_common_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

      
/*
 * @Component will generate a bean/object for this class & Note: @ComponentScan must be used at the Config class when  using it
 * Note : the bean ID is same name with the Class name but starts with small letter */
@Component 
public class College {
	
	
	private String collegeName;
	
	/*
	 * @Autowired is used for object/reference type injection
	 * Note: when using @Autowired the setter method nor the constructor method isn't needed */
	@Autowired
	private Principal principal;
	
	/* 
	 * @Quailifier chooses one out of multiple objects/bean to be injected i.e if their are multiple classes implementing the interface, it choose one 
	 * to avoid confusion in the container.
	 * @Qualifier will be injected first rather than the @Primary*/
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	



	/*
	 * @Required means the dependency/property can't be null
	 * Note: it can't be used on the dependency/Property declaration
	 * it can only be used on the Setter method and the value also must be on the Setter method
	 */
	@Required
	@Value("${college.Name}")    //@Value is use for Primitive/Literal type injections
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}







	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My college Name is : " + collegeName);
		System.out.println("testing this methods");
	}

}
