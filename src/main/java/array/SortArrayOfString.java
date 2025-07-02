package array;

import java.util.Arrays;

public class SortArrayOfString {

	public static void main(String[] args) {

		String str[] = { "Anil", "AL", "Am", "I" };

		//System.out.println(Arrays.toString(sortByAlphabeticalOrder(str, str.length)));
		System.out.println(Arrays.toString(sortByLength(str, str.length)));
	}

	private static String[] sortByLength(String[] str, int length) {
		for (int i = 1; i < length; i++) {
			String current = str[i];

			int j = i - 1;
			while (j >= 0 && current.length() < str[j].length()) {
				str[j + 1] = str[j];
				j--;
			}

			str[j + 1] = current;
		}
		return str;
	}

	private static String[] sortByAlphabeticalOrder(String[] str, int length) {
		for (int i = 0; i < length-1; i++) {
			for (int j = i+1; j < str.length; j++) {
				if(str[i].compareTo(str[j]) >0) {  // >0 → if str[i] comes after str[j]. If str[i] comes after str[j] in lexicographical order, then swap them.
					String temp = str[i];
					str[i] = str[j];
					str[j]=temp;
					
				}
				
			}
			
		}
		return str;
	}

}
