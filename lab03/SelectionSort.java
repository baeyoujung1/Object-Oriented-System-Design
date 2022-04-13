package lab03;

public class SelectionSort {
	public static void sort(double[] inputArray) {
		int smallestIndex;
		for (int i = 0; i < inputArray.length - 1; i++) {
			smallestIndex=findSmallestIndex(inputArray,i+1);
			if (inputArray[i] > inputArray[smallestIndex]) {
				exchange(inputArray,i,smallestIndex);
			}
		}
	}

	public static int findSmallestIndex(double[] inputArray, int starting) {
		double min=inputArray[starting];
		int indexOfMin=starting;
		for (int i=starting+1;i<inputArray.length;i++) {
			if(inputArray[i]<min) {
				min=inputArray[i];
				indexOfMin=i;
			}
		}
		return indexOfMin;
	}

	public static void exchange(double[] inputArray, int index, int smallestIndex) {
		double temp=inputArray[index];
		inputArray[index]=inputArray[smallestIndex];
		inputArray[smallestIndex]=temp;	
	}

}
