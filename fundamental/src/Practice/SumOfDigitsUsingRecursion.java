package Practice;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {
	
	
	public static int sumOfDigits(int num){
	if (num<=0) {
	return 0;
	}
	
	int lastDigit = num % 10;
	int sum = lastDigit + sumOfDigits(num / 10);
	return sum;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = sumOfDigits(num);
		System.out.println("Sum of Digits of "+ num +" is " + sum);

	}

}
