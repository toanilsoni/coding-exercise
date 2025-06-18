package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateMap {

	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<String, String>();
		strMap.put("1", "Anil");
		strMap.put("2", "Ashvik");

		for (Entry mEntry : strMap.entrySet()) {
			System.out.println("Key :" + mEntry.getKey() + " Value :" + mEntry.getValue());
		}

	}

}
