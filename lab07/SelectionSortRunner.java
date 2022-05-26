package lab07;

import java.util.List;

public class SelectionSortRunner {
   
   public static void main(String[] args) {
      
      List<Comparable> input = RandomArrayGenerator.generate(10);
      
      printArray(input);
      
      SelectionSort.sort(input);
      
      printArray(input);
   }
   
   private static void printArray(List<Comparable> input) {
      System.out.println("Array length: " + input.size());
      System.out.print("{");
      for (Comparable value : input) {
         System.out.printf("%d, ", value);
      }
      System.out.println("}");
   }
}
