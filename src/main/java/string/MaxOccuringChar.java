package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {

	public static void main(String[] args) {
		String str = "Javavv";

		maxOccuringChar(str);
	}

	public static void maxOccuringChar(String str) {

		HashMap<Character, Integer> charMap = new HashMap<>();
		for (char c : str.toCharArray()) {

			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}

		System.out.println(charMap);
		ArrayList<Integer> result = new ArrayList<>();
		charMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(entry -> {
			for (int i = 0; i < entry.getValue(); i++)
				result.add(entry.getValue());
		});

		System.out.println(result.get(0));
	}
}
