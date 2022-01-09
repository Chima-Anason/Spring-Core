package com.seleniumexpress.springframework.spring_value_required_annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	
	private String name;
	
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	//@Requied : used to make this dependency/property cumpulsory, meaning it must require a value
	//Also note @Required won't work on top of the property, it only works on the setter method
	@Required
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	



	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}




	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		
		System.out.println("Student name is :" + name);
		System.out.println("Student Interested Course is :" + interestedCourse);
		System.out.println("Student hobby is :" + hobby);
	}
	
	
	

}
