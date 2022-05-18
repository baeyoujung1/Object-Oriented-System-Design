package lab062;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyStringTest {

	@Test
	void getArrayFromTest() {
		String[] words = {"a","b","c"};
		MyString[] myStrings = MyString.getArrayFrom(words);
		
		assertNotNull(myStrings);
		assertEquals(words.length, myStrings.length);
		
		for (int i = 0; i < words.length; i++) {
			assertTrue(words[i].equals(myStrings[i].getWord()));
		}
	}
	
	@Test
	public void compareToTest() {
		MyString a = new MyString("a");
		MyString b = new MyString("b");
		
		assertTrue(a.compareTo(b) < 0);
		
		b.setWord("a");
		assertTrue(a.compareTo(b)==0);
		
		a.setWord("b");
		assertTrue(a.compareTo(b) > 0);
		
		a.setWord("A");
		b.setWord("a");
		assertTrue(a.compareTo(b) < 0);
		
		a.setWord("a");
		b.setWord("A");
		assertTrue(a.compareTo(b) > 0);
		
		a.setWord("Zelenski");
		b.setWord("and");
		assertTrue(a.compareTo(b) > 0);
		
		a.setWord("A");
		b.setWord("Accordingly");
		assertTrue(a.compareTo(b) < 0);

		
	}

}
