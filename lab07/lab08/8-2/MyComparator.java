package lab07;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
   
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

}