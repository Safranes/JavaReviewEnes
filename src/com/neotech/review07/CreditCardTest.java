package com.neotech.review07;

public class CreditCardTest {

	public static void main(String[] args) {
		// Create a class CreditCard and define variable balance and interest.
		// Create an instance method that will calculate interest based on the given
		// balance.
		// Create 2 subclasses: Visa and AX. In AX class override method calculate
		// interest.
		// Call the method by creating an object of each of the three classes.

		CreditCard cc1 = new CreditCard(12000);
		cc1.calculateInterest();
		
		CreditCard cc2 = new Visa(12000);
		cc2.calculateInterest();
		
		CreditCard cc3 = new AX(12000);
		cc3.calculateInterest();
		
		System.out.println("------This is extra to show the usability of upcasting------");
		CreditCard[] cc = new CreditCard[3];
		cc[0] = new CreditCard(6000);
		cc[1] = new Visa(6000);
		cc[2] = new AX(6000);
		
		for (CreditCard card : cc) {
			card.calculateInterest();
		}
		
	}
}