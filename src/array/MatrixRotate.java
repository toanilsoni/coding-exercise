//

package array;

public class MatrixRotate {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, 
						   { 4, 5, 6 }, 
						   { 7, 8, 9 } };

		System.out.println(matrixRotate(matrix));
	}

	public static int[][] matrixRotate(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] result = new int[row][col];
		
		for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[0].length; j++) {
				
				result [j][col-1-i] = matrix[i][j];
				
			}
		}
		
		for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[0].length; j++) {
				
				System.out.println(result[i][j]);
				
			}
		}


		return result;

	}

}
