package Learning.OOP.ExceptionHandling;

public class ExceptionIntro {

	public static void doCalculation(int a,int b) {
		int result = a/b;
		System.out.println(result);
		System.out.println("Calculation done successfully");
		
	}
	public static void doPrint(String str) {
		   String[]words = str.split(" ");
		   for(int i=0;i<=words.length;i++) {
			   System.out.println(words[i]);
		   }
	}
	
	public static void doOperation(String str) {
		//System.out.println(str.length());
		for(int i=0;i<=str.length();i++) {
			System.out.println(str.charAt(i));
		
		}
	}
	public static void main(String[] args) {
		//ExceptionIntro.doCalculation(12,0);
		String str = "Java is programming language";
		//ExceptionIntro.doPrint(str);
		
		String str1 = null;
		String str2 = "Java";
		ExceptionIntro.doOperation(str2);
	}

}
