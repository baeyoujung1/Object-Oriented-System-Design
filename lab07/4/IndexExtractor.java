package lab07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import lab06.SelectionSort;

public class IndexExtractor {

   public static void main(String[] args) {
      Scanner scanner = null;
      String[] words;
      try {
         scanner = new Scanner(new FileReader("article.txt"));
         
         if (scanner.hasNext()) {
            words = scanner.nextLine().split("\\W+");
            //processing myWords to remove duplicated words
            List<String> deduplicatedWords = new ArrayList<String>();
            for (String word : words) {
               if (!deduplicatedWords.contains(word)) {
                  deduplicatedWords.add(word);
               }
            }
            MyString[] myWords = MyString.getArrayFrom(deduplicatedWords.toArray(new String[0]));
            
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
