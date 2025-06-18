//https://stackoverflow.com/questions/51879493/java-8-streams-get-non-repeated-counts

package string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesString {

	public static void main(String[] args) {

		String[] array = { "Anil", "Anil", "Soni" };

		System.out.println(findNonRepeatingString(array));
	}

	public static String findNonRepeatingString(String[] array) {

		List<String> lsIntger1 = Arrays.asList(array);

		Map<String, Long> countByNumber = lsIntger1.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		List<String> uniqueNumbers = lsIntger1.stream().filter(n -> countByNumber.get(n) == 1)
				.collect(Collectors.toList());
		return uniqueNumbers.get(0);

	}

}
