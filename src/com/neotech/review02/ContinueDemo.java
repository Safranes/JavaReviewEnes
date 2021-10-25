package com.neotech.review02;

public class ContinueDemo {

	public static void main(String[] args) {
		
		// I want to celebrate my son's 20 birthdays
		// but not 13th birthday, because we are scared
		
		// Let's use for loop
		
		for (int age=1; age<21; age++) {
		if(age==13) {
			continue;
		}
		System.out.println("Happy Birthday!You are "+age+ " years old.");

	}
	
	//Let's use while loop
		System.out.println("Same thing with while loop");
	
		int age2 = 0;

		while (age2 < 20) {

			age2++;

			if (age2 == 13) {
				continue;
			}
			System.out.println("Happy birthday. You are " + age2 + " years old.");

		}

	
	}

}
