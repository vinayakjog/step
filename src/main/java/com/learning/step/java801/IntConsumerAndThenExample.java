package com.learning.step.java801;

import java.util.function.IntConsumer;

public class IntConsumerAndThenExample {

	public static void main(String[] args) {
		IntConsumer ic = (x)->System.out.println(x);
	    
	    ic.andThen(ic).accept(3);

	}

}
