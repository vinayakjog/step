package com.learning.step.rx26;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class WithLatestFromEx {

	public static void main(String... args) throws Exception{
		Observable<String> fast = Observable.interval(10, TimeUnit.MILLISECONDS).map(x -> "F" + x);
		Observable<String> slow = Observable.interval(10, TimeUnit.MILLISECONDS).map(x -> "S" + x);
		
		slow
			.withLatestFrom(fast, (s, f ) -> s + ":" + f).forEach(System.out::println);
		
		Thread.sleep(500);
	}

}
