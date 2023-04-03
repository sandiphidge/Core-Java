package Learning.OOP.Polymorphism;

class Shape2{
	public void draw(){
		System.out.println("Inside the Shape class");
	}
}

class Circle extends Shape2{
	public void draw(){
	System.out.println("Inside the Circle class");
	}


class Rectangle extends Shape2{
	public void draw(){
	System.out.println("Inside the Rectangle class");
	}

}
public class Run_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Circle circle = new Circle();
//      circle.draw();
      //If a parent type referance points to child type object,
	 	//this is called dynamic dispatch
		
         Shape2 shape = new Circle();
         shape.draw();
	}

}
}
