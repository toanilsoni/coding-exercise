package number;

public class FindTheSubarrayWithLargestSum {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};

		System.out.println(countAllSubarraysSumEqualsToK(nums));
	}

	public static int countAllSubarraysSumEqualsToK(int[] nums) {

		int largestSum = nums[0];

		// Brute-force: check all subarrays
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				largestSum = Math.max(largestSum,sum);
			}
		}

		return largestSum;
	}
}
