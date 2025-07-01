package number;

public class FindTheSubarrayWithLargestSum {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		int length = nums.length;

		System.out.println(countAllSubarraysSumEqualsToK(nums));
	}

	public static int countAllSubarraysSumEqualsToK(int[] nums) {

		int largestSum = nums[0];

		// Brute-force: check all subarrays
		for (int start = 0; start < nums.length; start++) {
			int sum = 0;
			for (int end = start; end < nums.length; end++) {
				sum += nums[end];
				largestSum = Math.max(largestSum,sum);
			}
		}

		return largestSum;
	}
}
