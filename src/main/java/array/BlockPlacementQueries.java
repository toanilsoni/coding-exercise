//https://leetcode.com/problems/block-placement-queries
package array;

import java.util.*;
/*
Problem context in short:
There is an infinite number line starting at 0 going right.
You can place obstacles at given points on the line.
You want to check if a block of size sz can fit entirely somewhere between [0, x] without overlapping any obstacle. The block can touch obstacles but cannot overlap them.
 */
public class BlockPlacementQueries {
    public static List<Boolean> canPlaceBlocks(int[][] queries) {
        /*
        queries is a 2D array where each query is:
        Type 1 query: [1, x] → place obstacle at position x.
        Type 2 query: [2, x, sz] → check if block size sz fits anywhere in [0, x] without overlapping obstacles.
         */
        TreeSet<Integer> obstacles = new TreeSet<>();
        /*
        We keep all obstacle positions in a TreeSet because:
            - It automatically sorts obstacle positions.
            - It supports fast navigation.
         */
        List<Boolean> result = new ArrayList<>();

        for (int[] q : queries) {
            if (q[0] == 1) {
                // Add obstacle
                obstacles.add(q[1]);
            } else { // Check if the block can be placed.
                int x = q[1]; // We need to place a block within [0,x]
                int sz = q[2]; // Size of the block
                int prev = 0;  // keeps track of the start of the next free segment
                boolean canPlace = false; // flag to record if block can be placed

                // if the block size is larger than the whole range [0, x], we cannot place the block.
                if (sz > x) {
                    result.add(false);
                    continue;
                }

                // Iterate over obstacles from 0 up to x
                for (int obs : obstacles.tailSet(0)) { // The loop only checks gaps before each obstacle
                    if (obs > x) break; // If an obstacle is beyond x, we stop — we only care about [0, x].

                    if (obs - prev >= sz) { // Check if the gap between prev (start of free space) and current obstacle is large enough for the block.
                        canPlace = true;
                        break;
                    }
                    prev = obs; // Move prev to obstacle. This means the next free space will start at or after this obstacle (block cannot overlap).
                }

                // Checks gap between the last obstacle and x
                if (!canPlace && x - prev + 1 > sz) { // number of free positions from prev to x inclusive
                    canPlace = true;
                }

                result.add(canPlace);
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] queries = {{1, 2}, {2, 3, 3}, {2, 3, 1}, {2, 1, 1}};

        List<Boolean> output = canPlaceBlocks(queries);
        System.out.println(output); // Output: [false, true, true]
    }
}