package com.learning.step.java804;

public class StreamFromStringExample {
	public static void main(String[] args) {
	    String str = "5 123,123,qwe,1,123, 25";
	    str.chars()
	    .filter(n ->  !Character.isDigit((char)n) &&   !Character.isWhitespace((char)n))
	    .forEach(n ->  System.out.println((char)n));

	  }
}
