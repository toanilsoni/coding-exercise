package streams;

import java.util.HashMap;
import java.util.Map;

public class TopNFrequency {

	public static void main(String[] args) {

		int[] array = { 1, 2, 1, 4, 4, 4, 5, 1, 4, 5 };

		topNFrequency(3, array);
		// System.out.println(topNFrequency(3, array));

	}

	/*public static Map<Integer, Long> topNFrequency(int n, int[] array) {

		Map<Integer, Long> resultMap = Arrays.stream(array).limit(n).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		resultMap.entrySet().stream()
				.forEach(number -> System.out.println("Key: " + number.getKey() + " Values: " + number.getValue()));

		return resultMap;

	}*/
	
	public static Map<Integer, Integer> topNFrequency(int frequency, int[] numbers) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int n : numbers) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>=frequency) {
				System.out.println(entry.getKey());
			}
		}
		return map;

	}

}
