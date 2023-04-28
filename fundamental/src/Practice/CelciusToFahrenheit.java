package Practice;

import java.util.Scanner;

public class CelciusToFahrenheit {

	public static void main(String[] args) {
	        float temp;
	        Scanner sc = new Scanner (System.in);
	        System.out.println("Enter Temperature");
	        temp = sc.nextFloat();
	        temp = ((temp-32)*5)/9;
	        System.out.println("celcius temp is "+ temp);
	        
	        

	}

}
