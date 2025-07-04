// https://leetcode.com/problems/squares-of-a-sorted-array/description/
/*
Time Complexity: O(n)
Each element is visited once.

Space Complexity: O(n)
Result array is used for output.
 */
package number;

import java.util.Arrays;

public class SortedArraySquares {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};  // Sample input

        int[] result = sortedSquares(nums);

        System.out.println("Sorted squares: " + Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }
}
