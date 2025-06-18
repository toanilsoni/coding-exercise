package array;

public class TwoDimensionalArrayDemo {
	
	public static void main(String args []) {
	
		int [] []  inputArray = new int[4] [4];
		
		
		for(int row=0; inputArray.length>row; row++) {
			for(int col=0; inputArray[row].length>col; col++) {
				inputArray [row][col] = row*col;
			}
		}
		
		for(int row=0; inputArray.length>row; row++) {
			for(int col=0; inputArray[row].length>col; col++) {
				inputArray [row][col] = row*col;
				System.out.println(inputArray[row][col] + "\t");		
			}	
		}
		//System.out.println();
		
		//System.out.println(inputArray.toString());
	}
}
