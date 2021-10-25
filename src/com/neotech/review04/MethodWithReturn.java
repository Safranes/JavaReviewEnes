package com.neotech.review04;

public class MethodWithReturn {

	public static void main(String[] args) {

		String name="Okan";
		int numOfCharacters=name.length();
		
		System.out.println("The length of "+name+ " is "+ numOfCharacters);
		
		String name2="Ozel";
		System.out.println("The length of "+name2+" is "+name2.length());
			
		MethodWithReturn m=new MethodWithReturn();
		
		System.out.println(m.isOdd(30));
		boolean res=m.isOdd(17);
		System.out.println("17 is odd-> "+res);
		
		System.out.println("15 is odd-> "+m.isOddEnhanced(15));
	}
	
	boolean isOdd(int num){
		boolean result;
		if(num%2==1) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}

	
	boolean isOddEnhanced(int num) {
		return (num%2==1);
	}
}
