package com.learning.step.java801;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BinaryOperator<Integer> adder = (n1, n2) -> n1 + n2;

	      System.out.println(adder.apply(3, 4));

	}

}
