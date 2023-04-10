package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray_ByForLoop {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		System.out.println("Enter Array Elements: ");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]= s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Sorted Array Elements");
		for(int b:a)
		{
			System.out.print( b+" ");
		}
	}

}
