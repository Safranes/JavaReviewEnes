package com.neotech.review06;

public class World {

	public static void main(String[] args) {
		// 1st way, using constructor with no parameters
		Person p1 = new Person();
		p1.displayInfo();

		p1.name = "Hakan";
		p1.weight = 180;
		p1.displayInfo();

		System.out.println("-----------------");
		// 2nd way, using constructor with two parameters
		Person p2 = new Person("Musafa", 185);
		p2.displayInfo();

		p2.age = 24;
		p2.displayInfo();

		System.out.println("-----------------");
		Person p3 = new Person("Erdogan", 185, 47);
		p3.displayInfo();

	}

}
