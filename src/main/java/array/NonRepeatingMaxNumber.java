//https://stackoverflow.com/questions/51879493/java-8-streams-get-non-repeated-counts

package array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingMaxNumber {

	public static void main(String[] args) {

		Integer[] array = { 1, 1, 2, 2, 3, 3, 8};

		System.out.println(findMax(array));
	}

	public static int findMax(Integer[] array) {

		List<Integer> lsIntger1 = Arrays.asList(array);

		Map<Integer, Long> countByNumber = lsIntger1.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		List<Integer> uniqueNumbers = lsIntger1.stream().filter(n -> countByNumber.get(n) == 1)
				.collect(Collectors.toList());
		return uniqueNumbers.get(0);

	}
	
	/*public static int findMax(Integer[] array) {

		HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			if (numberMap.containsKey(array[i])) {
				numberMap.put(array[i], numberMap.get(array[i]) + 1);
			} else {
				numberMap.put(array[i], 1);
			}
		}

		int max = 0;
		int index = -1;

		for (int i = 0; i < array.length; i++) {
			if (numberMap.get(array[i]) == 1 && array[i] > max) {
				max = array[i];
				index = i;
			}
		}

		if (index == -1) {
			return index;
		}

		return max;

	}*/
}
