package lab02;

import java.util.Scanner;

public class CrocodileDentistRunner {
   
   public static void main(String[] args) {
      double randomValue = Math.random();
      int intRandomValue = (int)(randomValue * 100) + 1;
      
      CrocodileDentist cDentist = new CrocodileDentist(intRandomValue);
      Scanner scanner = new Scanner(System.in);
      
      // CrocodileDentistView view = new CrocodileDentistView(cDentist);
      
      int choice;
      while(cDentist.hasTeeth()) {
         CrocodileDentistView.draw(cDentist);
         // view.draw();
         System.out.print("당신의 선택은? (0-31): ");
         choice = scanner.nextInt();
         if(!cDentist.isSoreTooth(choice)) {
            cDentist.chooseTooth(choice);
         }
         else {
            break;
         }
      }
      
      System.out.println("You are the one!!");
      
      if(scanner != null) {
         scanner.close();
      }
   }
}
