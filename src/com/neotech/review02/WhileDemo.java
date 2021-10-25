package com.neotech.review02;

public class WhileDemo {

	public static void main(String[] args) {
		String greeting = "Salom";

		int count = 0;

		while (count < 5) {
			count++;
			System.out.println(count + " -> " + greeting);
		}

		System.out.println("=========================");

		int i = 1;

		while (true) {

			System.out.println(greeting);

			if (i >= 3) {
				break;
			}

			i++;
		}
	}

}
