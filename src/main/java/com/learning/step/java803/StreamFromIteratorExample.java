package com.learning.step.java803;

import java.util.stream.Stream;

public class StreamFromIteratorExample {

	public static void main(String[] args) {
		Stream<Long> tenNaturalNumbers = Stream.iterate(1L, n -> n + 1).limit(10);

		tenNaturalNumbers.forEach(System.out::println);

	}

}
