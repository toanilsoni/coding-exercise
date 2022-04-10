//https://leetcode.com/problems/longest-consecutive-sequence/solution/
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
