package invitae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {
	final static String STOP = "STOP";
	static HashMap<String, String> proteinMap = new HashMap<String, String>();

	static {

		proteinMap.put("CAA", "Gln");
		proteinMap.put("CAG", "Gln");
		proteinMap.put("AUG", "Methionine");
		proteinMap.put("UUU", "Phenylalanine");
		proteinMap.put("UUC", "Phenylalanine");
		proteinMap.put("UUA", "Leucine");
		proteinMap.put("UUG", "Leucine");
		proteinMap.put("UCU", "Serine");
		proteinMap.put("UCC", "Serine");
		proteinMap.put("UCA", "Serine");
		proteinMap.put("UCG", "Serine");
		proteinMap.put("UAU", "Tyrosine");
		proteinMap.put("UAC", "Tyrosine");
		proteinMap.put("UGU", "Cysteine");
		proteinMap.put("UGC", "Cysteine");
		proteinMap.put("UGG", "Tryptophan");
		proteinMap.put("GCG", "Ala");
		
	}
	
	public static void main(String[] args) {
		// Input = TAC GGT CCC ACT
		// Expected Output = ATG CCA GGG TGA
		// Other potential output for a different transcript AUG CCA GGG UGA
		String dnaString = "CAAATGCAGGCGTAA";
		System.out.println(translate(dnaString).toString());

	}

	public ProteinTranslator() {
		/*
		 * multiPut("Methionine", "AUG"); multiPut("Phenylalanine", "UUU", "UUC");
		 * multiPut("Leucine", "UUA", "UUG"); multiPut("Serine", "UCU", "UCC", "UCA",
		 * "UCG"); multiPut("Tyrosine", "UAU", "UAC"); multiPut("Cysteine", "UGU",
		 * "UGC"); multiPut("Tryptophan", "UGG"); multiPut(STOP, "UAA", "UAG", "UGA");
		 */

	}

	static List<String> translate(String rnaSequence) throws IllegalArgumentException {
		ArrayList<String> proteins = new ArrayList<String>();
		String codon, protein = null;
		String dnaString = rnaSequence.replaceAll("//s", "");
		for (int i = 0; i < dnaString.length() - 2; i += 3) {
			codon = dnaString.substring(i, i + 3);
			String newCodon = codon.replace("T", "U");
			//System.out.println(newCodon);
            
			if(newCodon.startsWith("AUG")) {
				protein = proteinMap.get(newCodon);
				proteins.add(protein);
			}
			
			if (!proteins.isEmpty() && protein != null) {
				protein = proteinMap.get(newCodon);
			}
			
			System.out.println(protein);
			if (protein == STOP)
				break;
			// if (protein == null)
			// throw new IllegalArgumentException("codon must be an accepted codon.");
			// System.out.println(proteins);
			if (protein != null) {
				proteins.add(protein);
			}
		}
		return proteins;
	}
}
