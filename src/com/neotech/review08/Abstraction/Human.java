package com.neotech.review08.Abstraction;

public abstract class Human {
	
	String name;
	static final String planet = "World";
	
	//Even though you cannot create objects in Abstract classes you can have constructors!
	public Human(String name) {
		
		this.name = name;
	}

	
	public abstract void talk(); // unimplemented method

	public void sleep() {
		// implemented method, has a method body
		System.out.println("All human sleep the same.");
	
	
	
}
}
