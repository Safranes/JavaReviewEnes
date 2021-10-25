package com.neotech.review08.Interfaces;

public class FruitDemo {
public static void main(String[] args) {
	Apple a=new Apple("Yellow");
	a.wash();
	a.peel();
	
	Coconut c=new Coconut("Brown");
	c.crack();

	Fruit f=new Apple("Red");//Up-casting
	f.color="Black";
	
	if(f instanceof Apple) {
		//If f is instance of Apple then you can safely downcast it to Apple
		Apple apple=(Apple) f;
		apple.wash();
		apple.peel();
	}else if(f instanceof Coconut) {
//		If f is instance of Coconut then you can safely downcast it to Coconut
		Coconut coco=(Coconut) f;
		coco.crack();
	}
	
	//Task1
	//Create an Orange class that extends Fruit and implements Peelable
	//And crate an object in FruitDemo
	Orange o= new Orange("Orange");
	o.peel();
	
	Peelable p1=new Apple("Green");
	Peelable p2=new Orange("Orange");
	//I can only call peel() method
	p1.peel();
	
	
	



}
}
