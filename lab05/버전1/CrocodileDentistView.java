package lab05;

public class CrocodileDentistView {

	public static void show(CrocodileDentist cDentist) {
		for (int i = 0; i < cDentist.teeth.length; i++) {
			if (i == (cDentist.teeth.length >> 1)) {
				System.out.println();
			}
			
			if (cDentist.teeth[i].isPulled()) {
				System.out.print("_");
			} else {
				System.out.print("O");
			}
		}
		System.out.println();
	}
}
