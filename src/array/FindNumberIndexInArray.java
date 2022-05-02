//https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
package array;

public class FindNumberIndexInArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		int key = 5;

		System.out.println(findElementInRotateArray(numbers, key));

	}

	public static int findElementInRotateArray(int[] numbers, int key) {

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == key) {
				return i;
			}

		}

		return -1;
	}

}
