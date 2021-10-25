package com.neotech.review01;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		// .next() reads one word until space
				// System.out.println("Enter first name: ");
				// String fName = scan.next();
				//
				// System.out.println("Enter last name: ");
				// String lName = scan.next();
				//
				// System.out.println("Full name is: " + fName + " " + lName);

				// System.out.println("-------------------------");

				// .nextLine() reads the whole line until enter
				// System.out.println("Enter first name: ");
				// String fName = scan.nextLine();
				//
				// System.out.println("Enter last name: ");
				// String lName = scan.nextLine();
				//
				// System.out.println("Full name is: " + fName + " " + lName);

				// System.out.println("-------------------------");

				// next(), nextInt(), nextDouble(), nextByte(), nextBoolean()
				// They all read until next space or enter

				// System.out.println("Please enter an int, boolean and a double");
				// int num = scan.nextInt();
				// boolean b = scan.nextBoolean();
				// double d = scan.nextDouble();
				//
				// System.out.println("What you entered was: " + num + " " + b + " " + d);

				// System.out.println("-------------------------");
				System.out.println("Please enter a sentence");

				String str1 = scan.next();
				String str2 = scan.next();
				String str3 = scan.nextLine();

				System.out.println(str1);
				System.out.println(str2);
				System.out.println(str3);
	}
}
