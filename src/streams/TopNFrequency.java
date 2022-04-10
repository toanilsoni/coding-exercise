package streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopNFrequency {

	public static void main(String[] args) {

		int[] array = { 1, 2, 1, 4, 4, 4, 5, 1, 4, 5 };

		topNFrequency(3, array);
		// System.out.println(topNFrequency(3, array));

	}

	public static Map<Integer, Long> topNFrequency(int n, int[] array) {

		Map<Integer, Long> resultMap = Arrays.stream(array).limit(n).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		resultMap.entrySet().stream()
				.forEach(number -> System.out.println("Key: " + number.getKey() + " Values: " + number.getValue()));

		return resultMap;

	}

}
