package com.neotech.review04;

public class Teacher {
	// Create a class of Teacher
		// String name, double salary, String subject
		// teach(), yellAtStudent()
	
	String name;
	double salary;
	String subject;
	
	void teach() {
		System.out.println(name+" is teaching "+ subject);
	}
	
	void yellAtStudent(String studentName) {
		System.out.println(name + " is yelling to " + studentName);
	}
}
