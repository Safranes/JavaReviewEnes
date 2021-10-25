package com.neotech.review09;

import java.util.*;

public class Duplicates {
	public static void main(String[] args) {
		// How do you remove duplicates from the list?
		List<String> al = new LinkedList<String>();
		al.add("Mufasa");
		al.add("Flori");
		al.add("Evis");
		al.add("Flori");
		al.add("Enes");
		al.add("Evis");
		al.add("Flori");
		System.out.println(al);

		// HashSet - No duplicates, no order
		Set<String> hs = new HashSet<>();
		hs.addAll(al); // Add a collection to the set
		System.out.println(hs); // HashSet does not preserve/keep the insertion order

		// LinkedHashSet - No duplicates, has insertion order
		Set<String> lhs = new LinkedHashSet<>();
		lhs.addAll(al);
		System.out.println(lhs);

		// TreeSet - No duplicates, increasing order-->For Strings alphabetical order &For integers it is increasing order
		Set<String> ts = new TreeSet<>(al); // Constructor, adding the collection to the TreeSet
		System.out.println(ts);

		////////////////////////////////////////////////////////
		// Task: Remove duplicates without using Set Interface
		List<String> list2 = new ArrayList<String>();
		for (String element : al) {
			if (!list2.contains(element)) {
				list2.add(element);
			}
		}
		System.out.println(list2);
		////////////////////////////////////////////////////////

		// Let's get the 2nd element from the list
		String element2 = al.get(1);
		System.out.println(element2);

		// Can I get the 2nd element from the set? NO
		// Because Set does not promise to preserve insertion order(It doesn't have index!!)
		//But you can use LinkedHashSet so you can have an insertion order but not able to get it by index bcz there is no index
		// String el2 = ts.get(1);

		System.out.println(al);
		// String[] array = (String[]) al.toArray();
		Object[] array = al.toArray(); // Converts the List to an Array

		System.out.println("----Before sorting----");
		for (Object el : array) {
			System.out.print(el + "- ");
		}
		System.out.println();

		// class Arrays is a utility class - has methods that work with arrays
		// Method to sort(put it in insertion order) the array
		Arrays.sort(array);

		System.out.println("----After sorting----");
		for (Object el : array) {
			System.out.print(el + "- ");
		}
		System.out.println();

		System.out.println("----List before sorting----");
		System.out.println(al);

		// for collections, there are methods available in the Collections class
		Collections.sort(al);

		System.out.println("----List after sorting----");
		System.out.println(al);
	}
}
