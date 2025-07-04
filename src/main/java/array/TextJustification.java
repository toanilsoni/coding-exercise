/*
https://leetcode.com/problems/text-justification/description/

*/

package array;

public class TextJustification {

	public static void main(String[] args) {
		String[] words = { "This", "is", "an", "example", "of", "text", "justification." };
		int maxWidth = 16;
		System.out.println(fullJustify(words, maxWidth, 0));
	}

	public static String fullJustify(String[] words, int maxWidth, int index) {
		if (index < words.length) {
			String result = "";
			int currentLen = 0;
			int remainingLength = maxWidth;
			while (result.length() < maxWidth && index < words.length) {
				if (remainingLength >= words[index].length() + 1) { // remainingLength+1 for space
					if (!result.equals("")) {
						result += "@" + words[index];
						currentLen = words[index].length() + 1;
					} else {
						result += words[index];
						currentLen = words[index].length();
					}
					remainingLength -= currentLen;
					index++;
				} else if (remainingLength > 0) {
					if (result.contains("@") == false) {
						for (int i = 0; i < remainingLength; i++) {
							result = result + " ";
						}
					} else {
						// go in only if there at least 2 words
						String[] arr = result.split("@");
						int mod = (remainingLength % (arr.length - 1));
						int splitedSpace = remainingLength / (arr.length - 1);
						String spaces = " ";
						for (int i = 0; i < splitedSpace; i++) {
							spaces = spaces + " ";
						}
						String leftmost = spaces;
						for (int i = 0; i < mod; i++) {
							leftmost = leftmost + " ";
						}
						result = result.replaceFirst("@", leftmost);
						result = result.replaceAll("@", spaces);
					}
				}
			}
			result = result.replaceAll("@", " ");
			return result + "\n" + fullJustify(words, maxWidth, index);
		} else {
			return "";
		}
	}
}