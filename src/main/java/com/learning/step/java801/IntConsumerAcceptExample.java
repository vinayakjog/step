package com.learning.step.java801;

import java.util.function.IntConsumer;

public class IntConsumerAcceptExample {

	public static void main(String[] args) {
		  IntConsumer ic = (x)->System.out.println(x);
		    
		    ic.accept(3);

	}

}
