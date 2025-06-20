//https://leetcode.com/problems/trapping-rain-water/solution/
package array;

public class RainDropTrap2Pointer2 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        // ||..||..||
        int size = arr.length;

        System.out.println(waterTrap(arr, size));
    }

    public static int waterTrap(int[] data, int size) {
        int i = 0;
        int j = size - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (i < j) {
            if (data[i] <= data[j]) {
                leftMax = Math.max(data[i], leftMax); // 1
                water = water + leftMax - data[i]; //0 + 1 - 1 = 0
                i++;
            } else {
                rightMax = Math.max(data[j], rightMax);
                water = water + rightMax - data[j];
                j--;
            }

        }

        return water;

    }
}
