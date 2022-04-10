
public class ReverseArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4 };

		reverseArray(array);
	}

	public static void reverseArray(int[] array) {
		int reverseArray [] = new int [array.length];
		int j = array.length;
		for (int i = 0 ; i < array.length; i++) {
			reverseArray [j-1] = array[i];
			j = j-1;
		}
		
		for (int k = 0 ; k < array.length; k++) {
			System.out.print(reverseArray[k] + " ");
		}

	}

}
