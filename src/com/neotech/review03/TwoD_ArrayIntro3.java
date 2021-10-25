package com.neotech.review03;

public class TwoD_ArrayIntro3 {

	public static void main(String[] args) {
		
		int[][] nums = { 
				{ 8 }, 
				{ 9, 5, 2, 7 }, 
				{ 6, 4 }
		};
		
		System.out.println(nums[2][1]);
		// System.out.println(nums[0][1]); //run-time error

		System.out.println("The length of second row " + nums[1].length);
		System.out.println("The number of rows " + nums.length);
		System.out.println("The length of row with index 0 -> " + nums[0].length);
		
		System.out.println("------------------");

		for (int row = 0; row < nums.length; row++) {
			// nums[row].length will give me the length of that specific row

			for (int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();

		}

		System.out.println("------------------");

		// enhanced/advanced for loop
		for (int[] array : nums) {

			for (int number : array) {
				System.out.print(number + " ");
			}
			System.out.println();

		}

	}

}
