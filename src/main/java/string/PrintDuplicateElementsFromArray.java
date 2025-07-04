
package string;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintDuplicateElementsFromArray {

	public static void main(String[] args) {

		String[] array = { "rest", "java", "world", "java", "anil", "anil" };

		findDuplicateNumberInArray(array);
	}

	public static void findDuplicateNumberInArray(String[] array) {

		HashMap<String, Integer> stringMap = new HashMap<>();

		for (int k = 0; k < array.length; k++) {
			if (stringMap.containsKey(array[k])) {
				stringMap.put(array[k], stringMap.get(array[k]) + 1);
			} else {
				stringMap.put(array[k], 1);
			}
		}

		for (Map.Entry<String, Integer> map : stringMap.entrySet()) {
			if (map.getValue() > 1) {
				System.out.print("Duplicate String: " + map.getKey() + "\n");
			}
		}

		}

	public static void printDuplicateElementsFromArray(String[] array) {

		Stream<String> stream = Arrays.stream(array);

		Set<String> items = new HashSet<>();

		List<String> result = stream.filter(n -> !items.add(n)).collect(Collectors.toList());

		System.out.println("Duplicates: " + result);

	}
}
