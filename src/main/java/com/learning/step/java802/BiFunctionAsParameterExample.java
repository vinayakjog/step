package com.learning.step.java802;

import java.util.function.BiFunction;

public class BiFunctionAsParameterExample {

	public static void main(String[] args) {		
		BiFunction<Integer, Integer, Integer> bi = ( a,  b) -> { return a + b ;};
		display(10, 20, bi);
	}
	
	
	public static void display(Integer a, Integer b, BiFunction<Integer, Integer, Integer> bi){
		System.out.println(bi.apply(a,b));
	}

}
