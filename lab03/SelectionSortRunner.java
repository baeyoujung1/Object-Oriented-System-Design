package lab03;

public class SelectionSortRunner {

	public static void main(String[] args) {
		double input[]=RandomArrayGenerator.generate(10);
		
		printArray(input);
		
		SelectionSort.sort(input);
		
		printArray(input);
	}

	private static void printArray(double[] input) {
		System.out.println("Array length: "+input.length);
		System.out.print("{");
		for (double val:input) {
			System.out.printf("%.1f, ", val);
		}
		System.out.println("}");
	}
	
}
