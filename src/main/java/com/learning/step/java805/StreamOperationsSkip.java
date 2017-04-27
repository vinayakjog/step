package com.learning.step.java805;

import java.util.stream.IntStream;

public class StreamOperationsSkip {

	public static void main(String[] args) {
		IntStream.range(1, 11).skip(6).forEach(e -> System.out.println(e));
	}

}
