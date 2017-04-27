package com.learning.step.java805;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamOperationsNoneMatchExample {

	public static void main(String[] args) {
		IntPredicate negative = (a) -> a<0;
		
		System.out.println(IntStream.range(1, 10).noneMatch(negative));

	}

}
