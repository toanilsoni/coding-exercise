package search;
public class BinarySearch2 {

	public static int findNumber(int[] array, int low, int high, int number) {

		int mid;
		if (high >= low) {

			mid = low + (high - low) / 2;

			if (array[mid] == number) {
				return mid;
			}

			if (array[mid] > number) {
				return findNumber(array, low, mid - 1, number);

			} else {
				return findNumber(array, mid + 1, high, number);
			}

		}

		return -1;

	}

	public static void main(String arg[]) {

		int[] array = { 1, 2, 3, 4 };

		int number = 4;

		System.out.println(findNumber(array, 0, array.length - 1, number));

	}

}
