package com.learning.step.java801;

import java.util.function.ToDoubleFunction;

public class ToDoubleExample {

	public static void main(String[] args) {
		ToDoubleFunction<Integer> i  = (x)-> Math.sin(x);
	    
	    System.out.println(i.applyAsDouble(Integer.MAX_VALUE));

	}

}
