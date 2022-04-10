package string;

public class RevertString {

	public static void main(String[] args) {
		String str = "Anil Soni";
		String newStr = str.replaceAll("\\s", "");
		char [] strChar = newStr.toLowerCase().toCharArray();
		
		/*List<Character> charList = new ArrayList<Character>();
		
		for (char c : strChar){
			charList.add(c);
		}
		
		Collections.reverse(charList);
		ListIterator li = charList.listIterator();
		while(li.hasNext()){
			System.out.print(li.next());
		}*/
		
		for(int i = strChar.length - 1; i>=0; i--){
			System.out.print(strChar[i]); 
		}
	}
}
