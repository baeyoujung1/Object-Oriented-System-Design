package lab07;

import java.util.List;

public class SelectionSort {
   
   public static void sort(List<Comparable> inputArray) {
      int smallestIndex;
      for (int i = 0; i < inputArray.size() - 1; i++) {
         smallestIndex = findSmallestIndex(inputArray, i + 1);
         if (inputArray.get(smallestIndex).compareTo(inputArray.get(i)) < 0) {
            exchange(inputArray, i, smallestIndex);
         }
      }
   }
   
   public static void exchange(List<Comparable> inputArray, int a, int b) {
      Comparable temp = inputArray.get(a);
      inputArray.set(a, inputArray.get(b));
      inputArray.set(b, temp);
   }
   
   public static int findSmallestIndex(List<Comparable> inputArray, int starting) {
      int smallestIndex = starting;
      Comparable smallestNumber = inputArray.get(starting);
      for (int i = starting + 1; i < inputArray.size(); i++) {
         if (inputArray.get(i).compareTo(smallestNumber) < 0) {
            smallestIndex = i;
            smallestNumber = inputArray.get(i);
         }
      }
      return smallestIndex;
   }
}

