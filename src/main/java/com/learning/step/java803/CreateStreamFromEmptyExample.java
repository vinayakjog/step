package com.learning.step.java803;

import java.util.stream.Stream;

public class CreateStreamFromEmptyExample {

	
		public static void main(String[] args) {
		    Stream<String> stream  = Stream.empty();
		    stream.forEach(System.out::println);
		  }

	

}
