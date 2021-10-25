package com.neotech.review05;

public class ToCharArray {
	public static void main(String[] args) {
		String longStr = "I am very happy today, because today is not Monday";
		System.out.println(longStr.length());

		char[] charArray = longStr.toCharArray();
		System.out.println(charArray.length);

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();

		for (char letter : charArray) {
			int code = letter; // find the ASCI code for the character..Every letter has a specific code
			System.out.println(letter + " -> " + code);
		}

		System.out.println("------------------");
		// Don't use replace method
		// Task: Print the whole array, but replace the letter "a" with "e"

		//If we use '\n' instead of '\t' it will jump to a new line instead of leaving a tab before the sentence
		System.out.println("\tReplace \"a\" with \"e\"");
		for (char letter : charArray) {

			// if there is only one statement inside if or else body
			// we can remove the curly brackets
			if (letter == 'a')
				System.out.print('e');
			else
				System.out.print(letter);

		}
		System.out.println();

		//We could also use continue; keyword instead of using else
	}
}
