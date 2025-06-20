package array;
import java.util.HashMap;
import java.util.Map;

public class HighestResourceUseFromLogs {
	
	public static void main(String[] args) {
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

		analyzeLog(logs);
	}

	public static void analyzeLog(String[][] logs) {
		HashMap<String, Integer> userAccount = new HashMap<String, Integer>();
		for(String [] log : logs){
			String user = log[1];
			userAccount.put(user, userAccount.getOrDefault(user,0) + 1);
		}

		int maxAccess = 0;
		String topUser = null;
		for(Map.Entry <String, Integer> logValue : userAccount.entrySet()){

			if(logValue.getValue() > maxAccess){
				maxAccess = logValue.getValue();
				topUser = logValue.getKey();
			}
		}
		System.out.println(topUser + " " + maxAccess);
	}
}
