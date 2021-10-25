package com.neotech.review07;

public class Multiplication {
	// Method overloading: The name of the method should be the same
		// Method signature = method name + parameters (should be unique)

		// Access modifier is NOT part of Method signature
		// Return type is NOT part of Method signature
		public static void multiply(int num1, int num2) {
			int result = num1 * num2;
			System.out.println(result);
		}

		public static void multiply(int num1, int num2, int num3) {
			System.out.println(num1 * num2 * num3);
		}

		public static void multiply(double d1, double d2) {
			double result = d1 * d2;
			System.out.println(result);
		}

		public static void multiply(int[] numbers) {
			// TASK: multiply all the numbers in the array
			// and print the result
			int result = 1;
			for (int num : numbers) {
				result *= num;
			}
			System.out.println(result);
		}

		public static void main(String[] args) {
			Multiplication.multiply(2, 3); // We don't need to specify the class name

			multiply(3, 3);
			multiply(2, 5, 3);

			multiply(3.2, 2.1);

			int[] array = { 2, 5, 4, 3 };
			multiply(array);
		}

	}