package array;
/*
https://leetcode.com/problems/unique-number-of-occurrences/description/
Given an integer array, return true if the number of occurrences of each value is unique, otherwise return false.
*/

import java.util.Map;

import java.util.HashMap;

import java.util.HashSet;

import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String args[]) {
        //int [] intArray = {1, 2, 6, 2, 5, 3, 3, 3};
        int[] intArray = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(intArray));
    }

    public static boolean uniqueOccurrences(int[] intArray) {
        Map<Integer, Integer> intMap = new HashMap();

        for (int i = 0; i < intArray.length; i++) {
            if (intMap.containsKey(intArray[i])) {
                intMap.put(intArray[i], intMap.get(intArray[i]) + 1);
            } else {
                intMap.put(intArray[i], 1);
            }

        }

        Set<Integer> freqSet = new HashSet<>();
        boolean flag = false;

        for (int freq : intMap.values()) {
            if (!freqSet.add(freq)) {
                return false;
            }
        }

        return true;
    }
}