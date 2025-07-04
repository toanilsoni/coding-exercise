package number;
/*
https://leetcode.com/problems/3sum/description/
https://leetcode.com/problems/3sum/solutions/6918513/title-efficient-3sum-solution-using-sorting-and-two-pointers/

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;
import java.util.List;

public class TriplestSumToZero {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> triplets = threeSum(nums);

        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // 🧮 Sort first
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // 🚫 Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    // ✅ Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // 🔁 Skip duplicates
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                } else if (sum < 0) {
                    j++; // ➕ Increase sum
                } else {
                    k--; // ➖ Decrease sum
                }
            }
        }
        return result;

    }
}