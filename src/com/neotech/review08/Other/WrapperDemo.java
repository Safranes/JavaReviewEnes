package com.neotech.review08.Other;

public class WrapperDemo {
	public static void main(String[] args) {
		
		// All the primitive data types have corresponding Wrapper classes
		//We need wrapper classes to be able to use primitive data types in Collections by wrapping them into a wrapper class
		//Because in Collections we cannot store primitive data types!!!!
		int int1 = 9;
		Integer integer1 = new Integer(int1); // Boxing/Wrapping
		int int3 = integer1.intValue(); // UnBoxing/UnWrapping

		// Easy way
		int int2 = 7;
		Integer integer2 = int2; // Auto-Boxing, Auto-Wrapping, Auto-converting(From a primitive data type to Integer class)
		int int4 = integer2; // Auto-UnBoxing, Auto-UnWrapping, Auto-converting

		Boolean b1 = false; // Auto-Boxing

		// Double wrapper
		Double d1 = 4.2; // Auto-Boxing

		// All the primitive data types have corresponding Wrapper classes
		/*
		 * int -> Integer
		 * short -> Short
		 * byte -> Byte
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 * boolean -> Boolean
		 * char -> Character
		 * 
		 */
		
	}

}
