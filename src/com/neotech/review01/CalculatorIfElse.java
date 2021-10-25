package com.neotech.review01;

import java.util.Scanner;

public class CalculatorIfElse {
	public static void main(String[] args) {
		// Ask the user to enter 2 numbers
		// Ask the user for the operator(+,-,*,/)
		// Use switch case and if-else

		Scanner evis = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double d1 = evis.nextDouble();

		System.out.println("Please enter the second number:");
		double d2 = evis.nextDouble();

		System.out.println("Please enter the operator (+,-,*,/)");
		String operator = evis.next();

		double result = 0;

		if (operator.equals("+")) {
			result = d1 + d2;
		} else if (operator.equals("-")) {
			result = d1 - d2;
		} else if (operator.equals("*")) {
			result = d1 * d2;
		} else if (operator.equals("/")) {
			result = d1 / d2;
		} else {
			System.out.println("Invalid operator");
		}

		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
			System.out.println("The result is " + result);
		}

	}

}
