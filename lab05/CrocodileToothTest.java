package lab05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CrocodileToothTest {

	@Test
	void constructorTest() {
		CrocodileTooth normalTooth = new CrocodileTooth(false);
		assertEquals(false, normalTooth.isSoreTooth());
		
		CrocodileTooth soreTooth = new CrocodileTooth(true);
		assertEquals(true, soreTooth.isSoreTooth());
	}
	
	@Test
	void removeTest() {
		CrocodileTooth normalTooth = new CrocodileTooth(false);
		assertEquals(false, normalTooth.isPulled());
		
		normalTooth.remove();
		assertEquals(true, normalTooth.isPulled());

	}
	
	@Test
	void toStringTest() {
		CrocodileTooth soreTooth = new CrocodileTooth(true);
		assertEquals("!!.... OUCH", soreTooth.toString());
		
		CrocodileTooth normalTooth = new CrocodileTooth(false);
		assertEquals("Zzzzz...", normalTooth.toString());
	}

}
