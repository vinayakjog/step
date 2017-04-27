package com.learning.step.rx26;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class CombineLatestEx {

	public static void main(String... args) throws Exception{
		Observable.combineLatest(
				Observable.interval(17, TimeUnit.MILLISECONDS).map(x -> "S" + x),
				Observable.interval(11, TimeUnit.MILLISECONDS).map(x -> "F" + x),
				(s, f) -> f + " : " + s
		).forEach(System.out::println);

		Thread.sleep(500);
	}

}
