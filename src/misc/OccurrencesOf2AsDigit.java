package misc;
public class OccurrencesOf2AsDigit {

	public static void main(String[] args) {
		System.out.println(occurrencesOf2AsDigit(22));

	}

	public static int occurrencesOf2AsDigit(int input) {
		int count =0;
		for(int i=0; i<=input ; i++){
			if(String.valueOf(i).contains("2")){
				count = count + number0f2s(i);
			}
		}
		return count;
	}

	static int number0f2s(int n)
	{
		int count = 0;
		while (n > 0)
		{
			if (n % 10 == 2)
				count++;

			n = n / 10;
		}
		return count;
	}
}
