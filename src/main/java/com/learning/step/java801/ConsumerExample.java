package com.learning.step.java801;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		 Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
		 c.accept("Java2s.com");
		 c.accept("vianyhak");
		 

	}

}
	