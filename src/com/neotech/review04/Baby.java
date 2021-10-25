package com.neotech.review04;

public class Baby {
String name;
char gender;
int weight;
String hairColor;


void talk() {
	System.out.println("Baby "+name+" is talking");
}

void talking(String word,int times) {
	for(int i=0; i<times; i++) {
		System.out.print(word+" ");
	}
	System.out.println();
}
void cry() {
	System.out.println("Baby "+name+" is crying");
}

void eat() {
	System.out.println("Baby "+name+"is eating");
}

void displayInformation() {
	System.out.println(name+", gender is "+gender+", weight is "+weight);
}

}
