
package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintDuplicateElementsFromArray {

	public static void main(String[] args) {

		String[] array = { "rest", "java", "world", "java", "anil", "anil" };

		printDuplicateElementsFromArray(array);
	}

	public static void printDuplicateElementsFromArray(String[] array) {

		Stream<String> stream = Arrays.stream(array);

		Set<String> items = new HashSet<>();

		List<String> result = stream.filter(n -> !items.add(n)).collect(Collectors.toList());

		System.out.println("Duplicates: " + result);

	}
}
