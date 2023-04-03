package LearningMethodOverriding;

//class Child{
//	
//	public String toString(){
//		return "toString() override in child class";
//	}
//}
class Vehicle{
	public void speed() {
		System.out.println("Average speed :120km/hr");
	}
}
class Fourwheeler extends Vehicle{
	@Override
	public void speed() {
		System.out.println("Average speed : 150km/hr");
	}
}



public class Overriding {

	public static void main(String[] args) {
//		Child ch =new Child();
//		System.out.println(ch);
      Fourwheeler fourwheeler =new Fourwheeler();
      fourwheeler.speed();
	}

}
