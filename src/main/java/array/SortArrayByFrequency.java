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

        sortArrayByFrequencyJava8(array);
        //sortArrayByFrequency(array);
    }

	public static void sortArrayByFrequencyJava8(Integer[] array) {

		/*HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			if (frequencyMap.containsKey(array[i])) {
				frequencyMap.put(array[i], frequencyMap.get(array[i]) + 1);
			} else {
				frequencyMap.put(array[i], 1);
			}
		}*/

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

        ArrayList<Entry<Integer, Integer>> result = new ArrayList<>(frequencyMap.entrySet());

        Collections.sort(result, new Comparator<Entry<Integer, Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.print("[ ");

        for (Entry<Integer, Integer> entry : result) {
            int frequency = entry.getValue();
            while (frequency >= 1) {
                System.out.println(entry.getKey() + " ");
                frequency--;
            }

        }
        System.out.print("]");
        System.out.println(frequencyMap);
        System.out.println(result);

    }
}
