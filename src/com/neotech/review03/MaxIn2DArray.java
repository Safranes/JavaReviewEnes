package com.neotech.review03;

public class MaxIn2DArray {

	public static void main(String[] args) {
		// Task: Find the biggest number in a 2D Array
				int[][] b = { { 2, 3, 5 }, { 2, 4, 7 }, { 8, 1, 9 }, { 3, 5, 1 } };

				int biggest = b[0][0];

				for (int row = 0; row < b.length; row++) {

					for (int col = 0; col < b[row].length; col++) {
						int element = b[row][col];

						if (element > biggest) {
							// When I find a bigger element
							// I have to update the biggest number
							biggest = element;
						}
					}

				}

				System.out.println("The biggest number is " + biggest);

				System.out.println("----------------");

				int max = b[0][0];
				for (int[] row : b) {

					for (int element : row) {

						if (element > max) {
							max = element;
						}

					}

				}

				System.out.println("The maximum number is " + max);

	}

}
