package com.neotech.review06_other;

import com.neotech.review06.USA;

public class Mexico {

	public static void main(String[] args) {	
		USA us = new USA();
Mexico mx=new Mexico();

		System.out.println("Accessing the variables from inside the Mexico");
		// private, protected and default variables
		// cannot be accessed from outside the package
		// System.out.println("private -> " + us.capitalCity);
		// System.out.println("protected -> " + us.mainState);
		// System.out.println("default -> " + us.normalState);
		System.out.println("public -> " + us.bestSchool);

		System.out.println();

		System.out.println("Accessing the methods from inside the Mexico");
		// selectPresident() is private
		// us.selectPresident();
		// playNBA() is protected->Mexico class needs to extend USA and you need to create an object of class Mexico then call it
		// us.playNBA();
		us.speakEnglish();

	
	
	}

}
