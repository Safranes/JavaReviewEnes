package com.neotech.review07;

//Every class by default extends the Object class
public class Human {
	// fields/variables
	String name; // instance variable
	static final String planet = "World"; // class variable--Because it is static and static belongs to the class!!

	public Human() {
		// super();
		System.out.println("A human is being created!");
	}

	public Human(String name) {
		this();
		this.name = name;
	}

	// method/behavior
	public void talk() {
		System.out.println("bla bla bla");
	}

}