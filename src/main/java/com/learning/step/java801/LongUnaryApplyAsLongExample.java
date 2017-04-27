package com.learning.step.java801;

import java.util.function.LongUnaryOperator;

public class LongUnaryApplyAsLongExample {

	public static void main(String[] args) {
		LongUnaryOperator i = (l) -> -l;
	    
	    System.out.println(i.applyAsLong(Long.MAX_VALUE));

	}

}
