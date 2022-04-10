package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EachCharOccurrence {

	public static void main(String[] args) {

		String str1 = "Anil Soni";
		countEachChar(str1.replaceAll("\\s", ""));
	}

	private static void countEachChar(String str1) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			char charValue = str1.charAt(i);
			if (charMap.containsKey(charValue)) {
				charMap.put(charValue, charMap.get(charValue) + 1);
			} else {
				charMap.put(charValue, 1);
			}

		}

		for (Entry<Character, Integer> mapValue : charMap.entrySet()) {
			System.out.println("Char " + mapValue.getKey() + " Occurrence " + mapValue.getValue());
		}

	}

}
