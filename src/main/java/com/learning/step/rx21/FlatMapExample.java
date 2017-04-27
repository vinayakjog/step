package com.learning.step.rx21;

import io.reactivex.Observable;

public class FlatMapExample {

	public static void main(String ...args) {
		
		Observable<String> observable = Observable.fromArray("jr.vinayak", "satish", "sr.vinayak", "dattatreya", "prabhakar");
		Observable<String> flatMapEx = observable.flatMap(s -> {
			String name1 = s + " 1 ";
			String name2 = s + " 1 ";
			String name3 = s + " 1 ";
			String name4 = s + " 1 ";
			String name5 = s + " 1 ";
			
			return Observable.just(name1, name2, name3, name4, name5);
			
		});
		
		flatMapEx.subscribe(System.out::println);
	}

}
