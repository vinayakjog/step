package com.learning.step.java801;

import java.util.function.Function;

public class FunctionComposeExample {

	public static void main(String[] args) {
		Function<Integer,String> converter = (i)-> Integer.toString(i);
	    
	    Function<String, Integer> reverse = (s)-> Integer.parseInt(s);
	   
	    System.out.println(converter.apply(3).length());
	    System.out.println(converter.compose(reverse).apply("30").length());

	}

}
