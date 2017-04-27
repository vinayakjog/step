package com.learning.step.java805;

import java.util.Arrays;
import java.util.List;

public class StreamOperationsDistinctExample {

	public static void main(String[] args) {
		List <String> list = Arrays.asList("one", "one", "one", "two", "three");
		list.stream().distinct().forEach(System.out::println);

	}

}
