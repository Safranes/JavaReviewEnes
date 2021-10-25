package com.neotech.review10;

public class Person {
	String name;
	int age, salary;

	Person(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String toString() {
		return name + " " + salary;
	}
}
