package com.neotech.review01;

import java.util.Scanner;

public class NestedIfRich {

	public static void main(String[] args) {
		
		//CALIS BUNA KENDIN YAPAMADIN!!!
		
		// If you are a boy
		// If you are rich -- Buy a Ferrari
		// otherwise -- Play soccer

		// If you are a girl
		// If you are rich -- Buy a LV bag
		// otherwise -- Read a book

		// If you are none
		// Invalid gender

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your gender (boy/girl)");
		String gender = scan.next();

		System.out.println("Are you rich? (true/false)");
		boolean rich = scan.nextBoolean();

		if (gender.equalsIgnoreCase("boy")) { // equalsIgnoreCase() is NOT case sensitive
			System.out.println("Yay it is a boy!");

			if (rich) {
				System.out.println("Buy a Ferrari");
			} else {
				System.out.println("Play soccer");
			}

		} else if (gender.equalsIgnoreCase("girl")) {
			System.out.println("Oh no, it is a girl :) ");

			if (rich) {
				System.out.println("Buy a LV bag");
			} else {
				System.out.println("Read a book");
			}

		} else {
			System.out.println("Invalid gender!");
		}

	}

}
