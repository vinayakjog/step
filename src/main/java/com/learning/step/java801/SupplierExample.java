package com.learning.step.java801;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> i  = ()-> "java2s.com";
	    
	    System.out.println(i.get());

	}

}
