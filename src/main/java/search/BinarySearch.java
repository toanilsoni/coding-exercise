package search;

public class BinarySearch {

	public static void main(String[] args) {

		int[] list = { 1, 2, 3, 4, 5 };
		int target = 2;

		System.out.println(findNumber(list, target));
	}

	public static int findNumber(int[] list, int target) {

		int left = 0;
		int right = list.length - 1;

		while (left <= right) {

			int middle = left + right / 2;

			if (target < list[middle]) {
				right = middle - 1;
			} else if (target > list[middle]) {
				left = middle + 1;
			} else {
               return middle;
			}

		}

		return -1;
	}

}
