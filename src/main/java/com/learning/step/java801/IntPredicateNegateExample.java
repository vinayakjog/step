package com.learning.step.java801;

import java.util.function.IntPredicate;

public class IntPredicateNegateExample {

	public static void main(String[] args) {
		IntPredicate i = (x) -> x < 0;

		System.out.println(i.negate().test(123));

	}

}
