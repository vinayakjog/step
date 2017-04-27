package com.learning.step.java801;

import java.util.function.ToIntFunction;

public class ToIntExample {

	public static void main(String[] args) {
		ToIntFunction<String> i  = (x)-> Integer.parseInt(x);
	    
	    System.out.println(i.applyAsInt("2"));

	}

}
