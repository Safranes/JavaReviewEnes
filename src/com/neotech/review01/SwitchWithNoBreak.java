package com.neotech.review01;

public class SwitchWithNoBreak {
	public static void main(String[] args) {

		int num = 5;

		switch (num) {
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
			break;
		case 7:
			System.out.println("7");
		}

		// Limitations of switch
		// 1. You cannot use logical operators
		if (num > 3 && num < 6) {

		}

		// 2. You cannot use double
		double d = 3.4;
		if (d == 3.4) {

		}

		// 3. You cannot have duplicate case
		// 4. You should be careful with break
	}

}
