package com.neotech.review05;

public class SplitDemo {
public static void main(String[] args) {
	String longStr = "I am very happy today, because today is not Monday";

	String[] stringArray = longStr.split("today");

	System.out.println(stringArray.length);

	System.out.println("---Iterating using enhanced for loop---");
	for (String str : stringArray) {
		System.out.println(str);
	}

	System.out.println("---Iterating using normal for loop---");
	for (int i = 0; i < stringArray.length; i++) {
		System.out.println(stringArray[i]);
	}

	System.out.println("-------------------");

	longStr = "I like 6 because 7 ate 9 yesterday";

	stringArray = longStr.split("[6-9]"); // looking for numbers 6 through 9
	// stringArray = longStr.split("[69]"); // looking for numbers 6 and 9
	// stringArray = longStr.split("69"); // looking for numbers 69

	System.out.println(stringArray.length);

	for (String str : stringArray) {
		System.out.println(str);
	}

}
}
