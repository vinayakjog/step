package com.learning.step.java801;

import java.util.function.LongPredicate;

public class LongPredicateOrExample {
	public static void main(String[] args) {
	    LongPredicate i = (l) -> l > 0;
	    
	    System.out.println(i.negate().test(Long.MAX_VALUE));
	  }
}
