//https://leetcode.com/problems/block-placement-queries
package array;

import java.util.*;

public class BlockPlacementQueries {
    public static List<Boolean> canPlaceBlocks(int[][] queries) {
        TreeSet<Integer> obstacles = new TreeSet<>();
        List<Boolean> result = new ArrayList<>();

        for (int[] q : queries) {
            if (q[0] == 1) {
                // Add obstacle
                obstacles.add(q[1]);
            } else {
                int x = q[1]; // We need to place a block within [0,3]
                int sz = q[2]; // Size of the block
                int prev = 0;
                boolean canPlace = false;

                if (x - sz + 1 <= 0) {
                    result.add(false);
                    continue;
                }

                // Go through each obstacle up to x
                for (int obs : obstacles.tailSet(0)) {
                    if (obs > x) break; // If an obstacle is beyond x, we stop — we only care about [0, x].

                    if (obs - prev >= sz) { // Check if the gap between prev and current obstacle is large enough for the block.
                        canPlace = true;
                        break;
                    }
                    prev = obs; // Move prev to obstacle.
                }

                // Check after last obstacle to x
                if (!canPlace && x - prev + 1 >= sz) {
                    canPlace = true;
                }

                result.add(canPlace);
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] queries = {
                {1, 7},
                {2, 7, 6},
                {1, 2},
                {2, 7, 5},
                {2, 7, 6}
        };

        List<Boolean> output = canPlaceBlocks(queries);
        System.out.println(output); // Output: [false, true, true]
    }
}

