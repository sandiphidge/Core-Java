package Practice;

public class CapitalizeString {

	public static void main(String[] args) {
	String str = "java is programming language";
	String[]words =str.split(" ");
	String str2="";
	for (String result : words) {
	str2= str2+result.toUpperCase().charAt(0)+result.substring(1).concat(" ");
		

	}
	System.out.println(str2);

	}

}
