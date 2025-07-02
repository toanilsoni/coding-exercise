import java.util.*;
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
        String[][] logs = new String[][] {
                { "58523", "user_1", "resource_1" },
                { "62314", "user_2", "resource_2" },
                { "54001", "user_1", "resource_3" },
                { "200", "user_6", "resource_5" },
                { "215", "user_6", "resource_4" },
                { "54060", "user_2", "resource_3" },
                { "53760", "user_3", "resource_3" },
                { "58522", "user_22", "resource_1" },
                { "53651", "user_5", "resource_3" },
                { "2", "user_6", "resource_1" },
                { "100", "user_6", "resource_6" },
                { "400", "user_7", "resource_2" },
                { "100", "user_8", "resource_6" },
                {"54359", "user_1", "resource_3"},
        };

       System.out.println(highestAvg(logs));

    }

    public static int highestAvg(String [] [] str) {

        Map<String, List<Integer>> logMap = new HashMap<>();

        for(int i=0; i<str.length; i++){
            if(logMap.containsKey(str[i][1])){
                List<Integer> existingList = logMap.get(str[i][1]);
                existingList.add(Integer.valueOf(str[i][0]));
                logMap.put(str[i][1], existingList);

            } else{
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(Integer.valueOf(str[i][0]));
                logMap.put(str[i][1], newList);
            }
        }

        int sessionDuration = 0;
        for(Map.Entry<String, List<Integer>> mapValue : logMap.entrySet()){
            Collections.sort(mapValue.getValue(), Collections.reverseOrder());
            int duration = sessionDuration(mapValue.getValue());
            System.out.println(duration);
        }


        System.out.println(logMap);
        return sessionDuration;
    }

    public static  int sessionDuration(List<Integer> numberList){
        int duration = 0;

        if(numberList.size() == 1){
            return  0;
        }
        for(int number: numberList){
            duration = numberList.get(0) - + numberList.get(numberList.size()-1);;
        }
        return duration;

    }
}
