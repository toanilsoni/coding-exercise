/*
https://leetcode.com/problems/merge-intervals/description/

https://leetcode.com/problems/merge-intervals/solutions/6805405/beats-97-95-beginner-friendly-explanation-java-python-c-javascript/

Time Complexity:
Sorting: O(n log n)

One pass through array: O(n)

➤ Total: O(n log n)

Space Complexity:
Output list: Up to O(n) intervals if none overlap

➤ Total: O(n)
 */
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
        List<int[]> res = mergeOverlap(intervals);

        for (int[] interval : res) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }

    static List<int[]> mergeOverlap(int[][] intervals) {
        // Sort intervals based on start time
        Arrays.sort(intervals, (a, b)-> Integer.compare(a[0], b[0])); // Arrays.sort(intervals, (a, b)-> Integer.compare(a[0], b[0]))
        //{{1, 5}, {2, 4}, {4, 6}, {7, 8}};
        List<int[]> merged = new ArrayList<>();
        int [] prev = intervals[0];

        for(int i=1; i<intervals.length; i++){
            // Overlap condition: current start <= previous end
            if(intervals[i][0]<prev[1]){
                // Merge intervals
                prev[1] = Math.max(prev[1], intervals[i][1]);
            } else{
                // No overlap, add previous interval to result
                merged.add(prev);
                prev = intervals[i];
            }
        }

        merged.add(prev); // Add the last interval

        return merged;
    }
}