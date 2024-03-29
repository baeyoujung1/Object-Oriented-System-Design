package lab05;

public class CrocodileDentist {

	CrocodileTooth[] teeth;
	
	int indexOfSoreTooth;
	
	private boolean chosenSoreTooth;
	
	private int remainedToothCount;
		
	public CrocodileDentist(int totalCount) {
		teeth = new CrocodileTooth[totalCount];
		indexOfSoreTooth = (int) (Math.random() * totalCount);
		chosenSoreTooth = false;
		remainedToothCount = totalCount;
		for (int i = 0; i < teeth.length; i++) {
			if (i == indexOfSoreTooth) {
				teeth[i] = new CrocodileTooth(true);
			} else {
				teeth[i] = new CrocodileTooth(false);
			}
		}
	}
	
	public boolean hasTeeth() {
		//���� �̻��� 1 �̻�, ���� �̻��� ���������� true
//		int remainedToothCount = 0;
//		for (int i = 0; i < teeth.length; i++) {
//			if (!teeth[i].isPulled()) {
//				remainedToothCount++;
//			}
//		}
		return remainedToothCount > 0 && !chosenSoreTooth;
	}
	
	public CrocodileTooth chooseTooth(int index) {
		//�̹� ����� �̻�, null�� ����
		//���� ���� �̻��� ����
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

