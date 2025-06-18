package sort;

public class SelectionSort {

    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 1};
        int length = arr.length;

        selectionSort(arr, length);
    }

    public static void selectionSort(int [] arr, int length){
        int temp = 0;
        for(int i=0; i<length-2; i++){
            int minimumIndex = i;

            for (int j=i+1; j<length-1; j++)
            {
                if(arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
                //System.out.println(arr[j]);
            }
            temp = arr[minimumIndex];
            arr[minimumIndex] = arr[i];
            arr[i] = temp;

        }


        for (int i=0; i<length;i++){
            System.out.println(arr[i]);
        }


    }
}
