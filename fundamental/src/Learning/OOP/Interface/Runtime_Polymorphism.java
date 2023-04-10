package Learning.OOP.Interface;

interface Service{
	void service();
	
}


class Service1 implements Service{
	
	public void service() {
		System.out.println("Service1 implemented");
	}
}
class Service2 implements Service{
	public void service() {
		System.out.println("Service2 implemnented");
	}
}

public class Runtime_Polymorphism {

	public static void main(String[] args) {
	       Service service = new Service1();
	       Service service2 = new Service2();
	       service.service();
	       service2.service();

	}

}
