package com.neotech.review06;

public class Canada {
	public static void main(String[] args) {
		USA us = new USA();
		System.out.println("Accessing the variables from inside the Canada");
		// capitalCity is private
		// System.out.println("private -> " + us.capitalCity);
		System.out.println("protected -> " + us.mainState);
		System.out.println("default -> " + us.normalState);
		System.out.println("public -> " + us.bestSchool);

		System.out.println();

		System.out.println("Accessing the methods from inside the Canada");
		// selectPresident() is private
		// us.selectPresident();
		us.playNBA();
		us.speakEnglish();

		
	}

}
