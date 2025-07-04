package array;
/*
Time: O(n) — one full pass from both sides

Space: O(1) — no extra space, just a few variables
 */
public class RainDropTrap2Pointer {

    public static void main(String[] args) {
        //int [] arr = {3, 0, 2, 0, 4};
        int [] arr = {0, 1, 0, 2, 0, 2};
        int length = arr.length;

        System.out.println(trap(arr, length));
    }

    public static int trap(int [] arr, int length){
        int i=0, j = length-1, leftMax=0, rightMax=0, water =0;

        while(i<j){

            if(arr[i] <= arr[j]){
                leftMax = Math.max(leftMax, arr[i]);
                water += leftMax - arr[i];
                i++;
            } else{
                rightMax = Math.max(rightMax, arr[j]);
                water += rightMax - arr[j];
                j--;
            }
        }

       return water;
    }


}
