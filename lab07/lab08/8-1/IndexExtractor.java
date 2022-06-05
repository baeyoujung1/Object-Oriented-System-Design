package lab07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Comparator; 
import java.util.Set;
import java.util.TreeSet;

public class IndexExtractor {

   public static void main(String[] args) {
      Scanner scanner = null;
      String[] words;
      Set<String> set;
      try {
         scanner = new Scanner(new FileReader("article.txt"));
         
         if (scanner.hasNext()) {
            words = scanner.nextLine().split("\\W+");
            set = new TreeSet<>(new Comparator<String>() {
               @Override
               public int compare(String o1, String o2) {
                  if (o1.toLowerCase().charAt(0) == o2.toLowerCase().charAt(0)) {
                     if (o1.charAt(0) == o2.charAt(0)) {
                        return o1.compareTo(o2);
                     } else {
                        return o1.charAt(0) - o2.charAt(0);
                     }
                  } else {
                     return o1.toLowerCase().compareTo(o2.toLowerCase());
                  }
               }
            });
            
            for (String word : words) {
               set.add(word);
            }
            
            for (String word : set.toArray(new String[0])) {
               System.out.println(word);
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