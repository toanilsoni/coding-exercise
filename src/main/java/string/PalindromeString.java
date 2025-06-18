package string;

public class PalindromeString {

	public static void main(String[] args) {
		String input = "abba";
		if (checkPalindrome(input)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

	}

	private static boolean checkPalindrome(String input) {
		int i = 0;
		int j = input.length() - 1;
		while (i < j) {

			if (input.charAt(i) != input.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
}
