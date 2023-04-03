package Constructor;

public class Chaining {


	class Car{
		Car(){
		
		System.out.println("no args constructor");
		
		}
	Car(int a){
		System.out.println("parametrized constructor");
	}
	
	}
	
	public static void main(String[] args){
		 Chaining car = new Chaining();
	}
	
}