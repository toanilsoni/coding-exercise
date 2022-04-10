package string;

public class MaxOccuringChar {

	public static void main(String[] args) {
		String str = "Javavv";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ct = str.charAt(i);
			if (ct == 'v') {
				count++;
			}
		}
		System.out.println(count);

	}
}
