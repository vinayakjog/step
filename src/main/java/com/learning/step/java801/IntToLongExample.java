package com.learning.step.java801;

import java.util.function.IntToLongFunction;

public class IntToLongExample {

	public static void main(String[] args) {
		IntToLongFunction i = (x) -> Long.MAX_VALUE-x;
	    System.out.println(i.applyAsLong(2));

	}

}
