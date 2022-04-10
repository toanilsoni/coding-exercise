//https://www.geeksforgeeks.org/reverse-an-array-in-java/

package array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] array = { 2, 4, 3, 5, 7, 8, 9 };

		reverseArray(array);
	}

	public static void reverseArray(int[] array) {
		int[] result = new int[array.length];

		int j = array.length;
		for (int i = 0; i < array.length; i++) {
			result[j - 1] = array[i];
			j--;
		}
		System.out.print(Arrays.toString(result));

	}

}
