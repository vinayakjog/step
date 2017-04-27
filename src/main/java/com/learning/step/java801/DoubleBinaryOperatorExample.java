package com.learning.step.java801;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorExample {

	public static void main(String[] args) {
		DoubleBinaryOperator d = (x,y) -> x*y;
	    System.out.println(d.applyAsDouble(0.23, 0.45));

	}

}
