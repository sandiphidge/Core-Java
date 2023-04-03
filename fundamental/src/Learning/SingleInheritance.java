package Learning;

class Vehicle{
	int numberOfWheels = 2;
	Vehicle(){
		System.out.println("Vehicle class is called");
	}
}


class FourWheeler extends Vehicle{
	int numberOfWheels = 4;
	FourWheeler(){
		super();
		System.out.println("FourWheeler class is called");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		FourWheeler fw = new FourWheeler();
		System.out.println(fw.numberOfWheels);
		
	}

}
//variables : depends on type of referance
//methods: depends on type of object

