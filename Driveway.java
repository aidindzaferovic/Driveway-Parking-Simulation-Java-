import java.util.Stack;
import java.util.Scanner;

public class Driveway
{ 
   private Stack<Integer> driveway;  
   private Stack<Integer> street;

   public Driveway()
   {
      driveway = new Stack<Integer>();
      street = new Stack<Integer>();
   }

   public void add(int licensePlate)
   {
      driveway.push(licensePlate);
      print();
   }

   public void remove(int licensePlate)
   {
      while (!driveway.isEmpty() && driveway.peek() != licensePlate) 
      {
         street.push(driveway.pop());
      }
      if (!driveway.isEmpty()) 
      {
         driveway.pop();
      }
      while (!street.isEmpty()) 
      {
         driveway.push(street.pop());
      }
      print();
   }
   
   public void print()
   {
      System.out.println("Driveway: " + driveway.toString());
      System.out.println("Street: " + street.toString());
   }

   public static void main(String[] args)
   {
      Driveway testDriveway = new Driveway();
      Scanner in = new Scanner(System.in);
      System.out.println("Positive license plate integers will add cars to the driveway," + " negative will remove," + " 0 stops the simulation.");
      while (in.hasNextInt())
      {
         int licensePlate = in.nextInt();
         if (licensePlate > 0)
         {
            testDriveway.add(licensePlate);
         }
         else if (licensePlate < 0)
         {
            testDriveway.remove(0 - licensePlate);
         }
         else
         {
            return;
         }
         System.out.println("Positive license plate integers will add cars to the " + "driveway, negative will remove, 0 stops the simulation.");
      }
   }
}
