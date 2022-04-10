package string;

public class StringPermutations {

	public static void main(String[] args) {
		String input = "cd";
		//System.out.println(input.substring(0, 1));
		getPerrmutations(input);
		String input1 = "Anil";
		//System.out.println(input1.substring(1, 6));

	}

	private static void getPerrmutations(String input) {
		for (int i = 0; i < input.length(); i++) {
			//System.out.print(input.substring(0, i) + " ");
			//System.out.print(input.substring(i + 1) + " ");
			String restStr = input.substring(0, i) + input.substring(i + 1);
			getPerrmutations(restStr);
			//System.out.println(restStr);
		}
	}

}
