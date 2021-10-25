package com.neotech.review06;

//OOP -> Object Oriented Programming
//1. Inheritance (trashegimi, miras, herencia, nasledonaviye, meros, mirati, ueraset-pashto)
//2. Polymorphism
//3. Abstraction
//4. Encapsulation

//Every class in Java is extending the Object class
//Object class is like Adam in humanity :)
public class Doctor {
	String name;
	int salary;
	String licenseId;

	public Doctor() {

	}

	Doctor(String name, int salary, String licenseId) {
		this.name = name;
		this.salary = salary;
		this.licenseId = licenseId;
	}

	public void checkUp(String name) {
		System.out.println("Doctor " + this.name + " makes a checkup on " + name);
	}

}

