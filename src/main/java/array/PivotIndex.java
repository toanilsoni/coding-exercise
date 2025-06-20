package array;

/*
pivot index, An index i such that the sum of all elements to the left of i is equal to the sum of all elements to the right of i
*/

import java.util.Map;

import java.util.HashMap;

import java.util.Map.Entry;

import java.util.HashSet;

import java.util.Set;

public class PivotIndex {
    public static void main(String args[]) {
        //int [] intArray = {1, 2, 6, 2, 5, 3, 3, 3};
        int[] intArray = {1, 2, 4, 1, 1, 1};
        System.out.println(pivotIndex(intArray));
    }

    public static int pivotIndex(int[] intArray) {
        int total = 0;

        for (int intValue : intArray) {
            total = total + intValue;
        }

        int leftSum = 0;

        for (int i = 0; i < intArray.length; i++) {
            int rightSum = total - leftSum - intArray[i];
            if (rightSum == leftSum) {
                return intArray[i];
            }

            leftSum = leftSum + intArray[i];
        }

        return -1;
    }
}