package Practice;

public class CompareString {
	//Using ==

	public static void main(String[] args) {
		String str = "Hruta";
		String str2 = new String("Hruta");
		
		if(str==str2)// == refers to referal of object i.e.str and str2 not equal
		{
			System.out.println("Both Are Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
  
	}

}
