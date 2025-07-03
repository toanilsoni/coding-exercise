package array;

import java.util.Arrays;

public class SortArrayOfString {

	public static void main(String[] args) {

		String str[] = { "Anil", "AL", "Am", "I" };

		System.out.println(Arrays.toString(sortByLengt(str, str.length)));
		//System.out.println(Arrays.toString(sortByAlphabeticalOrder(str, str.length)));
	}

	private static String[] sortByLengt(String[] str, int length) {
		//	String str[] = { "Anil", "AL", "Am", "I" };
		for (int i = 0; i < length; i++) {
			for(int j=i+1; j<length; j++){
				if(str[i].length() > str[j].length()){
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}

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
