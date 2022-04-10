package array;
public class PlusOneArray {

    public static void main(String[] args) {

        int [] data = {9, 9};
        int l = data.length;

        int result [] = plusOne(data,l);
        //System.out.println(plusOne(data,l));

        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] plusOne(int [] data, int l){
        for (int i=l-1;i>=0; i--) {
            if (data[i] < 9) {
                data[i]++;
                return data;
            } else
                data[i] = 0;
        }
            int [] new_number = new int[l+1];
            new_number[0] = 1;



            //System.out.println(data[i]);



        return new_number;
    }


}
