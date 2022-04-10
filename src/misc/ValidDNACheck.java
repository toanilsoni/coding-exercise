/*
 * ValidDNACheck a boolean for the if and else statement to mean that if it contains ATG and TGA and their differences in their index is divisible by 3 with no remainder, then it is a protein.
 */
public class ValidDNACheck {

	public static void main(String[] args) {
		String dna1 = "ATGCGATACGCTTGA";
		String dna2 = "ATGCGATACGTGA";
		String dna3 = "ATTAATATGTACTGA";

		String[] dnaStrings = { dna1, dna2, dna3 };
		validDNA(dnaStrings);

	}

	public static void validDNA(String[] dnaStrings) {

		for (int i = 0; i < dnaStrings.length; i++) {
			if (dnaStrings[i].contains("ATG") && dnaStrings[i].contains("TGA") && dnaStrings.length % 3 == 0) {
				System.out.println("Contains valid protein");
			} else {
				System.out.println("Doesn't Contains valid protein");
			}
		}
	}

}
