// https://leetcode.com/problems/count-operations-to-obtain-zero
package array;

public class CountOperationsToObtainZero {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        int result = countOperations(num1, num2);

        System.out.println("Number of operations: " + result);
    }

    public static int countOperations(int num1, int num2) {
        int numberOfOperations = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
            numberOfOperations++;
        }
        return numberOfOperations;
    }
}
