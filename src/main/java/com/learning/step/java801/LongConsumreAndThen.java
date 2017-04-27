package com.learning.step.java801;

import java.util.function.LongConsumer;

public class LongConsumreAndThen {

	public static void main(String[] args) {
	    LongConsumer i = (l) -> System.out.println(l);;
	    i.andThen(i).accept(Long.MAX_VALUE);
	  }

}
