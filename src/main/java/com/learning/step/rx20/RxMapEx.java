package com.learning.step.rx20;

import io.reactivex.Observable;

public class RxMapEx {

	public static void main(String[] args) {
		
		Observable<Integer> observable = Observable.fromArray(10, 20, 30 ,40);
		//observable.subscribe(System.out::println);
		
		Observable<Integer> mapped = observable.map( e -> e*2 );
		mapped.subscribe(System.out::println);
		

	}

}
