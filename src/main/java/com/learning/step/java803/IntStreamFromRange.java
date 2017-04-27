package com.learning.step.java803;

import java.util.stream.IntStream;

public class IntStreamFromRange {
	public static void main(String[] args) {
	    IntStream oneToFive  = IntStream.range(1, 6);
	    //IntStream oneToFive  = IntStream.rangeClosed(1, 5);
	    oneToFive.forEach(System.out::println);
	  }
}
