public class MissingNumberInArray {

	public static void main(String args[]) {

		int[] numbers = { 0, 0, 10, 0, 0, 30, 0, 0, 0, 20, 0 };
		prepareFullArray(numbers);
	}

	static void prepareFullArray(int[] numbers) {
		int missingIndex = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 0) {
				missingIndex++;
			} else if (numbers[i] != 0 && missingIndex < i) {
				numbers[missingIndex] = i;
				numbers[missingIndex-1] = i;
			}

			// System.out.println(numbers[i]);
		}
		
		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
		}
	}

}