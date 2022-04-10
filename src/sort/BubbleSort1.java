package sort;

public class BubbleSort1 {

    public static void main(String[] args) {

        int [] data = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(data);
        //System.out.println(bubbleSort(data));
    }

    public static void bubbleSort(int [] data){
        int temp = 0;

        for (int i=0; i<data.length-1; i++){
            for (int j=0; j<data.length-1-i;j++){
                if(data[j] > data[j+1]){
                    temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }


        }

        for (int i=0; i<data.length; i++){
            System.out.println(data[i]);
        }
    }


}
