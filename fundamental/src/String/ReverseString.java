package String;

public class ReverseString {
//By using CharArray
	public static void main(String[] args) {
		String str = "We are learning java";
		char[] chArr = str.toCharArray();
		for(int i=chArr.length - 1; i>=0; i--) {
			System.out.print(chArr[i]);
			
		}
           System.out.println("");
		
		// By Using  charAt
		for(int i = str.length() - 1;i>=0;i--) {
			System.out.print(str.charAt(i));
			
		}
		   System.out.println("");
		
		
		//By using String Buffer
		StringBuffer sp =new StringBuffer(str);
		System.out.print(sp.reverse());
	}
	

}






       