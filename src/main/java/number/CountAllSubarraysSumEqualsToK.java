package number;

public class CountAllSubarraysSumEqualsToK {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		int k = 3;

		System.out.println(countAllSubarraysSumEqualsToK(nums, k));
	}

	public static int countAllSubarraysSumEqualsToK(int[] nums, int k) {

		int count = 0;

		// Brute-force: check all subarrays
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];

				if(sum == k){
					count++;
					// Print the subarray
					System.out.print("{ ");
					for(int m = i; m <= j; m++){
						System.out.print(nums[m] + " ");
					}
					System.out.println("}");
				}
			}
		}

		return count;
	}
}
