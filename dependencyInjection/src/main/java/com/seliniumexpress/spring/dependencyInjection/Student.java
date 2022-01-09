package com.seliniumexpress.spring.dependencyInjection;

public class Student {

	private int id;
	private String studentName;

	//using Setters Dependency Injection
	
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}

	//using Constructor Dependency Injection
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public void displayStudentInfo() {
		System.out.println("student name is : " + studentName
				+ " and the id is : " + id);
	}

}
