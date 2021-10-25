package com.neotech.review09;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	// Map
		// HashMap | LinkedHashMap | TreeMap | HashTable
	//---Keys are unique but values can be duplicate/ same with different keys!!!
		public static void main(String[] args) {
			Map<Integer, String> phonebook = new HashMap<>();
			phonebook.put(123456789, "Brad Pitt");
			phonebook.put(345678901, "Donald Trump");
			phonebook.put(222222222, "Obama");
			phonebook.put(111111111, "Brad Pitt");
			phonebook.put(444444444, "James Smith");

			// replacing James Smith with Julia Roberts
			// phonebook.put(444444444, "Julia Roberts");
			// replace is doing the same thing
			//Difference between put and replace!!--If the key is there you can put a new value with the new key entered or change the value with replace
			//but if there is no key you have nothing to replace so it doens't work but you can put into that new key with put
			phonebook.replace(444444444, "Julia Roberts");

			System.out.println(phonebook);

			// Most important!!!-> Map is one-directional, from Key to Value===>So if you have the key you can get the value
			//but if you have the value you cannot get the key because Values can be duplicate
			String name = phonebook.get(222222222); // get the value by using the key
			System.out.println("Calling.... " + name);

			System.out.println("Calling.... " + phonebook.get(999999999));

			boolean containsKey = phonebook.containsKey(999999999);
			System.out.println(999999999 + " exists in my phonebook " + containsKey);

			boolean containsJulia = phonebook.containsValue("Julia Roberts");
			System.out.println("My phonebook has Julia Roberts: " + containsJulia);

			phonebook.remove(345678901); // Will remove the entry (key/value pair) from the map
			System.out.println(phonebook);
			System.out.println("The size of my phonebook: " + phonebook.size());

			System.out.println("--------phonebook.keySet()------------");
			//I cannot iterate the maps because they are not iterating
			//But I can get the keys and iterate them or I can get the values and iterate them
			//We can also get the pairs/entries and iterate them but didn't learn that yet, so not doing right now
			
			// I will get all the keys and store them in a SET of Integers because keys are integer in the phonebook map
			Set<Integer> keys = phonebook.keySet();
			System.out.println(keys);

			for (Integer number : keys) {
				System.out.println(number);
				System.out.println(phonebook.get(number)); // Finding the value using the key
				System.out.println("-----");
			}

			System.out.println("--------phonebook.values()------------");
			Collection<String> names = phonebook.values();
			// I will get all the values and store them in a COLLECTION->!! because it is not unique so we cannot store them in a set
			//why not a list because the insertion order is not preserved so If it is not a set and not a list then I know that 
			//I can store them in a more generic one which is a COLLECTION!!! It needs to be Collection of Strings because values are String
			System.out.println(names);

			for (String element : names) {
				System.out.println(element);
			}

			// From the value you CANNOT find the key
		}

	}