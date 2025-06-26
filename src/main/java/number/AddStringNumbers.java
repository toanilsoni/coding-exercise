//https://leetcode.com/problems/add-strings/
// N = num1.length()
// M = num2.length()
// Time Complexity: O(max(N, M)) The loop runs as long as i >= 0 || j >= 0 || carry != 0. So it iterates through all digits of the longer number (plus 1 if there's a final carry).
// "456" and "77" → loop runs 3 times (max(3, 2))
// O(max(N, M)) A StringBuilder is used to build the result digit by digit. In the worst case, result length is 1 more than the longer number (if there's a final carry).
//
//e.g., "999" + "1" → "1000"
package number;

public class AddStringNumbers {

    public  static void main(String [] args){
        String num1 = "456";
        String num2 = "77";

        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;

        StringBuilder strB = new StringBuilder();

        while(i>=0 || j>=0 || carry!=0){
            int digit1 = i>=0 ? num1.charAt(i) - '0': 0; // Subtracting '0' converts the character to its numeric value.
            int digit2 = j>=0 ? num2.charAt(j) - '0': 0; // Subtracting '0' converts the character to its numeric value.

            int total = digit1 + digit2 + carry;
            carry = total/10;

            strB.append(total%10);

            i--;
            j--;
        }

        return strB.reverse().toString();
    }

}