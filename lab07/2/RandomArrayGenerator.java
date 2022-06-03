package lab07;

import java.util.ArrayList;
import java.util.List;

public class RandomArrayGenerator {
   
   public static List<Double> generate(int size) {
      List<Double> array = new ArrayList<Double>(size);
      for (int i = 0; i < size; i++) {
         array.add(Math.random() * 100);
      }
      return array;
   }
}