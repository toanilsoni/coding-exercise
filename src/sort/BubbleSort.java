package sort;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 1};
        int length = arr.length;

        bubbleSort(arr, length);
    }

    public static void bubbleSort(int [] data, int length){
        int temp = 0;
        for (int i=0; i<length-1 ; i++){

            for (int j=0; j<length-1-i; j++) {
                if(data[j] > data[j+1]){
                    temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }

                //System.out.println(data[j]);
            }
        }


        for (int i=0; i<length;i++){
            System.out.println(data[i]);
        }


    }
}
