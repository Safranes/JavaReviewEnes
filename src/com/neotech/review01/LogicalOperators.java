package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {

		// ask the user to enter age
		// if age is from 1 to 3 --> you are a baby
		// if age from 4-5 --> you are a toddler
		// if age from 6-12 --> you are a kid
		// if age from 13-19 --> teenager
		// if age >= 20 --> you are an adult

	Scanner input=new Scanner(System.in);
	
	System.out.println("Please enter your age");
	int age=input.nextInt();
	
	if(1<=age&&age<=3) {
		System.out.println("You are a baby");
	}else if(age==4||age==5) {
		System.out.println("You are a toddler");
	}else if(6<=age&& age<=12) {
		System.out.println("You are a kid");
	}else if(13<=age&& age<=19) {
		System.out.println("You are a teenager");
	}else if(age>=20) {
		System.out.println("You are an adult");
	}else {
		System.out.println("Invalid input");
	}
	
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Please enter your age!");
//	int age = scan.nextInt();
//
//	String result = "";
//
//	if (age >= 1 && age <= 3) { // using AND is better for a range of numbers
//		result = "baby";
//	} else if (age == 4 || age == 5) { // using OR is better for individual values
//		result = "toddler";
//	} else if (age >= 6 && age <= 12) {
//		result = "kid";
//	} else if (age >= 13 && age <= 19) {
//		result = "teenager";
//	} else if (age >= 20) {
//		result = "adult";
//	} else {
//		result = "alien";
//	}
//
//	System.out.println("You are a/an " + result);
//	
	
	
	
	
	
	
	}
}
