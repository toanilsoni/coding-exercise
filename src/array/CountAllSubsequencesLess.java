package array;

public class CountAllSubsequencesLess {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        int length = arr.length;
        int k = 10;

        countAllSubsequencesLess(arr, length, k);
    }

    public static void countAllSubsequencesLess(int [] data, int length, int k){

        for(int i=0; i<data.length; i++){
            for(int j=1; j<=data.length-1; j++){
                System.out.println("{" + data[i] + "," + data[j] + "}");
            }
            //System.out.println(data[i]);
        }


    }
}
