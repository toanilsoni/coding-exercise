//https://www.geeksforgeeks.org/count-elements-in-first-array-with-absolute-difference-greater-than-k-with-an-element-in-second-array/
// https://github.com/ShreyasKadiri/LeetCode/blob/master/Reductor%20array.java 
package list;

public class ReductorArray {

	public static void main(String[] args) {

		int arr1[] = { 3, 1, 4 };
		int arr2[] = { 5, 1, 2 };
		int k = 2;
		System.out.println(compareValue(arr1, arr2, k));
	}

	public static int compareValue(int arr1[], int arr2[], int k) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if ((Math.abs(arr1[i] - arr2[j]) > k)) {
					count++;
				}
			}
		}

		return count;

	}

}
