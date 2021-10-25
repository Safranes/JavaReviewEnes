package com.neotech.review07;

public class Albanian extends Human {

	public Albanian() {

	}

	public Albanian(String name) {
		super(name);
	}

	// When overriding the method signature(method name+parameters) must be the same
	@Override // -> This is letting us know if we did the overriding correctly or not
	public void talk() {
		System.out.println("Une flas shqip. Une quhem " + name);
	}

	public void albanianDance() {
		System.out.println("Dancing valle kosovare!");
	}

}
