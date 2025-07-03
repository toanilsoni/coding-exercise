//https://javaconceptoftheday.com/sort-array-elements-by-frequency-in-java/

package array;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortArrayOfStringByFrequency {

	public static void main(String[] args) {

		String[] array = { "John", "DC", "Check", "John", "Bolt", "John", "Bolt" };

		sortStringArray(array);
		//sortStringArrayJava8(array);
	}

	public static void sortStringArray(String[] inputArray) {

		HashMap<String, Integer> inputStrMap = new HashMap<>();

		for (int i = 0; i < inputArray.length; i++) {
			if (inputStrMap.containsKey(inputArray[i])) {
				inputStrMap.put(inputArray[i], inputStrMap.get(inputArray[i]) + 1);

			} else {
				inputStrMap.put(inputArray[i], 1);
			}
		}

		ArrayList<String> resultList = new ArrayList<>();

		inputStrMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.forEach(entry -> {
					for (int i = 0; i < entry.getValue(); i++)
						resultList.add(entry.getKey());
				});

		System.out.println(resultList);
	}

	public static void sortStringArrayJava8(String[] inputArray) {

		/*HashMap<String, Integer> inputStrMap = new HashMap<>();

		for (int i = 0; i < inputArray.length; i++) {
			if (inputStrMap.containsKey(inputArray[i])) {
				inputStrMap.put(inputArray[i], inputStrMap.get(inputArray[i]) + 1);

			} else {
				inputStrMap.put(inputArray[i], 1);
			}
		}*/

		List<String> numberList = Arrays.asList(inputArray);

		Map<String, Long> inputStrMap = numberList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		ArrayList<String> resultList = new ArrayList<>();

		inputStrMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.forEach(entry -> {
					for (int i = 0; i < entry.getValue(); i++)
						resultList.add(entry.getKey());
				});

		System.out.println(resultList);

	}
}
