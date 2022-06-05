package lab07;

import java.util.List;

public class SelectionSortRunner {
   
   public static void main(String[] args) {
      List<Double> input = RandomArrayGenerator.generate(10);
      
      printArray(input);
      
      SelectionSort.sort(input);
      
      printArray(input);
   }
   
   private static void printArray(List<Double> input) {
      System.out.println("Array length: " + input.size());
      System.out.print("{");
      for (Double value : input) {
         System.out.printf("%.2f, ", value);
      }
      System.out.println("}");
   }
}
