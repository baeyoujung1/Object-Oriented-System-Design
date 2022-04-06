package lab02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.CompositeRowProcessor;

class CrocodileDentistTest {

	@Test
	void testConstructor() {
		CrocodileDentist cDentist = new CrocodileDentist(0);
		assertEquals(0, cDentist.getIndexOfTheSoreTooth());
		assertEquals(1, cDentist.getSoreTooth());
		assertEquals(0xFFFFFFFF, cDentist.getTeeth());
		
		cDentist = null;
		
		cDentist = new CrocodileDentist(31);
		assertEquals(31, cDentist.getIndexOfTheSoreTooth());
		assertEquals(0x80000000, cDentist.getSoreTooth());
		assertEquals(0xFFFFFFFF, cDentist.getTeeth());
	}
	
	@Test
	void testHasTeeth() {
		CrocodileDentist cDentist = new CrocodileDentist(0);
		assertTrue(cDentist.hasTeeth());

		cDentist.setTeeth(0);
		assertFalse(cDentist.hasTeeth());

		cDentist.setTeeth(1);
		assertFalse(cDentist.hasTeeth());
	}
	
	@Test
	void testChooseTooth() {
		CrocodileDentist cDentist = new CrocodileDentist(0);

		cDentist.setTeeth(0x7);
		assertEquals(0x7, cDentist.getTeeth());
		
		cDentist.chooseTooth(2);
		assertEquals(0x3, cDentist.getTeeth());

		cDentist.chooseTooth(1);
		assertEquals(0x1, cDentist.getTeeth());
}
}
