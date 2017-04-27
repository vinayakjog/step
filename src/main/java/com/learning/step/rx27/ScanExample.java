package com.learning.step.rx27;

import io.reactivex.Observable;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ScanExample {

	public static void main(String[] args) {
		Observable<BigInteger> factorials = Observable
										.range(2, 100)
										.scan(   BigInteger.ONE, (big, cur) -> big.multiply(BigInteger.valueOf(cur))    );
		
		factorials.subscribe(System.out::println);
	}

}
