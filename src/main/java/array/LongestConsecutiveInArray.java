/*https://leetcode.com/problems/longest-consecutive-sequence/solution/
Time Complexity: O(n log n)
Arrays.sort(numbers) takes O(n log n) time — this is the dominant term.
The for loop runs O(n) times to find the longest consecutive sequence.

Space Complexity: O(1) (or O(n) depending)
If sorting is in-place (as with Arrays.sort() for primitive arrays like int[]), the extra space is O(1).
If you’re using a version of sort that creates a new array (like sorting Integer[]), it would be O(n).
 */
package array;

import java.util.Arrays;

public class LongestConsecutiveInArray {

	public static void main(String[] args) {

		int[] numbers = { 100, 4, 200, 1, 3, 2 }; // 1, 2, 3, 4, 100, 200

		System.out.println(longestConsecutiveInArray(numbers));

	}

	public static int longestConsecutiveInArray(int[] numbers) {

		Arrays.sort(numbers); //  O(nlgn)
		int longestStreak = 1;
		int currentStreak = 1;

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] != numbers[i - 1]) {
				if (numbers[i] == numbers[i - 1] + 1) {
					currentStreak += 1;
				} else {
					longestStreak = Math.max(longestStreak, currentStreak);
					currentStreak = 1;
				}
			}
		}

		return Math.max(longestStreak, currentStreak);
	}

}
