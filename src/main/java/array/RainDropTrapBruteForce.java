package array;

public class RainDropTrapBruteForce {

    public static void main(String[] args) {
        //int [] arr = {3, 0, 2, 0, 4};
        int [] arr = {1, 0, 1};
        int length = arr.length;

        System.out.println(trap(arr, length));
    }

    public static int trap(int [] arr, int length){
        int water = 0;

        int [] leftMax = new int[length];
        int [] rightMax = new int[length];

        for (int i=0; i<length; i++){
            if(i==0){
                leftMax[i] = arr[i];
                rightMax[length-1] = arr[length-1];
            } else{
                leftMax[i] = Math.max(arr[i], leftMax[i-1]);
                rightMax[length-i-1] = Math.max(arr[length-i-1], rightMax[length-i]);
            }
        }

        for (int j=0; j<length; j++){
            water +=  Math.min(leftMax[j], rightMax[j]) - arr[j];
        }

        return water;
    }


}
