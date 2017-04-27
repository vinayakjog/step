package com.learning.step.java801;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleExample {
 public static void main(String args[]){
	 LongToDoubleFunction i = (l) -> Math.sin(l);
	    
	    System.out.println(i.applyAsDouble(Long.MAX_VALUE));
 }
}
