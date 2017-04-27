package com.learning.step.java801;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionExample {

	public static void main(String[] args) {
		 ToIntBiFunction<String,String> i  = (x,y)-> Integer.parseInt(x) +Integer.parseInt(x);
		    
		    System.out.println(i.applyAsInt("2","3"));

	}

}
