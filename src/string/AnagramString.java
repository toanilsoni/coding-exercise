package string;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String str1 = "Cat";
		String str2 = "Act";
		boolean isAnagram = isStringAnagram(str1, str2);

		if (!isAnagram) {
			System.out.println("String are not Anagram");
		} else {
			System.out.println("Strings are Anagram");
		}

	}

	private static boolean isStringAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		if (s1.length() != s2.length()) {
			return false;
		} else {

			char[] firstStringArray = str1.toCharArray();
			char[] secondStringArray = str2.toCharArray();

			Arrays.sort(firstStringArray);
			Arrays.sort(secondStringArray);
			Arrays.equals(firstStringArray, secondStringArray);
			return true;
		}

	}

}
