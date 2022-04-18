//https://www.geeksforgeeks.org/merging-intervals/

package array;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {

		int[][] matrix = {{1,3}, 
					      {2,4}, 
					      {5,7}, 
					      {6,8}};

		System.out.println(mergeOverlappingIntervals(matrix));
		
	}

	public static int[][] mergeOverlappingIntervals(int[][] matrix) {
		int [] [] result = new int [matrix.length][matrix[0].length];
		for(int i=0; i<matrix.length-1; i++) {
			for(int j=0; j<matrix[0].length-1; j++) {
				if(matrix[i][1] <= matrix[i+1][1]) {
					result [i] [j] = matrix[i] [j+1]; 
				}
			}
		}
			

		for(int i=0; i<result.length;i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.println(result[i][j]);	
			}
			
		}
		
		return result;

	}

}
