package com.neotech.review03;

public class TwoD_ArrayIntro {

	public static void main(String[] args) {
		int[][] numbers = new int[3][4]; // [rows][columns]

		numbers[1][2] = 13;
		numbers[2][1] = 17;
		numbers[0][0] = 10;
		numbers[2][0] = 11;

		// numbers[3][1] = 2; // run-time error

		int rows = numbers.length; // number of rows
		System.out.println("The number of rows -> " + rows);

		// The length of row with index 1
		int cols = numbers[1].length;
		System.out.println("The number of columns in the row with index 1 -> " + cols);

		for (int row = 0; row < numbers.length; row++) {

			System.out.print("Row " + row + " -> ");

			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();

		}

		}
	}


