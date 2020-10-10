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


          System.out.print("How much money do you want to bet on your number? >>> ");
          float betAmount = getKeyboardFloat(sc);

          int target  = (int)(Math.random() * 100);

          if (target < guessedNumber)
          {
              money = money - betAmount;
              System.out.println("You lost loser! You lost all of your bet money! You'll never win!");

          }
          else if ( target == guessedNumber)
          {
              money = money + (betAmount * 10);
              System.out.println("This...wasn't supposed to happen... Congrats! You got a jackpot!");
          }
          else
          {
              double multiplier = Math.pow(((double)(guessedNumber) / 50), 2);
              money = money + (betAmount * multiplier);
              money = Math.floor(money * 100) / 100;
              System.out.println("You won, kinda....");
          }
          System.out.println("Your new money amount: " + money);
      }
      if(money == 0)
      {
          System.out.println("You lost! Imagine being broke...");
      }
      else
      {
          System.out.println("You won! Congratulations!");
      }
    }
public static int getKeyboardInt(Scanner sc)
{
    while(true)
    {
        try
        {
            int guessedNumber = Integer.parseInt(sc.nextLine());
            return guessedNumber;
        }
        catch (Exception e)
        {
            System.out.println("Not an Integer!");
        }
    }
}
    public static float getKeyboardFloat(Scanner sc)
    {
        while(true)
        {
            try
            {
               float guessedNumber = Float.parseFloat(sc.nextLine());
                if (guessedNumber == Math.floor(guessedNumber * 100) / 100)
                    return guessedNumber;
                else
                    System.out.println("The value entered was not a valid money number");
            }
            catch (Exception e)
            {
                System.out.println("Not an Float!");

            }
        }
    }

}
