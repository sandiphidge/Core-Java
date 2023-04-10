package Learning.OOP.ExceptionHandling;

public class Try_Catch {


		public static void doCalculation(int a,int b) {
			try {
				System.out.println("Inside try block");
			int result = a/b;
			System.out.println(result);
			System.out.println("Calculation done successfully");
		}   catch(ArithmeticException ae) {
			System.out.println("Catch block execution started");
			
		}
			System.out.println("After Exception");
		}
			public static void main(String[] args) {
				Try_Catch.doCalculation(12,0);
			}
	}


