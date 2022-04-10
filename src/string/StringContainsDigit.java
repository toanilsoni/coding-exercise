package string;

public class StringContainsDigit {

	public static void main(String[] args) {
		String str = "123ABC";
		System.out.print(containsDigit(str));
	}

	private static String containsDigit(String str) {
		StringBuilder strB = new StringBuilder();
		for (Character c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				strB.append(c);
			}
		}

		return strB.toString();

	}

}
