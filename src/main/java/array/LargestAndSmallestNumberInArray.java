// https://www.java67.com/2014/02/how-to-find-largest-and-smallest-number-array-in-java.html

package array;

public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4 };

		largestAndSmallestNumberInArray(numbers);
	}

	public static void largestAndSmallestNumberInArray(int[] numbers) {
		int largest = numbers[0];
		int smallest = numbers[0];


		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Largest number in array is : " + largest);
		System.out.println("Smallest number in array is : " + smallest);

	}
}
