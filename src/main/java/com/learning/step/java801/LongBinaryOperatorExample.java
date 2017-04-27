package com.learning.step.java801;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorExample {

	public static void main(String[] args) {
		LongBinaryOperator i = (x,y) -> x/y;
	    System.out.println(i.applyAsLong(Long.MAX_VALUE,Long.MAX_VALUE));

	}

}
