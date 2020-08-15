import java.util.Scanner;

public class Main

{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("How much money do you want to put in? >>> ");
      double money = sc.nextDouble();
      sc.nextLine();
      System.out.print("How much money are you hoping to end up with today >>> ");
      double winMoney = sc.nextDouble();
      sc.nextLine();



      int round = 1;
      while (money > 0 && money < winMoney)
      {
          System.out.println("Round " + round + "......");
          System.out.println("\n\n");
          System.out.print("Guess a number between 0 and 100 >>> ");
          int guessedNumber = getKeyboardInt(sc);


      }
    }
public static int getKeyboardInt(Scanner sc)
{
    while(true)
    {
        try
        {
            int guessedNumber = sc.nextInt();
            sc.nextLine();
            return guessedNumber;
        }
        catch (Exception e)
        {
            System.out.println("Not an Integer!");
        }
    }
}

}
