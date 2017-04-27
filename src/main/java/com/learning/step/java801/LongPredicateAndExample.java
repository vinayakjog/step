package com.learning.step.java801;

import java.util.function.LongPredicate;

public class LongPredicateAndExample {

	public static void main(String[] args) {
	    LongPredicate i = (l) -> l > 0;
	    LongPredicate j = (l) -> l == 0;
	    
	    System.out.println(i.and(j).test(Long.MAX_VALUE));
	  }

}
