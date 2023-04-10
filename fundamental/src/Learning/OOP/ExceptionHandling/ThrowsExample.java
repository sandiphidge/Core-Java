package Learning.OOP.ExceptionHandling;

import java.io.IOException;

public class ThrowsExample {
    public static void m1() throws IOException{
    	if(true) {
    		throw new IOException();
    	}
    	
    }
	public static void main(String[] args)throws IOException {
	System.out.println(Thread.currentThread().getName());
//     try{
    	 m1();
 //    }catch (IOException io) {
//	}

}
}
