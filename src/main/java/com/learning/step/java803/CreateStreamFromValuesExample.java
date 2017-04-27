package com.learning.step.java803;

import java.util.stream.Stream;

public class CreateStreamFromValuesExample {

	
		 public static void main(String[] args) {
			    Stream<String> stream  = Stream.of("XML", "Java",  "CSS", "SQL");
			    stream.forEach(System.out::println);
			  }


}
