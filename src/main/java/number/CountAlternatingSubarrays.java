package number;
//https://leetcode.com/problems/count-alternating-subarrays/

/*
Time: O(n) – single pass over the array

Space: O(1) – constant extra variables
 */
public class CountAlternatingSubarrays {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};  // Example input

        long result = countAlternatingSubarrays(nums);
        System.out.println("Total alternating subarrays: " + result);
    }

    public static long countAlternatingSubarrays(int[] nums) {
        long ans = 1;       // At least one subarray (the first element)
        int count = 0;      // Start of current alternating sequence

        for (int i = 1; i < nums.length; i++) {
            ans++;  // Every element itself is a valid subarray
            if (nums[i] + nums[i - 1] == 1) { // Alternating pair
                ans += (i - count);           // Extend previous alt subarrays
            } else {
                count = i;                    // Reset start index of new alt seq
            }
        }
        return ans;
    }
}
