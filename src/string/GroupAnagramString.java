package string;
//

import java.util.Arrays;

public class GroupAnagramString {

	public static void main(String[] args) {

		String str = "act";
		String str1 = "cat1";

		System.out.println(anagramString(str, str1));
	}

	public static boolean anagramString(String str, String str1) {

		if (str.length() != str1.length()) {
			System.out.println("Strings not anagram");
		} else {
			char[] cStr = str.toCharArray();
			char[] cStr1 = str1.toCharArray();

			Arrays.sort(cStr);
			Arrays.sort(cStr1);

			if (Arrays.equals(cStr, cStr1)) {
				return true;
			}

		}

		return false;
	}

}
