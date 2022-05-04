package lab05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CrocodileToothTest {

	@Test
	void constructorTest() {
		CrocodileTooth normalTooth = new NormalTooth();
		assertEquals(false, normalTooth.isSoreTooth());
		
		CrocodileTooth soreTooth = new SoreTooth();
		assertEquals(true, soreTooth.isSoreTooth());
	}
	
	@Test
	void removeTest() {
		CrocodileTooth normalTooth = new NormalTooth();
		assertEquals(false, normalTooth.isPulled());
		
		normalTooth.remove();
		assertEquals(true, normalTooth.isPulled());

	}
	
	@Test
	void toStringTest() {
		CrocodileTooth soreTooth = new SoreTooth();
		assertEquals("!!.... OUCH!!!", soreTooth.toString());
		
		CrocodileTooth normalTooth = new NormalTooth();
		assertEquals("Zzzzz...", normalTooth.toString());
		
		CrocodileTooth goldenTooth = new GoldenTooth();
		assertEquals("JACKPOT!!", goldenTooth.toString());
	}

}
