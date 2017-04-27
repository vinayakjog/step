package com.learning.step.java801;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorCompose {

	public static void main(String[] args) {
	    IntUnaryOperator i = (x) -> x*x;
	    System.out.println(i.compose(i).applyAsInt(2));
	  }

}
