package Learning.OOP.Final;

 class A{
	 int a= 20;
	public final void show() {
		System.out.println("Hello from A");
	}
}

class B extends A{
//	public void show() {
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             B b = new B();
//             b.a = 200;
	}

}
//final with class  :class will not get inherited
//final with variable :variable value can't be modified
//final  with method : method can't be overriden in child class'