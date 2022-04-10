//https://www.geeksforgeeks.org/remove-three-consecutive-duplicates-string/

package string;

import java.util.Vector;

public class Remove3ConsecutiveDuplicates {

	public static void main(String[] args) {
		String s = "aabbbaccddddc";

		System.out.println(remove3ConsecutiveDuplicates(s));
	}

	public static String remove3ConsecutiveDuplicates(String str) {

		Vector<Character> vChar = new Vector<>();

		for (int i = 0; i < str.length(); i++) {

			vChar.add(str.charAt(i));

			if (vChar.size() > 2) {
				int vSize = vChar.size();
				if ((vChar.get(vSize - 1) == vChar.get(vSize - 2)) && (vChar.get(vSize - 2) == vChar.get(vSize - 3))) {
					vChar.setSize(vSize - 3);

				}

			}

		}

		for (int j = 0; j < vChar.size(); j++) {
			System.out.println(vChar.get(j));
		}

		return "";
	}

}
