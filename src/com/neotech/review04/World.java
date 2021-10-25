package com.neotech.review04;

public class World {

	public static void main(String[] args) {
		// Here is where we gonna create babies
		
		//Declaring and assigning(to baby1) a value 
		Baby baby1=new Baby();
		baby1.name="James";//-->This will set the name
		baby1.weight=6;
									//this will get the name->baby1.name
		System.out.println("The name of the baby1 is "+ baby1.name);
		System.out.println("The hair color is "+baby1.hairColor);

		baby1.gender='M';
		baby1.hairColor="brown";
		System.out.println("The hair color is "+baby1.hairColor);

		System.out.println("--------------");
		
		//Declaring a variable of type Baby
		Baby baby2;
		
		//Creating a baby and assigning it to the variable
		baby2=new Baby();
		
		baby2.weight=6;
		baby2.name="Aisha";
		baby2.gender='F';
		baby2.hairColor="Black";
		
		System.out.println("Theahair color of baby1 is "+baby1.hairColor);
		System.out.println("The hair color of baby2 is "+baby2.hairColor);
	
		System.out.println("---------");
		baby1.talk();
		baby1.cry();
		
		baby2.talk();
		System.out.println("------------");
	
		
		baby1.displayInformation();
		baby1.talking("Bla", 5);
	
		baby2.talking("gugu", 3);
	
	}

}
