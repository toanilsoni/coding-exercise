package misc;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheWithLinkedHashMap {
    public static void main(String[] args) {
        final int CAPACITY = 2;

        // Create a LinkedHashMap with access-order and custom removal
        Map<Integer, Integer> lruMap = new LinkedHashMap<Integer, Integer>(CAPACITY, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > CAPACITY;
            }
        };

        // Add some items
        lruMap.put(1, 10);
        lruMap.put(2, 20);

        System.out.println("Cache: " + lruMap);

        // Access key 1 (makes it most recently used)
        lruMap.get(1);

        // Add another item (should remove least recently used: key 2)
        lruMap.put(4, 40);
        System.out.println("After inserting 4: " + lruMap);
    }
}
