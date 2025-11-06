package Leetcode;

public class MatrixRotation {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int[] row : matrix) {
			for (int row1 : row) {
				System.out.print(row1 + " ");
			}
			System.out.println("");
		}
		int n =matrix.length;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 1; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;

			}
		}
		  for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n / 2; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[i][n - 1 - j];
	                matrix[i][n - 1 - j] = temp;
	            }
	        }
		for (int[] row : matrix) {
			for (int row1 : row) {
				System.out.print(row1 + " ");
			}
			System.out.println("");
		}

	}

}
