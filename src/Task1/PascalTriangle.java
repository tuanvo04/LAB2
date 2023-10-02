package Task1;

import java.util.Arrays;

public class PascalTriangle {

	// This method is used to display a Pascal triangle based
	// on the parameter n.
	// Where n represents the number of rows
	public static void printPascalTriangle(int rows) {
		for (int i = 0; i < rows; i++) {
			int[] row = getPascalTriangle(i + 1);
			System.out.println(Arrays.toString(row));
		}
	}

	// get the nth row.
	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
	public static int[] getPascalTriangle(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n should be a positive integer");
		}

		int[] result = new int[n];
		result[0] = 1;

		for (int i = 1; i < n; i++) {
			result[i] = result[i - 1] * (n - i) / i;
		}

		return result;
	}

	// generate the next row based on the previous row
	// Ex. prevRow = {1} ==> nextRow = {1, 1}
	// Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
	public static int[] generateNextRow(int[] prevRow) {
		int[] nextRow = new int[prevRow.length + 1];
		nextRow[0] = 1;
		nextRow[nextRow.length - 1] = 1;

		for (int i = 1; i < nextRow.length - 1; i++) {
			nextRow[i] = prevRow[i - 1] + prevRow[i];
		}

		return nextRow;
	}

	public static void main(String[] args) {
		int rows = 5; // Adjust the number of rows as needed
		System.out.println("Pascal's Triangle:");
		printPascalTriangle(rows);

		int n = 2; // Specify the row number to retrieve
		System.out.println("\nRow " + n + " of Pascal's Triangle: " + Arrays.toString(getPascalTriangle(n)));

		// Generate the next row based on a given row
		int[] prevRow = { 1, 3, 3, 1 }; // Sample previous row
		int[] nextRow = generateNextRow(prevRow);
		System.out.println("\nNext row after " + Arrays.toString(prevRow) + ": " + Arrays.toString(nextRow));
	}
}
