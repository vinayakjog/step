package com.learning.step.java805;

import java.util.stream.IntStream;

public class StreamOperationsLimit {

	public static void main(String[] args) {
		IntStream.iterate(0, i -> i+1).limit(10).forEach(System.out::println);
		
		
		
		
	}
	
	
	

}
