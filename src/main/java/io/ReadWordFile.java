
package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWordFile {

	public static void main(String[] args) {
        int count =0;
		File file = new File("word.txt");

		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.next());
				count++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);

	}
}
