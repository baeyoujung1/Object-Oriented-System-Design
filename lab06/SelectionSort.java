package lab06;

public class SelectionSort {
	public static void sort(Comparable[] inputArray) {
		int smallestIndex;
		for (int i = 0; i < inputArray.length - 1; i++) {
			smallestIndex=findSmallestIndex(inputArray,i+1);
			//if (inputArray[smallestIndex] < inputArray[i]) {
			if(inputArray[smallestIndex].compareTo(inputArray[i]) < 0) {
				exchange(inputArray,i,smallestIndex);
			}
		}
	}

	public static int findSmallestIndex(Comparable[] inputArray, int starting) {
		int indexOfMin=starting;
		Comparable min=inputArray[starting];
		for (int i=starting+1;i<inputArray.length;i++) {
			if(inputArray[i].compareTo(min)<0) {
				indexOfMin=i;
				min=inputArray[i];
			}
		}
		return indexOfMin;
	}

	public static void exchange(Comparable[] inputArray, int a, int b) {
		Comparable temp=inputArray[a];
		inputArray[a]=inputArray[b];
		inputArray[b]=temp;	
	}

}
