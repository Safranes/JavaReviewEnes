package com.neotech.review05;

public class ArrayManipulation {

	public static void main(String[] args) {
		int[] array = { 5, 2, 7, 3, 9, 6 };

		System.out.println("The initial values of the array");
		for (int i : array) {
			System.out.print(i + " ");
		}

		ArrayManipulation manip = new ArrayManipulation();

		int result = manip.largest(array); // I am passing the array as an argument
		System.out.println("\nThe largest element int the array is " + result);

		// That's how you're gonna call the method
		result = manip.arraySum(array);
		System.out.println("The sum of the array is " + result);

		double average = manip.arrayAverage(array);
		System.out.println("The average is " + average);
	}

	// Task3: Create a method that will get an array of integers
	// and return the average as double
	double arrayAverage(int[] arr) {
		double sum = 0;//We declare as double so we can get the exact average 
		//when we divide sum bye the arr.length

		for (int el : arr) {
			sum += el;
		}

		double average = sum / arr.length;
		return average;
	}

	// Task2: Create a method that will get an array of integers
	// and return the sum of the array
	protected int arraySum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

	public int largest(int[] arr) {
		int largest = arr[0];

		for (int el : arr) {
			if (el > largest) {
				largest = el;
			}
		}

		return largest;
	}

	}


