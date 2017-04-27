package com.learning.step.java801;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnirayOperator {

	public static void main(String[] args) {
		 DoubleUnaryOperator dl = (x) -> {return x*x;};
		    System.out.println(dl.applyAsDouble(3.14));

	}

}
