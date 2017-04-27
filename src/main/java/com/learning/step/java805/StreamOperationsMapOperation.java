package com.learning.step.java805;

import java.util.stream.IntStream;

public class StreamOperationsMapOperation {

	public static void main(String[] args) {
		IntStream.range(1, 10).map( e -> e * 2).forEach(System.out::println);

	}

}
