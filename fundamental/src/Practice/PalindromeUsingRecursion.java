package Practice;

import java.util.Scanner;

public class PalindromeUsingRecursion {
	
	public static int pal (int n,int sum) {
		if(n==0)
	    return sum;
		sum =(sum*10)+(n%10);
		return pal(n/10, sum);	
		
	}
	

	public static void main(String[] args) {
		int num, sum=0,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		num =sc.nextInt();
		
		p= pal(num,sum);
		if (num==p)
			System.out.println(num + " Is Palindrome Number");
		else
			System.out.println(num + " Not a Palindrome Number");
		
	
	
	}

}
