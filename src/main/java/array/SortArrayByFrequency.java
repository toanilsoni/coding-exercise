//https://javaconceptoftheday.com/sort-array-elements-by-frequency-in-java/

package array;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortArrayByFrequency {

    public static void main(String[] args) {

        Integer[] array = {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};
        // output - { 1, 1, 1, 1, 7, 7, 7, 3, 3, 4, 4, 5, 9 };

        sortArrayByFrequency(array);
        //sortArrayByFrequency(array);
    }

	public static void sortArrayByFrequencyJava8(Integer[] array) {

		List<Integer> numberList = Arrays.asList(array);

		Map<Integer, Long> frequencyMap = numberList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		ArrayList<Integer> result = new ArrayList<>();

		frequencyMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.forEach(entry -> {
					for (int i = 1; i <= entry.getValue(); i++)
						result.add(entry.getKey());
				});

		System.out.println(frequencyMap);
		System.out.println(result);
	}

    public static void sortArrayByFrequency(Integer[] array) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (frequencyMap.containsKey(array[i])) {
                frequencyMap.put(array[i], frequencyMap.get(array[i]) + 1);
            } else {
                frequencyMap.put(array[i], 1);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        frequencyMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> {
                    for (int i = 1; i <= entry.getValue(); i++)
                        result.add(entry.getKey());
                });

        System.out.println(frequencyMap);
        System.out.println(result);
    }
}
