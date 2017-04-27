package com.learning.step.java803;

import java.util.stream.IntStream;

public class InfiniteStreamOfRepeatingValuesExample {

	public static void main(String[] args) {
		IntStream.generate(() ->  0)
	    .limit(5)
	    .forEach(System.out::println);

	}

}
