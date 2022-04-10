package misc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator2 {
	static final HashMap<String, String> translationMap = new HashMap();
	static {
		translationMap.put("AUG", "Methionine");
		translationMap.put("UUU", "Phenylalanine");
		translationMap.put("UUC", "Phenylalanine");
		translationMap.put("UUA", "Leucine");
		translationMap.put("UUG", "Leucine");
		translationMap.put("UCU", "Serine");
		translationMap.put("UCC", "Serine");
		translationMap.put("UCA", "Serine");
		translationMap.put("UCG", "Serine");
		translationMap.put("UAU", "Tyrosine");
		translationMap.put("UAC", "Tyrosine");
		translationMap.put("UGU", "Cysteine");
		translationMap.put("UGC", "Cysteine");
		translationMap.put("UGG", "Tryptophan");
	}
	
	public static void main(String[] args) {
		// Input = TAC GGT CCC ACT
		// Expected Output = ATG CCA GGG TGA
		// Other potential output for a different transcript AUG CCA GGG UGA
		String dnaString = "CAA ATF CAG GCA TAA";
		translate(dnaString).toString();

	}

	static List<String> translate(String rnaSequence) {
		/*
		 * if (rnaSequence.length() % 3 != 0) { throw new IllegalArgumentException(); }
		 */
		rnaSequence = rnaSequence.toUpperCase();
		ArrayList<String> translation = new ArrayList<String>();
		for (String part : getParts(rnaSequence)) {
			if (translationMap.get(part) != null) {
				translation.add(translationMap.get(part));
			}
			if (part.equals("UAA") || part.equals("UAG") || part.equals("UGA")) {
				break;
			}
		}
		return translation;
	}

	static List<String> getParts(String string) {
		ArrayList<String> parts = new ArrayList<String>();
		int len = string.length();
		for (int i = 0; i < len; i += 3) {
			parts.add(string.substring(i, i + 3));
		}
		return parts;
	}
}