package com.neotech.review06;

public class Human {
String name;
int age;
int weight;

Human(String name, int age, int weight){
	this.name=name;
	this.age=age;
	this.weight=weight;
	
}

public void displayInfo(){
	System.out.println("Name :"+ name+" age:"+age+" weight:"+weight);
}
public static void main(String[] args) {
	Human g=new Human("Atlas",1,4);

	g.displayInfo();
}





}
