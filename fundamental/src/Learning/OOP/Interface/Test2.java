package Learning.OOP.Interface;

interface Vehicle{
	void speed();
	
	 default void companyName() {   //default void = concrete method
		System.out.println("Tata motors");
	}
	 
	 static void numberOfWheeles() {
		 System.out.println("4 wheeles");
	 }
}
class FourWheeler  implements Vehicle{
	public void speed () {
		System.out.println("150km/hr");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FourWheeler fourwheeler = new FourWheeler();
            fourwheeler.companyName();
            fourwheeler.speed();
            Vehicle.numberOfWheeles();
	}

}
