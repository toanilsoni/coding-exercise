package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HighestNumberOfUsage2DArray {

	static class Log {
		int time;
		String user;
		String resource;

		public Log(int time, String user, String resource) {
			this.time = time;
			this.user = user;
			this.resource = resource;
		}
	}
	
	public static void main(String[] args) {
		
		String[][] logs1 = new String[][] {
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
	    

		System.out.println(analyzeLog(logs1));
	}
	
	public static int analyzeLog(String[][] logs) {

		ArrayList<List<String>> logList = new ArrayList<List<String>>();

		HashMap<String, Integer> logMap = new HashMap<String, Integer>();
		
		for (String[] log : logs) {
			logList.add(Arrays.asList(log));
		}
		
		int i = 0;
		for (List<String> str : logList) {

			if (!logMap.containsKey(str.get(str.size() - 1))) {
				logMap.put(str.get(str.size() - 1), Integer.parseInt(str.get(str.size() - 3)));
				i = 1;
			} else if ((logMap.get(str.get(str.size() - 1)) - Integer.parseInt(str.get(str.size() - 3))) <= 300) {
				logMap.put(str.get(str.size() - 1), i++);
			} 

			// System.out.println(Integer.parseInt(str.get(str.size()-3)));
			// System.out.println(str.get(str.size()-1));

		}

		for (Entry entry : logMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		return -1;
	}
	


	/*HashMap<String, List<Integer>> logMap = new HashMap<String, List<Integer>>();
	
	for(int i=0; i<logs.length; i++) {
		if(logMap.containsKey(logs[i][2])) {
			List<Integer> timeList = logMap.get(logs[i][2]);
			timeList.add(Integer.parseInt(logs[i][0]));
			logMap.put(logs[i][2], timeList);
			
		} else {
			List<Integer> timeList = new ArrayList<Integer>();
			timeList.add(Integer.parseInt(logs[i][0]));
			logMap.put(logs[i][2], timeList);
			
		}
	}


	int highUsage = 0;
	
	for (Map.Entry<String, List<Integer>> entry : logMap.entrySet()) {
		System.out.println(entry.getKey() + " " + entry.getValue());
		
		if( entry.getValue().size() >highUsage) {
			highUsage =  entry.getValue().size();
		}
		
	}
	
	return highUsage;*/


}
