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

    }
}
