package misc;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheWithLinkedHashMap {
    public static void main(String[] args) {
        final int CAPACITY = 2; //CAPACITY: Initial capacity of the map (max number of elements before eviction).

        /* Create a LinkedHashMap with access-order and custom removal
        // 0.75f: Load factor
        true: Access-order mode
            When true, Entries are maintained in access order — i.e., the most recently accessed (via get() or put()) are moved to the end of the internal order.
            When false, it maintains insertion order
        Why LinkedHashMap?
            Because LinkedHashMap maintains order of entries, and you can configure it to maintain:
                Insertion order (default) or
                Access order (true in constructor)
         What is Load Factor?
            The load factor is a measure of how full the hash table can get before it resizes (grows in size).
         */
        Map<Integer, Integer> lruMap = new LinkedHashMap<Integer, Integer>(CAPACITY, 0.75f, true) {
            //This method gets called after every put operation. If it returns true, the eldest entry (i.e., the least recently used one) is removed.
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
