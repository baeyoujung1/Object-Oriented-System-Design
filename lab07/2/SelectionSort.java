package lab07;

import java.util.List;

public class SelectionSort<T extends Comparable<T>> {
   
   public void sort(List<T> inputArray) {
      int smallestIndex;
      for (int i = 0; i < inputArray.size() - 1; i++) {
         smallestIndex = findSmallestIndex(inputArray, i + 1);
         if (inputArray.get(smallestIndex).compareTo(inputArray.get(i)) < 0) {
            exchange(inputArray, i, smallestIndex);
         }
      }
   }
    
   public void exchange(List<T> inputArray, int a, int b) {
      T temp = inputArray.get(a);
      inputArray.set(a, inputArray.get(b));
      inputArray.set(b, temp);
   }
   
   public int findSmallestIndex(List<T> inputArray, int starting) {
      int smallestIndex = starting;
      T smallestNumber = inputArray.get(smallestIndex);
      for (int i = starting + 1; i < inputArray.size(); i++) {
         if (inputArray.get(i).compareTo(smallestNumber) < 0) {
            smallestIndex = i;
            smallestNumber = inputArray.get(i);
         }
      }
      return smallestIndex;
   }
}

