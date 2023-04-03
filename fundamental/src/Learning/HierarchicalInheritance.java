package Learning;

class ParentA{
	ParentA(){
		System.out.println("Called From parentA");
	}
	
}

class ChildB extends ParentA{
	int data=20;
	ChildB(){
	System.out.println("Called from childB");
	}
}
class ChildC extends ParentA{
	int data=30;
	ChildC(){
		System.out.println("Called from ChildC");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		ChildC c =new ChildC();
		System.out.println(c.data);

	}

}
