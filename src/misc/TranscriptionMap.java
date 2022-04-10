import java.util.ArrayList;
import java.util.List;

/*
 * Complement a DNA sequence in Java or RNA complement of a given DNA strand java
 */
public class TranscriptionMap {

	public static void main(String[] args) {
		// Input = TAC GGT CCC ACT
		// Expected Output = ATG CCA GGG TGA
		// Other potential output for a different transcript AUG CCA GGG UGA
		List<String> dnaStrands = new ArrayList<String>();
		dnaStrands.add("TAC GGT CCC ACT");
		dnaStrands.add("TAC GGT CCC ACT");
		System.out.println(makeComplementMap(dnaStrands));

	}

	public static StringBuilder makeComplementMap(List<String> dnaStrands) {
		StringBuilder complementString = new StringBuilder();
		for (String dnaStrandValue : dnaStrands) {
			// validate(dnaStrandValue);
			
			for (int i = 0; i < dnaStrandValue.length(); i++) {
				if (dnaStrandValue.charAt(i) == 'A') {
					complementString.append('T');
				} else if (dnaStrandValue.charAt(i) == 'T') {
					complementString.append('A');
				} else if (dnaStrandValue.charAt(i) == 'C') {
					complementString.append('G');
				} else if (dnaStrandValue.charAt(i) == 'G') {
					complementString.append('C');
				}
				
			}
			complementString.append(",");
		}

		return complementString;
	}

//	public static void validate(String input) {
//		String dnaStrandNoSpace = input.replaceAll("\\s", "");
//        char[] charSearch = {'A','T','C', 'G'}; 
//        for(int i=0; i<dnaStrandNoSpace.length(); i++) 
//        {
//            char chr = dnaStrandNoSpace.charAt(i);
//            for(int j=0; j<charSearch.length; j++)
//            {
//                if(charSearch[j] != chr)
//                {
//                	System.out.println("Invalid Input");
//                	break;
//                }
//            }  
//        }
//    }
}
