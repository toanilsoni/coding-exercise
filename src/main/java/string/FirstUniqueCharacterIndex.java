// https://leetcode.com/problems/first-unique-character-in-a-string
/*Time Complexity: O(n)
n = length of the input string s
First loop: goes through each character once → O(n)
Second loop: again goes through each character once → O(n)

Space = O(1)
Max distinct characters = 26 → treated as constant
 */

package string;

import java.util.*;

public class FirstUniqueCharacterIndex {
    public static void main(String[] args) {
        String input = "leetcode";  // You can change this input to test other cases

        int index = firstUniqChar(input);
        System.out.println("Index of first unique character: " + index);
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        char[] charArray = s.toCharArray();

        // Count frequency of each character
        for (char c : charArray) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (charMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;  // No unique character found
    }
}
