package com.learning.step.java805;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamOperationsSort {

	public static void main(String[] args) {
		IntStream.generate(new Random()::nextInt)
	    .limit(5).sorted()
	    .forEach(System.out::println);

	}

}
