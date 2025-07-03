import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Your task is to compute, for each user:

The earliest and latest access timestamps.

Then calculate each user's session duration as:
latest_timestamp - earliest_timestamp

Finally, return a mapping of each user to their session duration.
 */
public class Practice
{
    public  static void main(String [] args){
        String arr [] = { "Anil", "AL", "Am", "I" };
        // AL, AM, ANIL, L

        sortArray(arr);

    }

    public static void sortArray(String [] array) {
        for (int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i].compareTo(array[j])>0){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.asList(array));
    }
}
