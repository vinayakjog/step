package com.learning.step.java805;

import java.util.stream.IntStream;

public class StreamOperationsReduce {

	public static void main(String[] args) {
		System.out.println(IntStream.range(1, 11).reduce((a, b) -> {return a+b;} ).getAsInt());
	}

}
