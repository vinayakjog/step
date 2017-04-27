package com.learning.step.extra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamDistinctCollectExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("vinayak", "vinayak", "ramesh", "suresh");
		list.stream().distinct().forEach(System.out::println);
		
		List<String> newList = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(newList);
		
		
	}
}
