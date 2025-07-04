package string;

import java.util.HashMap;
import java.util.Map.Entry;

public class RemoveEvenFrequencyCharacters {

	public static void main(String[] args) {

		String inputStr = "aabbbddeeecc";
		System.out.println(removeEvenFrequencyCharacters(inputStr));

		//String inputStr = "aabbbddeeecc";
		//System.out.println(removeEvenFrequencyCharactersRandom(inputStr));

	}

	private static String removeEvenFrequencyCharacters(String inputStr) {

		HashMap<Character, Integer> charMap = new HashMap<>();
		for (char c : inputStr.toCharArray()) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}

		System.out.println(charMap);

		StringBuilder sb = new StringBuilder();
		for (Entry<Character, Integer> entry : charMap.entrySet()) {
			int frequency = entry.getValue();
			//System.out.println("Value " + entry.getValue());
			if (entry.getValue() % 2 == 0) {
				//System.out.println("even");
			} else {
				while (frequency >= 1) {
					sb.append(entry.getKey());
					frequency--;
				}
			}
		}

		return sb.toString();
	}

	private static String removeEvenFrequencyCharactersRandom(String inputStr) {

		HashMap<Character, Integer> charMap = new HashMap<>();
		for (char c : inputStr.toCharArray()) {

			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}

		System.out.println(charMap);

		StringBuilder sb = new StringBuilder();
		int result = 0;
		for (Entry<Character, Integer> entry : charMap.entrySet()) {
			int frequency = entry.getValue();
			System.out.println("Value " + entry.getValue());
			if (entry.getValue() % 2 == 0) {
				while (frequency >= 1) {
					sb.append(entry.getKey());
					frequency--;
				}
			} else {
				result += entry.getValue();
			}
		}

		System.out.println("Total Characters Removed " + result);

		return sb.toString();
	}

}
