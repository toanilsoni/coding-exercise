package array;
public class PlusOneArray {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 9};
        int length = arr.length;

        //System.out.println(plusOneBruteForce(arr, length));
        //System.out.println(optimal(arr, length));
        int result [] = optimal(arr, length);

        for (int i=0; i<length; i++){
            System.out.println(result[i]);
        }
    }

    public static int plusOneBruteForce(int[] data, int length) {
        int result = 0;
        int factor = 0;
        for (int i = 0; i < length; i++) {
            result = data[i] + factor * 10;
            factor = result;
        }
        return result + 1;
    }

    public static int [] optimal(int[] data, int length) {
        for (int i = length-1; i >= 0; i--) {
            if (data[i] < 9) {
                data[i]++;
                break;
            } else {
                data[i] = 0;
            }
        }
        if (data[0] == 0) {
            int [] newData = new int[length+1];
            newData[0] = 1;
            return newData;
        }
        return data;
    }
}
