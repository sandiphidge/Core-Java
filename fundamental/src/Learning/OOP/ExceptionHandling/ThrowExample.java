package Learning.OOP.ExceptionHandling;

import java.util.Scanner;

class OnlineVoting{
	public static void ageVerifier(int age) {
		if(age<18) {
			throw new ArithmeticException("Age verification failed");
		}else {
			System.out.println("Please wait...");
			System.out.println("Welcome to Voting system");
		}
	}
}

public class ThrowExample {

	public static void main(String[] args) {
	System.out.println("Enter the age");
	Scanner sc = new Scanner (System.in);
	int age = sc.nextInt();
	OnlineVoting.ageVerifier(age);

	}

}
