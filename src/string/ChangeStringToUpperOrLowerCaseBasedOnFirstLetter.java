package string;
//https://practice.geeksforgeeks.org/problems/change-the-string3541/1/?company[]=Oracle&company[]=Oracle&page=1&query=company[]Oraclepage1company[]Oracle

public class ChangeStringToUpperOrLowerCaseBasedOnFirstLetter {

	public static void main(String[] args) {

		String input = "abcD";

		System.out.println(modifyString(input));
	}

	public static String modifyString(String input) {

		return (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') ? input.toUpperCase() : input.toLowerCase();
	}

}
