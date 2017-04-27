package com.learning.step.java805;

import java.util.stream.IntStream;

public class StreamOperationsFindFirst {

	public static void main(String[] args) {
		System.out.println(IntStream.range(1, 10).findFirst().getAsInt());

	}

}
