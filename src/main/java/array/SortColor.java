//https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#axzz7Q1I8VRMv

package array;

import java.util.Arrays;

public class SortColor {

	public static void main(String[] args) {

		int[] array = { 1, 0, 0, 1, 0, 1, 1, 0, 1, 0 };

		sortColor(array);
	}

	public static void sortColor(int[] array) {

		int i = 0;
		int j = array.length - 1;
		int temp = 0;

		while (i <= j) {
			if (array[i] > array[j]) {
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			
			} else if(array[i] == array[j]) {
				j--;
			}
			i++;
			j--;
		}

		System.out.print("Result" + Arrays.toString(array));
	}

}
