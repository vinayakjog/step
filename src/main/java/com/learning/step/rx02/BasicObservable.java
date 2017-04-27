package com.learning.step.rx02;

import io.reactivex.Observable;

public class BasicObservable {

	public static void main(String[] args) {
		Observable.create(subscriber -> {
			subscriber.onNext(10);
			subscriber.onNext(20);
			subscriber.onNext(30);
			subscriber.onNext(40);
		}).subscribe(System.out::println).dispose();
	}

}
