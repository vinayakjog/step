package com.learning.step.java803;

import java.util.stream.Stream;

public class CreateMathRandomExample {

	public static void main(String[] args) {
	    Stream.generate(Math::random)
	    .limit(5)
	    .forEach(System.out::println);

	  }
}
