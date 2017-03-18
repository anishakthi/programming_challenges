package org.abc.sample;

public class SquareMatrix {
	public static void main(String[] args) {
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;
		int[][] sqMatrix = new int[][] {{5,6,7,8},{1,2,5,4},{1,2,3,6},{6,2,3,6}};
		System.out.print("Primary Diagonal elements are ");
		for(int i = 0; i< sqMatrix.length ; i++) {
			int[] row = sqMatrix[i];
			System.out.print(" " +row[i]);
			primaryDiagonalSum = primaryDiagonalSum + row[i];
		}
		System.out.println(" Their Sum is  "+ primaryDiagonalSum);
		
		System.out.print("Secondary diagonal elements are ");
		int size = sqMatrix.length-1;
		for(int i = 0; i < sqMatrix.length; i++) {
			int[] row = sqMatrix[i];
			System.out.print( " " +row[size]);
			secondaryDiagonalSum = secondaryDiagonalSum + row[size];
			size--;
		}
		System.out.println(" Their Sum is  "+ secondaryDiagonalSum);
		
		int difference = primaryDiagonalSum - secondaryDiagonalSum;
		difference = difference < 0 ? -difference : difference;
		System.out.println("Absolute difference is " + difference);
		
	}
}
