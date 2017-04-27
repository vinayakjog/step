package com.learning.step.java801;

import java.util.function.IntToDoubleFunction;

public class IntDoubleFunctionExample {

	public static void main(String[] args) {
		IntToDoubleFunction i = (x) -> {
			return Math.sin(x);
		};
		System.out.println(i.applyAsDouble(2));
	}

}
