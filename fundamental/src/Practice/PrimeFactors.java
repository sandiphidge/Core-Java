package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer to find its prime factors: ");
	        int num = scanner.nextInt();
	        System.out.print("Prime factors of " + num + " are: ");
	        List<Integer> primeFactors = getPrimeFactors(num);
	        for (int factor : primeFactors) {
	            System.out.print(factor + " ");
	        }
	    }

	    public static List<Integer> getPrimeFactors(int num) {
	        List<Integer> factors = new ArrayList<>();
	        for (int i = 2; i <= num; i++) {
	            while (num % i == 0) {
	                factors.add(i);
	                num /= i;
	            }
	        }
	        return factors;
	    }
	}


