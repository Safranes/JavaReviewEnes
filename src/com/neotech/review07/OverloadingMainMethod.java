package com.neotech.review07;

public class OverloadingMainMethod {
	// Can we overload main method?
	// Can I have another method with name main in the same class?

	public static void main(String[] args) {
		//Execution can only happen in this main method
		// Java looks for a main method with this signature to execute the code
		// Method signature = method name (main) + parameters (String array)
		System.out.println("Main method with String array parameters");

		main("Hi", "Bye");

		main(3, 4);

		int[] arr = { 2, 3 };
		main(arr);
		// Polymorphism												}
		// Method overloading										}-->They are the same thing
		// Compile time polymorphism/early binding/static binding	}
	}

	public static void main(int[] ints) {
		System.out.println("Main method with int array parameters");
	}

	public static void main(int num1, int num2) {
		System.out.println("Main method with two int parameters");
	}

	public static void main(String str1, String str2) {
		System.out.println("Main method with two String parameters");
	}

}
