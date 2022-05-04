package lab05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CrocodileDentistTest {

	@Test
	void constructorTest() {
		CrocodileDentist cDentist = new CrocodileDentist(32);
		assertNotNull(cDentist);
		assertNotNull(cDentist.teeth);
		
		assertEquals(32, cDentist.teeth.length);
		int soreTeethCount = 0;
		int remainedTeethCount = 0;
		for (int i = 0; i < cDentist.teeth.length; i++) {
			assertNotNull(cDentist.teeth[i]);
			if (cDentist.teeth[i].isSoreTooth()) {
				soreTeethCount++;
			} if (!cDentist.teeth[i].isPulled()) {
				remainedTeethCount++;
			}
		}
		assertEquals(1, soreTeethCount);
		assertEquals(32, remainedTeethCount);
	}
	
	@Test
	void chooseToothTest() {
		CrocodileDentist cDentist = new CrocodileDentist(32);
		CrocodileTooth chosenTooth;
		chosenTooth = cDentist.chooseTooth(0);
		assertNotNull(chosenTooth);
		
		chosenTooth=cDentist.chooseTooth(0);
		assertNull(chosenTooth);
	}
	
	@Test
	void hasTeethTest() {
		CrocodileDentist cDentist = new CrocodileDentist(32);
		assertEquals(true, cDentist.hasTeeth());

		for (int i = 0; i < cDentist.teeth.length; i++) {
			cDentist.chooseTooth(i);
		}
		
		int remainedToothCount = 0;
		for (int i = 0; i < cDentist.teeth.length; i++) {
			if (cDentist.teeth[i].isPulled()) {
				remainedToothCount++;
			}
		}
		
		assertEquals(0, remainedToothCount);
		assertEquals(false, cDentist.hasTeeth());
		
	}
	
	@Test
	void hasTeethTest2() {
		CrocodileDentist cDentist = new CrocodileDentist(32);
		assertEquals(true, cDentist.hasTeeth());
		
		cDentist.chooseTooth(cDentist.indexOfSoreTooth);
		assertEquals(true, cDentist.hasTeeth());
	}

}
