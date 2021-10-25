package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
		// byte<short<int<long<float<double
		int intNumber = 24;

		// widening/implicit casting/automatically
		double d = intNumber;

		System.out.println("The intNumber is " + intNumber);
		System.out.println("The doubleNumber is " + d);

		// 24 is between -128 and 127
		// narrowing/explicit casting/manually
		byte byteNumber = (byte) intNumber;
		System.out.println("The byteNumber is " + byteNumber);

		intNumber = 2400;
		byteNumber = (byte) intNumber;
		// In this case I lost data
		System.out.println("The byteNumber is " + byteNumber);

		// widening/implicitly/automatically
		byte b1 = 80;
		int i1 = b1;
		System.out.println("i1 = " + i1);

	}

}
