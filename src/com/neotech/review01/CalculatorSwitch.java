package com.neotech.review01;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// Ask the user to enter 2 numbers
		// Ask the user for the operator(+,-,*,/)
		// Use switch case and if-else

		// ctrl+shift+o
		Scanner ask = new Scanner(System.in);
		System.out.println("Please enter the first number");
		double d1 = ask.nextDouble();

		System.out.println("Please choose an operator (+,-,*,/).");
		char operator = ask.next().charAt(0);

		System.out.println("Please enter the second number");
		double d2 = ask.nextDouble();

		double result = 0;
		switch (operator) {

		case ('+'):
			result = d1 + d2;
			break;

		case ('-'):
			result = d1 - d2;
			break;
		case ('*'):
			result = d1 * d2;
			break;
		case ('/'):
			result = d1 / d2;
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		if (operator == ('+') || operator == ('-') || operator == ('*') || operator == ('/')) {
			System.out.println("The result is " + result);
		}
	}

}
