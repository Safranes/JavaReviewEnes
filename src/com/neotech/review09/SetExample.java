package com.neotech.review09;

import java.util.*;

public class SetExample {
	// Collection
		// List | Set | Queue (Three interface inheriting Collection)
		// ArrayList | LinkedList (Two classes implementing the List interface)
		// HashSet | LinkedHashSet | TreeSet (Three classes implementing Set interface)

		public static void main(String[] args) {
			Set<String> africaLinked = new LinkedHashSet<>();
			africaLinked.add("Tunisia");
			africaLinked.add("Morocco");
			africaLinked.add("Kenya");

			System.out.println(africaLinked.size());

			// I will try to add duplicates
			boolean added = africaLinked.add("Kenya");
			System.out.println("Am I able to add -> " + added);

			System.out.println("LinkedHashSet -> " + africaLinked);

			// Can I add with an index in a SET? NO
			// africaLinked.add(1, "Egypt");

			Set<String> africaHash = new HashSet<>(africaLinked);
			System.out.println("HashSet -> " + africaHash);

			Set<String> africaTree = new TreeSet<>();
			africaTree.addAll(africaLinked);
			System.out.println("TreeSet -> " + africaTree);

			boolean egypt = africaLinked.contains("Egypt");
			System.out.println(egypt);
			System.out.println(africaTree.isEmpty());
			boolean ableToRemove = africaLinked.remove("Kenya");
			System.out.println("Able to remove: " + ableToRemove);
			System.out.println("Linked -> " + africaLinked);

			System.out.println("TreeSet -> " + africaTree);
			// Note: You are not able to get/add/remove by index in a SET!!!!!!!!!!

			System.out.println("----1st way, Normal for loop does NOT work in SET");
			// Because I cannot get by index
//			for (int i = 0; i < africaTree.size(); i++) {
//				africaTree.get(i);
//			}

			System.out.println("----2nd way, Enhanced/Advanced for loop");
			for (String country : africaTree) {
				System.out.println(country);
			}

			System.out.println("----3rd way, Iterator");
			Iterator<String> iterator = africaTree.iterator();
			while (iterator.hasNext()) {
				String country = iterator.next();
				System.out.println(country);
			}

			System.out.println("------------------------------");
			// YOU HAVE TO KNOW THESE BY HEART!!!MEMORIZE!!!
			// 1. List preserves insertion order, but Set does NOT
			// 2. List contains duplicates, but Set contains UNIQUE objects
			
			//TERMINOLOGIES- BE CAREFUL VERY SIMILAR!
			// Collections Framework -- All interfaces and implementation
			// Collection Interface -- Only one interface
			// Collections -- It is a helper/utility class

			System.out.println(africaHash);				//Since it is a set of Strings
			String minimum = Collections.min(africaHash);//min method will return me the 1st string in alphabetical order!!
			System.out.println("minimum -> " + minimum);

			Set<Integer> numbers = new HashSet<>();
			numbers.add(56);
			numbers.add(61);
			numbers.add(23);
			numbers.add(25);
			numbers.add(81);
			numbers.add(20);
			System.out.println(numbers);

			Integer min = Collections.min(numbers);
			System.out.println("min -> " + min);

			System.out.println("max -> " + Collections.max(numbers));

			// HashSet cannot be sorted/ordered-->Because it is scrambled!! /No order/Random
			// Collections.sort(numbers);

			// List can be sorted
			List<Integer> numberList = new ArrayList<>(numbers);
			Collections.sort(numberList);
			
			System.out.println("Sorted number List -> " + numberList);
		}

	}