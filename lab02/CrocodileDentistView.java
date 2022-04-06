package lab02;

public class CrocodileDentistView {

   public static void draw(CrocodileDentist cDentist) {
      int teeth = cDentist.getTeeth();
      int a = 0x1;
      for(int i = 0; i < 16; i++) {
         if((a & teeth) != 0x0) {
            System.out.print("0");
         }
         else {
            System.out.print("_");
         }
         a = a << 1;
      }
      System.out.print("\n");
      for(int i = 16; i < 32; i++) {
         if((a & teeth) != 0x0) {
            System.out.print("0");
         }
         else {
            System.out.print("_");
         }
         a = a << 1;
      }
      System.out.print("\n");
   }

}
