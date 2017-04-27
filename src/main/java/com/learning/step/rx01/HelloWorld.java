package com.learning.step.rx01;

import io.reactivex.Observable;

public class HelloWorld {
	public static void main(String ...args){
		
		Observable<String> observable = Observable.create( s -> {
			s.onNext("Hello World !");
		});
		observable.subscribe(System.out::println).dispose();
		
		
	}
}
