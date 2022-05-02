//

package array;

public class TextJustification {

	public static void main(String[] args) {

		String[] array = { "Tutorial", "is", "the", "best", "portal", "for", "programming." };
		int size = 12;

		textJustification(array, size);
	}

	public static void textJustification(String[] array, int size) {
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length-1; i++) {
			int gap = Math.abs(size - (array[i].length() + array[i+1].length()));
			if (array[i].length() <= size) {
				//sb.append(array[i]);
				if(array[i].length() + array[i+1].length()<size) {
					sb.append(array[i]);
					for(int k=0; k<gap; k++) {
						sb.append(" ");
					}
				}
				
			} else {
				sb.append(array[i]);
				sb.append("\n");
			}

		}
		
		/*
		 * sb.append(array[i]); for(int j=array[i].length(); j<size; j++) {
		 * sb.append(" "); } sb.append("\n");
		 */
		
		System.out.println(sb.toString());

	}
}
