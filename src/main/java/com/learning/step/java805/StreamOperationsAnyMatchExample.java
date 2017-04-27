package com.learning.step.java805;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamOperationsAnyMatchExample {

	public static void main(String[] args) {
		IntPredicate even = (e ) -> e%2 ==0;
		
		System.out.println(IntStream.range(1, 10).anyMatch(even));

	}

}
