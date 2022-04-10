package misc;
import java.util.HashMap;

/*
 * Complement a DNA sequence in Java or RNA complement of a given DNA strand java
 */
public class RNATranscriptionMap {

	public static void main(String[] args) {
		// Input = TAC GGT CCC ACT
		// Expected Output = ATG CCA GGG TGA
		// Other potential output for a different transcript AUG CCA GGG UGA
		String dnaStrands = "TACGGTCCCACT";
		System.out.println(rnaTanscription(dnaStrands));

	}

	public static StringBuilder rnaTanscription(String dnaStrand) {
		HashMap<Character, Character> dnaMap = new HashMap<Character, Character>();
		StringBuilder rnaTanscriptionResult = new StringBuilder();
		dnaMap.put('A', 'C');
		dnaMap.put('T', 'G');
		dnaMap.put('C', 'A');
		dnaMap.put('G', 'U');

		char[] nucleotides = dnaStrand.toCharArray();

		for (char nucleotide : nucleotides) {
			rnaTanscriptionResult.append(dnaMap.get(nucleotide));

		}

		return rnaTanscriptionResult;
	}

}
