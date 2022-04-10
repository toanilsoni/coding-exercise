package array;

public class FindAMissingNumberInArray {

	public static void main(String[] args) {

		int[] array = { 1, 3, 4};

		System.out.print(findAMissingNumberInArray(array));
	}

	public static int findAMissingNumberInArray(int[] array) {
		int totalCount = array.length + 1;
		int expectedSum = totalCount * (totalCount + 1) / 2;
		int actualSum = 0;
		for (int i : array) {
			actualSum += i;
		}
		return expectedSum - actualSum;

	}

}
