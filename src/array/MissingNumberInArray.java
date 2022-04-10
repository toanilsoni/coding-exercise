package array;
//https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#axzz7Q1I8VRMv
public class MissingNumberInArray {

	public static void main(String args[]) {

		int[] numbers = { 1, 2, 3, 5 };
		System.out.println(findAMissingNumber(numbers, numbers.length + 1));
	}

	static int findAMissingNumber(int[] numbers, int n) {
		int exptectedCount = n * ((n + 1) / 2);
		int actualCount = 0;

		for (int i : numbers) {
			actualCount = actualCount + i;
		}
		return exptectedCount - actualCount;
	}

}