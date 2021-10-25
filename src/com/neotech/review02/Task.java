package com.neotech.review02;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// Ask the user to enter a positive number and add it to the total
		// He should enter -1 to STOP. -1 will not be added to the total

		Scanner input = new Scanner(System.in);


		int number = 0;
		int total = 0;

		// System.out.println("Enter a positive number! To stop enter -1");
		// number = input.nextInt();
		//
		// while (number != -1) {
		// total += number;
		// System.out.println("Enter a positive number! To stop enter -1");
		// number = input.nextInt();
		// }
		//
		// System.out.println("Total = " + total);

		// System.out.println("------------------------");

		// do {
		// System.out.println("Enter a positive number! To stop enter -1");
		// number = input.nextInt();
		// if (number != -1) {
		// total += number;
		// }
		// } while (number != -1);
		//
		// System.out.println("Total = " + total);

		// System.out.println("------------------------");

		// How a for loop works
		// 1st iteration: 1 initialization, 2 check condition
		// other iterations: 1 increment, 2 check condition
		// for (int i = 1; i <= 3; i++) {
		// System.out.println(i);
		// }

		System.out.println("Enter a positive number! To stop enter -1");
		number = input.nextInt();

		for (; number != -1;) {
			total += number;
			System.out.println("Enter a positive number! To stop enter -1");
			number = input.nextInt();
		}

		System.out.println("Total = " + total);
	}

}
