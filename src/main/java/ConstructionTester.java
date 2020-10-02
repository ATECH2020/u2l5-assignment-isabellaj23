import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      //Gathering ints
      Scanner input = new Scanner(System.in); 
      System.out.println("Enter the sales tax rate: ");
      double taxRate = input.nextDouble();
      System.out.println("How many boards do you need? ");
      int boardNum = input.nextInt();
      System.out.println("How many windows do you need? ");
      int windowNum = input.nextInt();

       Construction house = new  Construction(8, 11, taxRate);
       double total =(house.lumberCost(boardNum) + house.windowCost(windowNum));
       System.out.println("Total: " + total);
       System.out.print("Grand Total: " + house.grandTotal(total));
       


    }
}
