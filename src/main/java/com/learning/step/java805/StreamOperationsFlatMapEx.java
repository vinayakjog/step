package com.learning.step.java805;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperationsFlatMapEx {

	public static void main(String[] args) {
		String[][] data = new String[][] { { "a", "b" }, { "c", "d" },
				{ "e", "f" } };
		Stream<String[]> temp = Arrays.stream(data);
		
		Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
		
		stringStream.forEach(System.out::println);


	}

}
