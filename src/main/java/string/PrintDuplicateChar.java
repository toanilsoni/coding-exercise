package string;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateChar {

	public static void main(String[] args) {

		String str = "Java";
		Map<Character, Integer> strMap = new HashMap<Character, Integer>();
		StringBuilder strB = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (strMap.containsKey(c)) {
				strMap.put(c, strMap.get(c) + 1);
			} else {
				strMap.put(c, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			char ct = str.charAt(i);
			if (strMap.get(ct) > 1) {
				strB.append(ct);
			}
		}
		System.out.println(strB);

	}
}
