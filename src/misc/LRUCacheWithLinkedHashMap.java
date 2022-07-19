package misc;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
	private LinkedHashMap<Integer, Integer> map;
	private final int CAPACITY;

	public LRUCache(int capacity) {
		CAPACITY = capacity;
		map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
			protected boolean removeEldestEntry(Map.Entry eldest) {
				return size() > CAPACITY;
			}
		};
	}

	// This method works in O(1)
	public int get(int key) {
		return map.getOrDefault(key, -1);
	}

	// This method works in O(1)
	public void put(int key, int value) {
		map.put(key, value);
	}
}

public class LRUCacheWithLinkedHashMap {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);

		// it will store a key (1) with value
		// 10 in the cache.
		cache.put(1, 10);

		// it will store a key (2) with value 20 in the cache.
		cache.put(2, 20);

		System.out.println("Value for the key: 1 is " + cache.get(1)); // returns 10

		// evicts key 2 and store a key (3) with
		// value 30 in the cache.
		cache.put(3, 30);

		System.out.println("Value for the key: 2 is " + cache.get(2)); // returns -1 (not found)

		// evicts key 1 and store a key (4) with
		// value 40 in the cache.
		cache.put(4, 40);

		System.out.println("Value for the key: 1 is " + cache.get(1)); // returns -1 (not found)
		System.out.println("Value for the key: 3 is " + cache.get(3)); // returns 30
		System.out.println("Value for the key: 4 is " + cache.get(4)); // return 40

	}
}