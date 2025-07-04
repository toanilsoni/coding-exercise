package misc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// bufferReader();
		// fileReader();
		// fileScanner();
		fileScannerCommaSeparatedFile();
	}

	public static void bufferReader() throws IOException {
		File file = new File("word.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String str;

		while ((str = br.readLine()) != null)
			System.out.println(str);
	}

	public static void fileReader() throws IOException {
		FileReader fl = new FileReader("word.txt");

		int i;

		while ((i = fl.read()) != -1)
			System.out.println((char) i);

	}

	public static void fileScanner() throws FileNotFoundException {

		File fl = new File("word.txt");
		Scanner sc = new Scanner(fl);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	}

	public static void fileScannerCommaSeparatedFile() throws FileNotFoundException {

		File fl = new File("CommaSeparated.txt");
		Scanner sc = new Scanner(fl);

		while (sc.hasNext()) {
			String str = sc.nextLine();
			parseString(str);
		}
	}

	public static void parseString(String str) {
		String bookName;
		String author;
		String price;
		
		Scanner sc = new Scanner(str);
		sc.useDelimiter(",");
		
		while(sc.hasNext()) {
			bookName = sc.next();
			author = sc.next();
			price = sc.next();
			
			System.out.println("Book Name - " + bookName + " Author - " + author + " Price - " +  price);
		}

	}
}
