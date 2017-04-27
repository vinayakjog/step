package com.learning.step.java805;

import java.util.stream.IntStream;

public class StreamOperationsPeek {

	public static void main(String[] args) {
		IntStream.range(1, 10).peek( a-> System.out.println(a)).forEach(System.out::println);

	}

}
