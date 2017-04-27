package com.learning.step.java805;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamOperationsFilterExample {

	public static void main(String[] args) {
		Predicate<String> predicate = (value) -> {
			return (!value.equals("one"));
		};
		
		
		List <String> list = Arrays.asList("one", "one", "one", "two", "three");
		list.stream().distinct().forEach(System.out::print);
		System.out.println("");
		System.out.println("-----------------------------------");
		list.stream().filter(predicate).forEach(System.out::print);

	}

}
