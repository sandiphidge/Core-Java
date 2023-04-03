package Learning.OOP.Interface;
//Interface and its Variables
interface Department{
	//public & abstract
	//public abstract void m1()
	void m1();
	int a =20;
}

//class ABC implements Department{
//	public void m1() {
//		
//	}

interface Account extends Department{
	void m2();
	
}

class ABC implements Department{
	public void m1() {
		
	}
	
}




public class Test {

	public static void main(String[] args) {
		System.out.println(Department.a);//public ,static
       //final      Department.a=150;  //value cant change
	}

}
