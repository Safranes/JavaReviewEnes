package com.neotech.review04;

public class StringManipulations {
	public static void main(String[] args) {

		String str = "Pershendetje";

		System.out.println(str.length());
		System.out.println(str.isEmpty());

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str); // The original has not changed

		boolean equal = str.equals("pershendetje");
		System.out.println(equal);

		System.out.println(str.equalsIgnoreCase("pershendetje"));

		System.out.println("----------------");
		System.out.println(str.contains("SH"));
		System.out.println(str.contains("SH".toLowerCase()));

		boolean starts = str.startsWith("p");
		System.out.println(starts);

		System.out.println("Does Pershendetje start with Per?");
		str.startsWith("Per");

		boolean ends = str.endsWith("Pershendetje");
		System.out.println(ends);
		System.out.println("----------------");

		String str2 = "Hello" + " " + "World";
		System.out.println(str2);

		String str3 = "Hello".concat(" ").concat("World").toLowerCase(); // Method chaining
		System.out.println(str3);

		String str5 = "   Hello World       ";
		System.out.println(str5.trim().length());

		String str6 = "Hi there";
		char letter = str6.charAt(4);
		System.out.println(letter);

		System.out.println("----------------");
		System.out.println(str6.indexOf('h'));
		System.out.println(str6.indexOf("e"));

		int indexOfSecondE = str6.indexOf("e", 6); // Overloaded methods = Methods with same name
		System.out.println("indexOfSecondE -> " + indexOfSecondE);
	}
}
