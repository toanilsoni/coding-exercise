//Rotate the array right by k positions.

package array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		//rotateArray(array, array.length, k);
		rotateArrayApproach2(array, array.length, k);
	}

	public static void rotateArray(int[] array, int size, int k) {

		int result[] = new int[array.length];

		for (int i = 0; i < k; i++) {
			result[i] = array[array.length - k + i];
		}

		int j = 0;
		for (int i = k; i < array.length; i++) {
			result[i] = array[j];
			j++;
		}

		System.out.println(Arrays.toString(result));

	}
	
	public static void rotateArrayApproach2(int[] arr, int size, int k) {

		for (int i = 0; i < k; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
