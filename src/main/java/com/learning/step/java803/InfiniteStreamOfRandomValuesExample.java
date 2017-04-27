package com.learning.step.java803;

import java.util.Random;
import java.util.stream.IntStream;

public class InfiniteStreamOfRandomValuesExample {

	public static void main(String[] args) {
		  IntStream.generate(new Random()::nextInt)
		    .limit(5)
		    .forEach(System.out::println);

	}

}
