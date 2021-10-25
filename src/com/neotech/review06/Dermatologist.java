package com.neotech.review06;

//Doctor is the parent/base/super class
//Dermatologist is the child/derived/sub class
public class Dermatologist extends Doctor {
	String dermId;

	public Dermatologist() {
		// super();
		// implicitly it is calling the default constructor of the parent
	}

	// The constructors are NOT inherited
	Dermatologist(String name, int salary, String licenseId) {
		super(name, salary, licenseId);

		// super.name = name;
		// super.salary = salary;
		// super.licenseId = licenseId;
	}

	Dermatologist(String name, int salary, String licenseId, String dermId) {
		super(name, salary, licenseId);
		this.dermId = dermId;
	}

	public void applySkinTreatment() {
		System.out.println("Doctor " + name + " applies skin treatment");
	}

}
