package com.neotech.review08.Interfaces;

public class Coconut extends Fruit implements Crackable {

	public Coconut(String color) {
		super(color);
	}

	@Override
	public void crack() {
		System.out.println("Cracking the coconut.");
		
	}

}
