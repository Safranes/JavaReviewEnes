package com.neotech.review06;

public class Person {
	// instance variables
	public String name;
	int age;
	protected int weight;

	Person() {
		System.out.println("Creating a person");
		System.out.println("No parameters");
	}

	Person(String personName, int personWeight) {
		name = personName;
		weight = personWeight;
	}

	Person(String pName, int pWeight, int pAge) {
		this(pName, pWeight);
		age = pAge;
	}

	public void sleep() {
		System.out.println("---sleeping---");
	}

	public void displayInfo() {
		System.out.println("Name: " + name + " age: " + age + " weight: " + weight);
	}

}