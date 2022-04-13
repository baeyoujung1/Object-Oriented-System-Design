package lab03;

public class RandomArrayGenerator {
	public static double[] generate(int size) {
		double[] array=new double[size];
		for (int i=0;i<array.length;i++) {
			array[i]=Math.random()*100;
		}
		return array;
	}

}
