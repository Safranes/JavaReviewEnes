package com.neotech.review04;

public class SubstringDemo {
	public static void main(String[] args) {
		String longStr = "I am very happy today because it is not Monday";

		String anotherStr = longStr.substring(5, 7);
		System.out.println(anotherStr);

		anotherStr = longStr.substring(5);
		System.out.println(anotherStr);

		// longStr = longStr.substring(10);  --->Overriding the longStr variable
		// System.out.println(longStr);

		// Run-Time Error
		// longStr.substring(7, 5);
		// longStr.substring(5, 100);
		// longStr.substring(-1, 10);

	}
	
}
