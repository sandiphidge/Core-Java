package LearningDecisionControlStatements;

import java.util.Scanner;

public class Switch2{ 
	
public static void Withdraw() {
	System.out.println("Deposite()executed");
}
	
	public static void Deposite() {
		System.out.println("Deposite()executed");
	}
	
	public static void BalEnq() {
		System.out.println("Deposite()executed");
	}


	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
System.out.println("1.Withdraw 2.Deposite 3.BalEnq");
System.out.println("Select any option");
int choice = sc.nextInt();
switch(choice) {

        case 1:Withdraw();
           break;

         case 2:Deposite();
           break;

         case 3:BalEnq();
            break;
default:System.out.println("Invaid choice");
	
}
System.out.println("Thanks For Using ATM");
	}
}
