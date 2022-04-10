package string;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		String str = "BeginnersBook";
		countVowelsAndConsonants(str);

	}

	private static void countVowelsAndConsonants(String str) {
		int vowels = 0;
		int consonants = 0;
		str = str.toLowerCase();
		char[] strChar = str.toCharArray();
		for (int i = 0; i < strChar.length; i++) {
			if (strChar[i] == 'a' || strChar[i] == 'e' || strChar[i] == 'i' || strChar[i] == 'o' || strChar[i] == 'u') {
				vowels++;
			} else if (strChar[i] >= 'a' && strChar[i] <= 'z') {
				consonants++;
			}
		}
		System.out.print(" vowels " + vowels + " consonants " + consonants);
	}

}
