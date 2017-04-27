package com.learning.step.java804;

import java.util.regex.Pattern;

public class CreateStreamFromRegExExample {
	  public static void main(String[] args) {
		    String str = "XML,CSS,HTML"; 
		    Pattern.compile(",")
		    .splitAsStream(str)
		    .forEach(System.out::println);

		  }
}
