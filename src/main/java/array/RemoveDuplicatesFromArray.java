//https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html#axzz7Q1I8VRMv
package array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		Integer[] numbers = { 1, 1, 2, 2, 3, 4, 5 };

		//System.out.println(removeDuplicatesFromArrayStream(numbers));
		System.out.println(Arrays.toString(removeDuplicatesFromArray(numbers)));
	}

	public static List<Integer> removeDuplicatesFromArrayStream(Integer[] numbers) {

		List<Integer> listInt = Arrays.asList(numbers);

		Map<Integer, Long> map = listInt.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Integer> result = listInt.stream().filter(n -> map.get(n) ==1 ).collect(Collectors.toList());

		return result;
	}

	public static int[] removeDuplicatesFromArray(Integer[] numbers) {
		Arrays.sort(numbers);

		int[] result = new int[numbers.length];
		result[0] = numbers[0];
		int index = 1;

		for (int i = 1; i < numbers.length; i++) {
			if (!numbers[i].equals(numbers[i - 1])) {
				result[index++] = numbers[i];
			}
		}

		return Arrays.copyOf(result, index);
	}


}
