package string;

import java.util.Vector;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		String s = "aabbbaccddddc";
		System.out.println(removeAdjacentDuplicates(s)); // Output should be "b"
	}

	public static String removeAdjacentDuplicates(String str) {
		Vector<Character> stack = new Vector<>();

		for (char ch : str.toCharArray()) {
			if (!stack.isEmpty() && stack.lastElement() == ch) {
				stack.remove(stack.size() - 1); // Remove the last (duplicate)
			} else {
				stack.add(ch); // Add if not duplicate
			}
		}

		// Convert stack to string
		StringBuilder result = new StringBuilder();
		for (char c : stack) {
			result.append(c);
		}

		return result.toString();
	}
}
