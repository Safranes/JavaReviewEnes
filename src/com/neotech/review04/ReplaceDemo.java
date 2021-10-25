package com.neotech.review04;

public class ReplaceDemo {
	public static void main(String[] args) {
		String longStr = "I am very happy today because today it is not Monday";

		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);

		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);

		System.out.println("----------------");

		// Regular expression
		anotherStr = longStr.replaceAll("[a-z]", "*");
		System.out.println(anotherStr);

		String ssn = "598-659-8745";
		String newSSN = ssn.replaceAll("[4-6]", "*");
		System.out.println(newSSN);

		System.out.println("Let's remove the dashes from ssn");
		newSSN = ssn.replaceAll("[^0-9]", "");
		System.out.println(newSSN);

		// A task for hard working students
		// Hide all the numbers and leave the last four digits of ssn
		// ***-***-8745
		// Do NOT hard code it :)
		
		String ssn1;
		ssn1 = ssn.substring(0, 7).replaceAll("[0-9]", "*").concat(ssn.substring(7, 12));
		System.out.println(ssn1);
	}
}
