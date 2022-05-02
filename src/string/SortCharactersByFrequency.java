// https://leetcode.com/problems/sort-characters-by-frequency/
package string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {

	public static void main(String[] args) {

		String inputStr = "tree";
		System.out.println(sortCharactersByFrequency(inputStr));

	}

	private static String sortCharactersByFrequency(String inputStr) {

		HashMap<Character, Integer> freuquencyMap = new HashMap<>();

		for (char c : inputStr.toCharArray()) {
			if (freuquencyMap.containsKey(c)) {
				freuquencyMap.put(c, freuquencyMap.get(c) + 1);
			} else {
				freuquencyMap.put(c, 1);
			}
		}
		System.out.println(freuquencyMap);

		StringBuilder sb = new StringBuilder();

		freuquencyMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.forEach(entry -> {
					for (int i = 0; i < entry.getValue(); i++)
						sb.append(entry.getKey());
				});
		return sb.toString();
	}

}
