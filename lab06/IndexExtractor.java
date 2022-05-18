package lab06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class IndexExtractor {

	public static void main(String[] args) {
		Scanner scanner = null;
		String[] words;
		try {
			scanner = new Scanner(new FileReader("article.txt"));
			
			if (scanner.hasNext()) {
				words = scanner.nextLine().split("\\W+");
				MyString[] myWords = MyString.getArrayFrom(words);
				SelectionSort.sort(myWords);
				for (MyString word : myWords) {
					System.out.println(word.getWord());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("No such file: article.txt");
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
