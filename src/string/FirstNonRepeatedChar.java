package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "VVnAAO";
		System.out.print(checkRepeatedChar(str));
	}

	private static Character checkRepeatedChar(String str) {
		Character charValue = 0;
		Map<Character, Integer> strMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			charValue = str.charAt(i);

			if (strMap.containsKey(charValue)) {
				strMap.put(charValue, strMap.get(charValue) + 1);
			} else {
				strMap.put(charValue, 1);
			}

		}

		for (Entry<Character, Integer> entryValue : strMap.entrySet()) {
			if (entryValue.getValue() == 1) {
				return entryValue.getKey();
			}
		}
		return charValue;

	}

}
