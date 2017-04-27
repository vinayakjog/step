package com.learning.step.java801;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		BiFunction<Integer, Integer ,Integer> bi = (x, y) -> {      
		      return (x + y);
		};
		
		Integer a = 10;
		Integer b = 20;
		
		
		System.out.println(bi.apply(a, b ));
		
		bi = (mu, zeta) -> {
			return mu -zeta;
		};
		
		System.out.println(bi.apply(a, b)  );


	}

	

}