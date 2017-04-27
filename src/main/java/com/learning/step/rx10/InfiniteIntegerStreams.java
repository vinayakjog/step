package com.learning.step.rx10;

import io.reactivex.Observable;

public class InfiniteIntegerStreams {
	
	public static void main(String ...args){
	Observable<Integer> observable = Observable.create(s -> {
		int i =0;
		while(true){
			s.onNext(i);
			i+=1;
		}
	});
	
	observable.subscribe(System.out::println).dispose();
	}
}
