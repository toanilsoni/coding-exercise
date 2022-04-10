package sort;

public class SelectionSort1 {

    public static void main(String[] args) {

        int [] data = {4,3,2,1};

        selectionSort(data);
        //System.out.println(bubbleSort(data));
    }

    public static void selectionSort(int [] data){
        int minimumIndex = 0;
        int temp = 0;
        for (int i=0;i<data.length-1; i++)
        {
            minimumIndex = i;
            for(int j=i+1; j<data.length; j++){
                if(data[j]< data[minimumIndex]){
                    minimumIndex =j;
                }
            }

            temp = data[minimumIndex];
            data[minimumIndex] = data[i];
            data[i] = temp;

        }


        for (int i=0; i<data.length; i++){
            System.out.println(data[i]);
        }
    }


}
