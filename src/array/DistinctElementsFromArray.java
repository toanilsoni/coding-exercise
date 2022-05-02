
package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElementsFromArray {

	public static void main(String[] args) {

		Integer[] array = { 1, 2, 1, 1, 5, 5, 8, 9 };

		distinctElementsFromArray(array);
	}

	public static void distinctElementsFromArray(Integer[] array) {

		List<Integer> numbers = Arrays.asList(array);

		List<Integer> result = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println("List without duplicates: " + result);

	}
}
