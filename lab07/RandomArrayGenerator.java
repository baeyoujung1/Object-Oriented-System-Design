package lab07;

import java.util.ArrayList;
import java.util.List;

public class RandomArrayGenerator {
   
   public static List<Comparable> generate(int size) {
      List<Comparable> array = new ArrayList<Comparable>(size);
      Integer number;
      while (array.size() < size) {
         number = (int) (Math.random() * 10);
         if (!array.contains(number)) {
            array.add(number);
         }
      }
      return array;
   }
}
