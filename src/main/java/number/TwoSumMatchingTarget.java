//	https://leetcode.com/problems/two-sum
/*Time complexity: O(n) – Only one loop through the array

Space complexity: O(n) – For storing seen elements in a hash map
*/
package number;

import java.util.*;

public class TwoSumMatchingTarget {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}

class Solution {
    public int[] twoSum(int[] a, int t) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int x = t - a[i];
            if (m.containsKey(x)) return new int[]{m.get(x), i};
            m.put(a[i], i);
        }
        return new int[0];
    }
}
