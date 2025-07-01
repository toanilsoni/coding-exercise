package number;

public class CountAllSubarraysSumEqualsToK {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		int length = nums.length;
		int k = 3;

		System.out.println(countAllSubarraysSumEqualsToK(nums, k));
	}

	public static int countAllSubarraysSumEqualsToK(int[] nums, int k) {

		int count = 0;

		// Brute-force: check all subarrays
		for (int start = 0; start < nums.length; start++) {
			int sum = 0;
			for (int end = start; end < nums.length; end++) {
				sum += nums[end];

				if (sum == k) {
					count++;
					// Print the subarray
					System.out.print("{ ");
					for (int i = start; i <= end; i++) {
						System.out.print(nums[i] + " ");
					}
					System.out.println("}");
				}
			}
		}

		return count;
	}
}
