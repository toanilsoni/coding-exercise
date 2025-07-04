package number;/*
https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MaximumSumSubarrayOfSizeK {

    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9}; // Example input
        int k = 3;

        maximumSubarraySum(nums, k);
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        List<List<Integer>> validSubarrays = new ArrayList<>();
        int count = 0;
        long maxSum = 0;
        for (int start = 0; start <= nums.length - k; start++) {
            HashSet<Integer> set = new HashSet<>();
            long sum = 0;
            boolean isValid = true;
            List<Integer> current = new ArrayList<>();

            for (int i = start; i < start + k; i++) {
                if (set.contains(nums[i])) {
                    isValid = false; // Duplicate found
                    break;
                }
                set.add(nums[i]);
                current.add(nums[i]);
                sum += nums[i];
            }

            if (isValid) {
                validSubarrays.add(current);
                count++;
                maxSum = Math.max(maxSum, sum);
                System.out.println("Valid subarray: " + current + " => Sum: " + sum);
            }
        }

        System.out.println("\nTotal valid subarrays of size " + k + ": " + count);
        System.out.println("Maximum subarray sum with unique elements: " + maxSum);
        return maxSum;
    }
}
