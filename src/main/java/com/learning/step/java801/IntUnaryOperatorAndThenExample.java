package com.learning.step.java801;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorAndThenExample {

	public static void main(String[] args) {
		IntUnaryOperator i = (x) -> x * x;
		System.out.println(i.andThen(i).applyAsInt(2));
	}

}
