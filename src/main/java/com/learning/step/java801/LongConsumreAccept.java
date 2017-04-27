package com.learning.step.java801;

import java.util.function.LongConsumer;

public class LongConsumreAccept {

	public static void main(String[] args) {
		
		    LongConsumer i = (l) -> System.out.println(l);;
		    i.accept(Long.MAX_VALUE);
		  

	}

}
