package com.learning.step.java803;

import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("java2s.com");
		stream.forEach(System.out::println);

	}

}
