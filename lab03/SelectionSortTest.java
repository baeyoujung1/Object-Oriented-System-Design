package lab03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectionSortTest {
	
	public boolean equalsArray(double[] a, double[] b) {
		if (a.length!=b.length) return false;
		else {
			int i=0;
			while (i<a.length) {
				if (a[i]!=b[i]) return false;
				i++;
			}
		}
		return true;
	}

	@Test
	void sort() {
		double[] input = {1,2,3};
		double[] expected = {1,2,3};
		SelectionSort.sort(input);
		assertTrue(equalsArray(expected,input));
		
		double[] input1 = {3,2,1};
		SelectionSort.sort(input1);
		assertTrue(equalsArray(expected,input1));
	}
	
	@Test
	void exchange() {
		
		double[] input = {3,2,1,6,7,10};
		double[] expected = {3,2,10,6,7,1};
		
		SelectionSort.exchange(input,2,5);
		assertTrue(equalsArray(expected,input));
	}
	
	@Test
	void findSmallestIndex() {
		int smallestIndex;
		double[] input= {3,2,1,6,7,10};
		smallestIndex=SelectionSort.findSmallestIndex(input,0);
		assertEquals(2,smallestIndex);
		
		smallestIndex=SelectionSort.findSmallestIndex(input,3);
		assertEquals(3,smallestIndex);
	}

}
