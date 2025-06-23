// https://leetcode.com/problems/palindrome-number
// Time Complexity - Time = O(log x) // Every iteration of the while loop divides the number by 10.
// Space Complexity - O(1) // Using a few integer variables (num, rev, x), regardless of the input size.
package number;

public class PalindromNumber {

    public static  void main(String args []){
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int num = x;
        int reversed = 0;

        if (x < 0) {
            return false;
        }

        while (num != 0) {
            reversed = reversed * 10 + num % 10; // num % (modulo) 10 gets the last digit of the number. Multiply rev by 10 and add the last digit → effectively builds the reversed number.
            num = num / 10; // Divide num by 10 to remove the last digit.
        }

        if (reversed == x) {
            return true;
        }
        return false;
    }

}
