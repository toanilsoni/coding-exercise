package string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "ABC";
		System.out.println(reverse(str));
	}

	public static String reverse(String str) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		return sb.reverse().toString();
		
		/*
		 * String result = "";
		 * 
		 * for(int i=str.length()-1; i>=0; i--) { result = result + str.charAt(i);
		 * 
		 * }
		 
		
		return result;*/

		/*
		 * char[] c = str.toCharArray(); StringBuilder sb = new StringBuilder(); for
		 * (int i = str.length() - 1; i >= 0; i--) { sb.append(c[i]); }
		 * 
		 * return sb.toString();
		 */
	}

}
