//

package string;

public class LongestSubstringNoRepeatingCharacters {

	public static void main(String[] args) {

		String str = "abcabcbb";

		longestSubstringNoRepeatingCharacters(str);
	}

	public static void longestSubstringNoRepeatingCharacters(String str) {

		int maxLength = 0;

		String result = "";

		for (char c : str.toCharArray()) {

			String current = String.valueOf(c);

			if (result.contains(current)) {
				result = result.substring(result.indexOf(current) + 1);

			}

			result = result + current;
			maxLength = Math.max(result.length(), maxLength);

		}

		System.out.println(maxLength);
	}
}
