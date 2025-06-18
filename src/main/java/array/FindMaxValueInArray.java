//

package array;

public class FindMaxValueInArray {

	public static void main(String[] args) {

		int[] array = { 2, 4, 3, 50, 7, 8, 9 };

		findMaxValueInArray(array);
	}

	public static void findMaxValueInArray(int[] array) {

		// Arrays.sort(array);
		// System.out.println(array[array.length-1]);

		int maxValue = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > maxValue) {
				maxValue = array[i];
			}

		}

		System.out.println(maxValue);
	}
}
