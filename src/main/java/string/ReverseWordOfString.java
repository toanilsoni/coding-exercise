package string;

import java.util.Arrays;

public class ReverseWordOfString {

	public static void main(String[] args) {

		String str1 = "Anil Soni";

		reverseWordOfString(str1);

	}

	private static void reverseWordOfString(String str1) {
		System.out.println();

		String[] s1 = str1.split(" ");

		String[] result = new String[s1.length];

		int j = s1.length;
		for (int i = 0; i < s1.length; i++) {
			result[j - 1] = s1[i];
			j--;
		}

		System.out.println(Arrays.toString(result));

	}

}
