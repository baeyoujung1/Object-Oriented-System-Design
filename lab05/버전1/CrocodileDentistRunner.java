package lab05;

import java.util.Scanner;

public class CrocodileDentistRunner {

	public static void main(String[] args) {
		CrocodileDentist cDentist = new CrocodileDentist(32);
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		CrocodileTooth chosenTooth;
		while (cDentist.hasTeeth()) {
			CrocodileDentistView.show(cDentist);
			while (true) {
				System.out.print("당신의 선택은? (0-31): ");
				choice = scanner.nextInt();
				chosenTooth = cDentist.chooseTooth(choice);
				if (chosenTooth == null) {
					System.out.println("이미 고른 이빨입니다....");
				} else {
					break;
				}
			}
			System.out.println(chosenTooth);
		}
		
		System.out.println("You are the one!!");
		
		if (scanner != null) {
			scanner.close();
		}
	}
}