package Practice;

import java.util.Scanner;

//Array In Matrix Form

public class MultipleArrayElement {

	public static void main(String[] args) {
	int a[][]=new int[2][2];
	System.out.println("Enter Array Elements: ");
	Scanner s =new Scanner(System.in);
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
	System.out.print("Matrix Element:\n");	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
	System.out.print(a[i][j]+" ");

	}
		System.out.println();	}
	
	}

}
