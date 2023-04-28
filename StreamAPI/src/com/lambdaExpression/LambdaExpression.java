package com.lambdaExpression;


@FunctionalInterface
interface MyFirstInterface{
	void show();
	
}

//class Demo implements MyFirstInterface{
//	@Override
//	public void show() {
//		System.out.println("This is show() method");
//	}
//}

public class LambdaExpression {

	public static void main(String[] args) {
		MyFirstInterface myInterface = ()->System.out.println("This is show() method");
		myInterface.show();
	}

}
