import java.util.Scanner;

public class ShowInterest
{
   public static final double INTEREST_RATE = 2.5;

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter your balance and interest rate");

      double balance = keyboard.nextDouble();
      double interest = keyboard.nextDouble();
      
      if (interest < 2.5)
      {
         interest = balance * (INTEREST_RATE/100.0);
      }
      else
      {
         interest = balance * (interest/100.0);
      }
      
      System.out.printf("On a balance of $ %.2f\n", balance);
      System.out.printf("You will earn interest of $ %.2f.\n", interest);
      System.out.println("All in just one short year.");
      
      if (keyboard != null)
      {
         keyboard.close();
      }
      
   }

}