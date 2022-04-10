package string;
//https://prepinsta.com/hackerrank-coding-question-placements-4/

//Write a program to print all Subsequences of String which Start with Vowel and End with Consonant

import java.util.HashSet;

public class StringStartVowelAndEndConsonant {

	static HashSet<String> hsString = new HashSet<>();

	public static void main(String[] args) {

		String input = "xabcef";
		// ab, ac, abc
		subsequence(input);
		System.out.println(hsString);
	}

	public static void subsequence(String input) {

		for (int i = 0; i < input.length(); i++) {
			// System.out.println(input.charAt(i));

			if (isVowel(input.charAt(i))) {

				for (int j = input.length() - 1; j >= i; j--) {
					if (isConsonant(input.charAt(j))) {
						String strSub = input.substring(i, j + 1);
						hsString.add(strSub);

						for (int k = 1; k < strSub.length() - 1; k++) {
							StringBuffer sb = new StringBuffer(strSub);
							sb.deleteCharAt(k);
							subsequence(sb.toString());
						}
					}
				}
			}
		}
	}

	public static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}

	public static boolean isConsonant(char c) {
		return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}

}
