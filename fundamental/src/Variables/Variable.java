package Variables;

public class Variable {

	  int a = 10;//instance variable
	    String name = "Ankit";
	    static int b = 30;
	    
	    int c;
	    static int d;
	    
	    
	    //function definition:
	     void show(){
	    	int localVariable = 100;
	    	System.out.println("Local Variable = "+localVariable);
	        
//	        int local2;
//	        System.out.println(local2);
	     
	     }
	    
		public static void main(String[] args) {
			//creating an object
			//classname objName = new classname();
			
			Variable instanceObj = new Variable();
	       
			//Accessing instance variable
			//objName . instanceVariableName
			
			System.out.println(instanceObj.a);
			System.out.println(instanceObj.name);
			System.out.println("The value of a ="+instanceObj.a);
		    //System.out.println(instanceObj.localVariable);
		    
			//calling a function:
			//objName.functionName
			instanceObj.show();
			
			//Accessing static data:Using classname
			System.out.println("The static data = "+Variable.b);
		
			//Accessing static data:Using object
			System.out.println(instanceObj.b);
			System.out.println(b);
			
			System.out.println(instanceObj.c);
			System.out.println(d);
		}
	
	}


