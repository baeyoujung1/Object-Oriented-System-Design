package lab07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.List;

public class IndexExtractor {

   public static void main(String[] args) {
      Scanner scanner = null;
      String[] words;
      SelectionSort<MyString> sorter = new SelectionSort<>();
      try {
         scanner = new Scanner(new FileReader("article.txt"));
         
         if (scanner.hasNext()) {
            words = scanner.nextLine().split("\\W+");
            //processing myWords to remove duplicated words
            List<MyString> myWords = MyString.getListFrom(words);
            sorter.sort(myWords);
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
