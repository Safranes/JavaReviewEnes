package com.neotech.review08.Other;

import java.util.ArrayList;

public class CollectionIntro {
	public static void main(String[] args) {
		//ARRAYS ARE FIXED IN SIZE BUT ARRAY LISTS ARE DYNAMIC->YOU CAN ADD AND REMOVE ELEMENTS!!
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		boolean isEmp = numbers.isEmpty();
		System.out.println(isEmp);
		System.out.println("Size is: " + numbers.size());

		numbers.add(new Integer(7));
		numbers.add(5); // auto boxing
		numbers.add(8);
		numbers.add(1, 10); // adding at index 1

		isEmp = numbers.isEmpty();
		System.out.println(isEmp);

		System.out.println("Size is: " + numbers.size());

		System.out.println("How can I iterate the ArrayList?");

		System.out.println("----1st way, Normal for loop----");
		for (int i = 0; i < numbers.size(); i++) {
			Integer num = numbers.get(i);
			System.out.println(num);
		}

		System.out.println("----2nd way, Enhanced for loop----");
		for (Integer element : numbers) {
			System.out.println(element);
		}

		System.out.println("----3rd way, using Iterator. NOT today----");
	}

}
