package com.neotech.review04;

public class School {

	public static void main(String[] args) {
		// Create a class School with a main method
		// Create 2 objects/instances of Student class
		// Create 1 object of Teacher class
		
		Student student1 = new Student();
		student1.name = "Atoullo";
		student1.studentNr = 526;
		student1.gradeLevel = 2;

		Student student2 = new Student();
		student2.name = "Ivonne";
		student2.studentNr = 007;
		student2.gradeLevel = 3;

		Teacher teacher = new Teacher();
		teacher.name = "Sabah";
		teacher.salary = 95000;
		teacher.subject = "Java";

		System.out.println("Let's call the methods!");
		student1.study();

		student2.sleep();
		student2.study();

		teacher.teach();
		teacher.yellAtStudent("Ulf");
		
		
		
		
		
		
	}

}
