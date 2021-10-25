package com.neotech.review06;

public class HospitalApplication {

	public static void main(String[] args) {
		Doctor d1 = new Doctor("John", 120000, "D1234");
		d1.checkUp("Burak");

		// These are variables and methods of child
		// d1.dermId
		// d1.applySkinTreatment()

		Dermatologist d2 = new Dermatologist();
		d2.name = "Okan";
		d2.salary = 200000;
		d2.licenseId = "D789";
		d2.dermId = "XYZ";

		d2.checkUp("Eric");
		d2.applySkinTreatment();

		System.out.println("---------------");
		// creating a Dermatologist with initial information
		Dermatologist d3 = new Dermatologist("Hakan", 185000, "D007");
		d3.dermId = "QRS";
		d3.applySkinTreatment();
		
		System.out.println("---------------");
		// creating a Dermatologist with 4 parameters
		Dermatologist d4 = new Dermatologist("Enes", 300000, "D297", "PFG");
		d4.applySkinTreatment();


	}

}
