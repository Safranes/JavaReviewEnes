package com.neotech.review08.Interfaces;

public class Apple extends Fruit implements Peelable, Washable{

	public Apple(String color) {
		super(color);
	}

	@Override
	public void peel() {
		System.out.println("Peeling the apple.");
		
	}

	@Override
	public void wash() {
		System.out.println("Washing the apple.");
		
	}
	

}
