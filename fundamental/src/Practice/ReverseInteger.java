package Practice;
//input 123 to 321
import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) { 
		 int n,r;
		 System.out.println("Enter Any Number");
		 Scanner sc = new Scanner(System.in);
		  n= sc.nextInt();
		
		 
		while (n>0)
		{
		r=n%10;
		System.out.print(r);
		n=n/10;
			
			
	}	
		
		
	}

}
