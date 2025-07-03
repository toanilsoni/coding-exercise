package array;
/*
https://leetcode.com/problems/plus-one/description/
https://leetcode.com/problems/plus-one/solutions/2706861/java-fastest-0ms-runtime-easy-and-elegant-solution/

Time Complexity:
O(n) where n is the number of digits.

Space Complexity:
O(n) in the worst case. If a new array is allocated (e.g., from {9,9} to {1,0,0}), we create a new array of size n+1.
 */
public class PlusOneArray {

    public static void main(String[] args) {
        //int[] arr = {4, 3, 2, 9};
    	int[] arr = {9, 9};

        //System.out.println(plusOneBruteForce(arr));
        int result [] = plusOne(arr);

        for (int digit: result){
            System.out.println(digit);
        }
    }

    public static int plusOneBruteForce(int[] data) {
        int result = 0;
        int factor = 0;
        for (int i = 0; i < data.length; i++) {
            result = data[i] + factor * 10;
            factor = result;
        }
        return result + 1;
    }

    public static int [] plusOne(int[] data) {
        for (int i = data.length-1; i >= 0; i--) {
            if (data[i] < 9) {
                data[i]++;
                return data;
            } else {
                data[i] = 0;
            }
        }

        // If loop ends, all were 9s → need to add an extra digit
        data = new int[data.length + 1];
        data[0] = 1;  // Rest are already 0 by default

        return data;
    }
}
