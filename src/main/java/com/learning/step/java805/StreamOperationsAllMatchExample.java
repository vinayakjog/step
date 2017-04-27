package com.learning.step.java805;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamOperationsAllMatchExample {
	public static void main(String ... strings){
	IntPredicate isEven = (a ) -> a % 2 == 0;
	
	System.out.println(IntStream.range(1, 12).allMatch(isEven));
	}
 }
