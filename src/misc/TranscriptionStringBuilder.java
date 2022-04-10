/*
 * Complement a DNA sequence in Java or RNA complement of a given DNA strand java
 */
public class TranscriptionStringBuilder {

	public static void main(String[] args) {
		// Input = TAC GGT CCC ACT
		// Expected Output = ATG CCA GGG TGA
		// Other potential output for a different transcript AUG CCA GGG UGA

		String dnaStrand = "TAC GGT CCC ACT";
		System.out.println(makeComplement(dnaStrand));

	}

	public static String makeComplement(String dna) {
		StringBuilder builder = new StringBuilder(dna.length());

		for (int i = 0; i < dna.length(); i++) {
			if (dna.charAt(i) == 'T') {
				builder.append('A');
			}
			if (dna.charAt(i) == 'A') {
				builder.append('T');
			}
			if (dna.charAt(i) == 'C') {
				builder.append('G');
			}
			if (dna.charAt(i) == 'G') {
				builder.append('C');
			}
		}
		return builder.toString();
	}
}
