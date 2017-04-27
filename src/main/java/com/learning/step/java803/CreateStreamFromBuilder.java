package com.learning.step.java803;

import java.util.stream.Stream;

public class CreateStreamFromBuilder {
	public static void main(String[] args) {
	    Stream<String> stream  = Stream.<String>builder()
	        .add("XML")
	        .add("Java")
	        .add("CSS")
	        .add("SQL")
	        .build();
	    stream.forEach(System.out::println);
	  }
}
