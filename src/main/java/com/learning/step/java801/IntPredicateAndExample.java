package com.learning.step.java801;

import java.util.function.IntPredicate;

public class IntPredicateAndExample {

	public static void main(String[] args) {
		IntPredicate i = (x)-> x < 0;
	    
	    IntPredicate j = (x)-> x == 0;
	    
	    System.out.println(i.and(j).test(123));

	}

}
