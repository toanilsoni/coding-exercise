// https://www.knowprogram.com/java/sum-of-diagonal-elements-matrix-java/
package misc;

public class SumOfDiagonalElements {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 5 }, { 4, 5, 6 }, { 3, 3, 6 } };
		sumOfDiagonalElements(matrix);
	}

	public static void sumOfDiagonalElements(int[][] matrix) {

		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					sum += matrix[i][j];
				}
			}
		}

		System.out.println(sum);

	}

}
