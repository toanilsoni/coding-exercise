//https://leetcode.com/discuss/interview-question/394477/goldman-sachs-phone-highest-average-score-power-of-10
package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestAverage {

    public static void main(String[] args) {
        String[][] arr = {{"Bob", "87"},
                {"Mike", "35"},
                {"Bob", "52"},
                {"Jason", "35"},
                {"Mike", "55"},
                {"Jessica", "99"}};
        int length = arr.length;

        System.out.println(highestAvg(arr, length));
    }

    public static float highestAvg(String[][] data, int length) {
        float highestAverage = 0;
        Map<String, List<Integer>> studentMap = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (studentMap.containsKey(data[i][0])) {
                List<Integer> currentScore = studentMap.get(data[i][0]);
                currentScore.add(Integer.valueOf(data[i][1]));
            } else {
                List<Integer> newScore = new ArrayList<>();
                newScore.add(Integer.valueOf(data[i][1]));
                studentMap.put(data[i][0], newScore);
            }
        }

        for (Map.Entry<String, List<Integer>> student : studentMap.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
            float average = calAvg(student.getValue());

            highestAverage = Math.max(highestAverage, average);
        }
        return highestAverage;

    }

    static float calAvg(List<Integer> scores) {
        int size = scores.size();
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        float average = sum / size;

        return average;
    }
}
