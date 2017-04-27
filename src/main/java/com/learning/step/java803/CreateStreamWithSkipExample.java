package com.learning.step.java803;

import java.util.stream.Stream;

public class CreateStreamWithSkipExample {
	public static void main(String[] args) {
		Stream.iterate(2L, n -> n + 1).filter(CreateStreamWithSkipExample::isOdd).skip(100).limit(5)
				.forEach(System.out::println);
	}

	public static boolean isOdd(long number) {
		if (number % 2 == 0) {
			return false;
		}
		return true;
	}
}
