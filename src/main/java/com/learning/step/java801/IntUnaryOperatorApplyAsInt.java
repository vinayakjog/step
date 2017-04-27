package com.learning.step.java801;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorApplyAsInt {

	public static void main(String[] args) {
		IntUnaryOperator i = (x) -> x * x;
		System.out.println(i.applyAsInt(2));

	}

}
