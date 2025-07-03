// https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html#axzz7Q1I8VRMv

package array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateNumberInArray {

	public static void main(String[] args) {

		Integer[] numbers = { 1, 2, 3, 4, 2};

		findDuplicateNumberInArray(numbers);

		//printRepeating(numbers, numbers.length);

		//printDuplicateElementsFromArray(numbers);
	}

	public static void printDuplicateElementsFromArray(Integer[] array) {

		Stream<Integer> stream = Arrays.stream(array);

		Set<Integer> numbers = new HashSet<>();

		List<Integer> result = stream.filter(n -> !numbers.add(n)).collect(Collectors.toList());

		System.out.println("Duplicates: " + result);

	}

	public static void findDuplicateNumberInArray(Integer[] numbers) {

		HashMap<Integer, Integer> numberMap = new HashMap<>();

		for (int k = 0; k < numbers.length; k++) {
			if (numberMap.containsKey(numbers[k])) {
				numberMap.put(numbers[k], numberMap.get(numbers[k]) + 1);
			} else {
				numberMap.put(numbers[k], 1);
			}
		}

		for (Map.Entry<Integer, Integer> map : numberMap.entrySet()) {
			if (map.getValue() > 1) {
				System.out.print("Duplicate Number: " + map.getKey() + "\n");
			}

		}
	}

	public static void printRepeating(Integer arr[], int size) {
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size - 1; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
	}

}
