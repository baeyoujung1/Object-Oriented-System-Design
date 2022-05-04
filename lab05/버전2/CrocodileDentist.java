package lab05;

public class CrocodileDentist {

	CrocodileTooth[] teeth;
	
	int indexOfSoreTooth;
	
	private boolean chosenSoreTooth;
	
	private int remainedToothCount;
		
	public CrocodileDentist(int totalCount) {
		teeth = new CrocodileTooth[totalCount];
		indexOfSoreTooth = (int) (Math.random() * totalCount);
		int indexOfGoldenTooth;
		do {
			indexOfGoldenTooth = (int) (Math.random() * totalCount);
		} while (indexOfSoreTooth == indexOfGoldenTooth);
		chosenSoreTooth = false;
		remainedToothCount = totalCount;
		for (int i = 0; i < teeth.length; i++) {
			if (i == indexOfSoreTooth) {
				teeth[i] = new SoreTooth();
			} else if (i == indexOfGoldenTooth) {
				teeth[i] = new GoldenTooth();
			}
			else {
				teeth[i] = new NormalTooth();
			}
		}
	}
	
	public boolean hasTeeth() {
		return remainedToothCount > 0 && !chosenSoreTooth;
	}
	
	public CrocodileTooth chooseTooth(int index) {
		//¿ÃπÃ ∞Ò∂˙¥¯ ¿Ãª°, null¿ª ∏Æ≈œ
		//ªı∑Œ ∞Ì∏• ¿Ãª°¿ª ∏Æ≈œ
		if (teeth[index].isPulled()) {
			return null;		
		} else {
			if (teeth[index].isSoreTooth()) {
				chosenSoreTooth = true;
			}
			teeth[index].remove();
			remainedToothCount--;
			return teeth[index];
		}
	}
}

