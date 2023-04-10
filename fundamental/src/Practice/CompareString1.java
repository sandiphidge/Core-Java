package Practice;

public class CompareString1 {
	//Using .equals to

	public static void main(String[] args) {
		String str = "Hruta";
		String str2 = new String("Hruta");
		if(str.equals(str2))//This refers to object i.e. Hruta and Hruta
		{
			System.out.println("Both Are Equal");
		
		}
		else
		{
			System.out.println("Not Equal");
		}
		

	}

}
