package com.neotech.review04;

public class Ensar {
	
	// A method with NO parameters and NO return type
		void addTwoNumbers() {
			System.out.println("I am inside addTwoNumbers");
			int result = 3 + 4;
		}

		// A method with TWO parameters and NO return type
		void addTwoNumbersThatIGive(int num1, int num2) {
			System.out.println("I am inside addTwoNumbersThatIGive");
			int result = num1 + num2;
		}

		// A method with NO parameters and WITH return type
		int addTwoNumbersAndGiveMeTheResult() {
			System.out.println("I am inside addTwoNumbersAndGiveMeTheResult");
			int result = 5 + 2;
			return result;
		}

		// A method with TWO parameters and WITH return type
		int addNumbersThatIGiveAndGiveMeTheResult(int num1, int num2) {
			System.out.println("I am inside addNumbersThatIGiveAndGiveMeTheResult");
			int result = num1 + num2;
			return result;
		}
}
