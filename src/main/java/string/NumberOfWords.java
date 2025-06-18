package string;

public class NumberOfWords {

	public static void main(String[] args) {

		String str1 = "Mother In Law Test";
		count(str1);

	}

	private static void count(String str1) {
		String[] strArray = str1.split(" ");
		System.out.println(strArray.length);

	}

}
