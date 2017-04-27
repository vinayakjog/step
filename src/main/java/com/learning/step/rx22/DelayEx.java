package com.learning.step.rx22;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class DelayEx {

	public static void main(String[] args) {
	/*	Observable.just("hi ", "user ").delay(2, TimeUnit.SECONDS)
		.subscribe(System.out::println);
		*/
		
		
		
		Observable.just("hi ", "user ").delay(3, TimeUnit.SECONDS).subscribe(System.out::println);
		

	}

}
