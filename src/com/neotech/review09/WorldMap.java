package com.neotech.review09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class WorldMap {
	public static void main(String[] args) {
		Map<String, String> europe = new TreeMap<>(); // order by the key-Alphabetically because keys are String
		europe.put("Germany", "Berlin");
		europe.put("Albania", "Tirana");
		europe.put("Italy", "Rome");
		System.out.println(europe);

		Map<String, String> asia = new LinkedHashMap<>(); // order is preserved
		asia.put("Turkey", "Ankara");
		asia.put("Tajikistan", "Dushanbe");
		asia.put("Uzbekistan", "Tashkent");
		System.out.println(asia);

		Map<String, String> africa = new HashMap<>(); // no order
		africa.put("Egypt", "Cairo");
		africa.put("Moroco", "Rabat");
		africa.put("Ghana", "Accra");
		System.out.println(africa);

		// HW1 iterate europe using the keys --> keySet(); Enhanced for loop
		// HW2 iterate asia using the values --> values(); Iterator

		// This is for next class
		// Storing Maps in a List
		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(asia);
		world.add(africa);
		System.out.println(world);
		System.out.println("World size is -> " + world.size());

		Map<String, String> continent = world.get(1);
		System.out.println("The object with index 1 is -> " + continent);

		System.out.println("---------------------------");

		// Let us iterate the List
		for (Map<String, String> el : world) {
			// System.out.println(el);
			// Let us iterate the map
			Set<String> countries = el.keySet();
			for (String country : countries) {
				System.out.println(country + " -> " + el.get(country));
			}
			System.out.println("----");
		}

	}
}
