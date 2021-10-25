package com.neotech.review10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PersonMap {

	public static void main(String[] args) {

		Map<Integer, Person> map = new LinkedHashMap<>();

		Person p1 = new Person("Enes", 30, 90000);

		map.put(2, p1);
		map.put(3, new Person("Flori", 40, 98000));
		map.put(1, new Person("Shodmon", 28, 100000));

		printMap(map);

	}

	static void printMap(Map m) {
		Set<Entry<Integer, Person>> set = m.entrySet();

		for (Entry<Integer, Person> entry : set) {
			Person p = entry.getValue();

			System.out.println(p); // same as p.toString()
			// System.out.println(p.toString());
		}
	}

}
