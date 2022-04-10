import java.util.Arrays;
import java.util.List;

/*
 * Complement a DNA sequence in Java or RNA complement of a given DNA strand java
 */
public class RNATranscription {

	public static void main(String[] args) {
		// Input = TAC GGT CCC ACT
		// Expected Output = ATG CCA GGG TGA
		// Other potential output for a different transcript AUG CCA GGG UGA
		String dnaStrands = "TACGGTCCCACT";
		System.out.println(rnaTanscription(dnaStrands));

	}

	public static StringBuilder rnaTanscription(String dnaStrand) {
		StringBuilder rnaTanscriptionResult = new StringBuilder();
		char[] dnaCharSet = { 'A', 'T', 'C', 'G' };
		char[] rnaCharSet = { 'C', 'G', 'A', 'U' };
		List dnaList = Arrays.asList(dnaCharSet);

		for(int i=0; i<dnaStrand.length(); i++) {
			for(int j=0; j<dnaCharSet.length; j++) {
				if(dnaStrand.charAt(i)==dnaCharSet[j]) {
					rnaTanscriptionResult.append( rnaCharSet[j]);
				}
			}
			System.out.println(Character.toString(dnaStrand.charAt(i)));
			/*if(!dnaList.contains(dnaStrand.charAt(i))) {
				System.out.println("Invalid Output");
				throw new IllegalArgumentException("Invalid Output");
			}*/
		}
		

		return rnaTanscriptionResult;
	}

}
