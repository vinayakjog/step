package com.learning.step.java805;

import java.util.stream.IntStream;

public class StreamOperationsForEachExample {

	public static void main(String[] args) {
		IntStream.range(1, 10).forEach(System.out::println);

	}

}
