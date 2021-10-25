package com.neotech.review08.Abstraction;

public class World {
	public static void main(String[] args) {
		Human h1=new Albanian("Flori"); //Up-casting-->Creating an object of Albanian class and storing into Human class
		//This will be able to use only human class methods and will execute the overriden methods that are in Albanian class
		h1.talk();
		h1.sleep();
		//h1.albanianDance();// we need to downcast to use Albanian only methods--> see below !!
		
		Albanian a1=(Albanian) h1;//Down-casting, but not safe we might make a mistake and compiler may not warn us
		//so we need to check by using instanceof keyword--> Safe Down-casting
		a1.albanianDance();
		
		Human h2 =new Turkish("Ivonne");
		h2.talk();
		h2.sleep();
		
		//Albanian a2=(Albanian) h2; // This will give a run time error when you are executing the code
		//Because h2 is a Turkish object!! Let's prove that by trying to Downcast safely (safe check) by using instanceof keyword
		
		if(h2 instanceof Albanian) {
			Albanian a2 =(Albanian) h2;
			a2.albanianDance();
		}
		
		
	}

}
