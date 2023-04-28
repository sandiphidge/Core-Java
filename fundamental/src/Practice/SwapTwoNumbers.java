package Practice;

import java.util.Scanner;

public class SwapTwoNumbers {
   public static void main(String[] args) {
      int num1, num2, temp;
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the first number: ");
      num1 = input.nextInt();

      System.out.println("Enter the second number: ");
      num2 = input.nextInt();

      temp = num1;
      num1 = num2;
      num2 = temp;

      System.out.println("After swapping:");
      System.out.println("First number = " + num1);
      System.out.println("Second number = " + num2);
   }
}



