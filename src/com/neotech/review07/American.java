package com.neotech.review07;

public class American extends Human {
	String ssn;

	public American(String name, String ssn) {
		super(name);//Parent class is setting the name so we use that constructor
		//instead of typing super.name=name;
		this.ssn = ssn;
	}

	@Override
	public void talk() {
		System.out.println("I speak English. My name is " + name);
	}

	public void taxReturn() {
		System.out.println("I am doing my tax return.");
	}
}
