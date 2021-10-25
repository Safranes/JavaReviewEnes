package com.neotech.review01;

public class VariableDemo {
	public static void main(String[] args) {
		// Declare the variable
				String firstName;

				// Assign a value (initialize)
				firstName = "John";

				// Declare the variable & Assign a value
				String lastName = "Smith";

				int age = 29;

				System.out.println(firstName + " " + lastName + " is " + age + " years old.");

				// After some years
				// re-assign new values to the vaiables
				age += 3;
				lastName = "Brown";

				// Declaring another variable with the same name is not possible
				// String lastName = "Brown";
				
				System.out.println("After getting married :)");
				System.out.println(firstName + " " + lastName + " is " + age + " years old.");
		
		
		
		
	}

}
