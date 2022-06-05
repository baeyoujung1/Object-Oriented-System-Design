package lab07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class IndexExtractor {

   public static void main(String[] args) {
      Scanner scanner = null;
      String[] words;
      Map<String, Integer> map;
      Integer occurence;
      try {
         scanner = new Scanner(new FileReader("article.txt"));
         
         if (scanner.hasNext()) {
            words = scanner.nextLine().split("\\W+");
            
            map = new TreeMap<>(new Comparator<String>() {
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
               occurence = map.get(word);
               map.put(word, occurence == null ? 1 : occurence + 1);
            }
            
            for (String word : map.keySet().toArray(new String[0])) {
               System.out.println(word +", " + map.get(word));
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