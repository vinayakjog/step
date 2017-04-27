package com.learning.step.java801;

import java.util.function.IntUnaryOperator;



public class IntUnaryOperatorIdentity {
	public static void main(String[] args) {
	    IntUnaryOperator i = IntUnaryOperator.identity();
	    System.out.println(i.compose(i).applyAsInt(2));
	  }
}
