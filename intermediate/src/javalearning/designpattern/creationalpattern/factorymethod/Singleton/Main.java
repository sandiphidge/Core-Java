package javalearning.designpattern.creationalpattern.factorymethod.Singleton;

public class Main {

	public static void main(String[] args) {
		
     DB db = DB.getObject();
     db.getConnection();
     
	}

}
