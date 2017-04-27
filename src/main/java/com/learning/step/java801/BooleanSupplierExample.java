package com.learning.step.java801;

import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {

	public static void main(String[] args) {
		 BooleanSupplier bs = () -> true;
		    System.out.println(bs.getAsBoolean());

		    int x = 0, y= 1;
		    bs = () -> x > y;
		    System.out.println(bs.getAsBoolean());

	}

}
