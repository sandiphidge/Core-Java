package Learning.OOP.ExceptionHandling;

public class Query3 {
	
	public static void m2() {
		String str = null;
		int data = str.length();
		try {
			int result = 12/0;
		}catch (ArithmeticException ae) {
			System.out.println("Inside Ae");
		}catch (Exception e) {
			System.out.println("Inside E");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    m2();
	}

}
//java is programming language
//Java Is Programming Language
