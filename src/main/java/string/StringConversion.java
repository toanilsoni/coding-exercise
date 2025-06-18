package string;

public class StringConversion {

	public static void main(String[] args) {
		stringToInt();
		intToString();
	}

	private static void stringToInt() {
		String str = "1";
		String str1 = "2";
		System.out.print(Integer.parseInt(str) + Integer.parseInt(str1));
	}

	private static void intToString() {
		int i = 1;
		int j = 2;
		System.out.print(Integer.toString(i) + Integer.toString(j));
	}

}
