package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap; // Import HashMap
import java.util.List;
import java.util.Map;   // Import Map

public class GroupAnagramString {

    public static void main(String[] args) {

        String[] str = {"tea", "tan", "ate", "nat", "bat", "eat"}; // Added "eat" for better demo

        List<List<String>> anagramGroups = groupAnagramString(str);
        System.out.println(anagramGroups);
    }

    public static List<List<String>> groupAnagramString(String[] strInput) {
        // Use a Map to store sorted string as key and list of anagrams as value
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : strInput) {
            // 1. Convert word to character array for sorting
            char[] charArray = word.toCharArray();

            // 2. Sort the character array to create a canonical key
            Arrays.sort(charArray);

            // 3. Convert the sorted char array back to a String (this is our canonical key)
            String sortedWord = new String(charArray);

            // 4. Check if this sorted word (key) already exists in our map
            if (anagramMap.containsKey(sortedWord)) {
                // If it exists, add the original word to the existing list
                anagramMap.get(sortedWord).add(word);
            } else {
                // If it doesn't exist, create a new list, add the original word
                // and put this new list into the map with the sorted word as key
                List<String> newList = new ArrayList<>();
                newList.add(word);
                anagramMap.put(sortedWord, newList);
            }
        }

        // The values of the map are the lists of grouped anagrams
        // We return an ArrayList containing all these lists
        return new ArrayList<>(anagramMap.values());
    }
}