//https://prepinsta.com/hackerrank-coding-question-placements-5/

import java.util.HashMap;
import java.util.Map.Entry;

public class ElectionWinnder {

	public static void main(String[] args) {

		 String[] votes = { "john", "johnny", "jackie",
                 "johnny", "john", "jackie",
                 "jamie", "jamie", "john",
                 "johnny", "jamie", "johnny",
                 "john" };

		findWinner(votes);
	}

	public static void findWinner(String[] votes) {

		HashMap<String, Integer> voteMap = new HashMap<>();

		for (int i = 0; i < votes.length; i++) {

			if (voteMap.containsKey(votes[i])) {
				voteMap.put(votes[i], voteMap.get(votes[i]) + 1);
			} else {
				voteMap.put(votes[i], 1);
			}

			//System.out.println(votes[i]);
		}
		
		int maxVoteValue = 0;
		String winner = "";
		for(Entry vote : voteMap.entrySet()) {
			String key = vote.getKey().toString();
			Integer value = (Integer) vote.getValue();
			
			if(value > maxVoteValue) {
				maxVoteValue = value;
				winner = key;
			} else if (value ==  maxVoteValue && winner.compareTo(key)>0) {
				winner = key;
			}
			
			
			//System.out.println("Name " + vote.getKey() + " Number of Votes " + vote.getValue());
		}
		System.out.println("Winner " + winner + ": Number of votes " + maxVoteValue);
		
	}

}
