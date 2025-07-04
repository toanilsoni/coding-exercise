/*
To return the starting index and the length of the longest uniform substring (e.g., "0000" in "10000111" starts at index 1 and has length 4),
we can slightly modify the program to track the startIndex of both the current and longest uniform sequences.
Time Complexity: O(n) the function uses a single loop that iterates through the string exactly once.
Space Complexity: O(1) The function uses a fixed number of integer variables: maxLength, maxStartIndex, currentLength, currentStartIndex
*/

package string;

public class LongestUniformString {

	public static void main(String[] args) {

		String inputStr = "10000111";

		longestUniformSubstring(inputStr);
	}

	public static void longestUniformSubstring(String inputStr) {

		int currentLength = 1;
		int currentStartIndex = 0;

		int maxLength = 1;
		int maxStartIndex = 0;


		for(int i=1; i<inputStr.length(); i++){
			if(inputStr.charAt(i) == inputStr.charAt(i-1)){
				currentLength++;
			} else{
				currentLength = 1;
				currentStartIndex = i;
			}
			if(currentLength>maxLength){
				maxLength = currentLength;
				maxStartIndex = currentStartIndex;
			}
		}

		System.out.println("Start Index Of Longest Uniform Substring " + maxStartIndex);

		System.out.println("Index Index Of Longest Uniform Substring " + maxLength);
	}
}
