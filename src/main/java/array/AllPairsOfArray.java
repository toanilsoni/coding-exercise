//https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#axzz7Q1I8VRMv
	
package array;

public class AllPairsOfArray {

	public static void main(String[] args) {

		int[] array = { 2, 4, 3, 5, 7, 8, 9 };
		int sum = 7;

		allPairsOfArray(array, sum);
	}

	public static void allPairsOfArray(int[] array, int sum) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {
				if (sum == array[i] + array[j]) {
					System.out.print("{" + array[i] + "," + array[j] + "}");
				}

			}

		}

	}
}
