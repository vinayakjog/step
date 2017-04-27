package com.learning.step.java801;

import java.util.function.LongFunction;

public class LongFunctionExample {
	public static void main(String[] args) {
	    LongFunction<String> i = (l) -> Long.toString(l);
	    
	    System.out.println(i.apply(Long.MAX_VALUE));
	  }
}
