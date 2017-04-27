package com.learning.step.java801;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionExample {

	public static void main(String[] args) {
	    LongToIntFunction i = (l) -> (int)l;
	    
	    System.out.println(i.applyAsInt(Long.MAX_VALUE));
	  }

}
