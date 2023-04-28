package com.lambdaExpression;

import java.util.function.Supplier;

public class SupplierIntro {

	public static void main(String[] args) {
		Supplier<Double> supplier = ()->Math.random();
		Double result = supplier.get();
		System.out.println(result);
		
		
//		Supplier<Double> supplier = ()->(int)(Math.random()*100);
//		Integer result = supplier.get();
//		System.out.println(result);
		
	}

}
