//https://leetcode.com/problems/spiral-matrix
package array;

import java.util.*;

public class SpiralMatrixOrder {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);  // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        List<Integer> output = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Traverse top row (left to right)
            for (int i = left; i <= right; i++) {
                output.add(matrix[top][i]);
            }
            top++;

            // Traverse right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                output.add(matrix[i][right]);
            }
            right--;

            // Traverse bottom row (right to left)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    output.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse left column (bottom to top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    output.add(matrix[i][left]);
                }
                left++;
            }
        }

        return output;
    }
}

