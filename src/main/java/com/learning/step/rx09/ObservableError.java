package com.learning.step.rx09;

import io.reactivex.Observable;

public class ObservableError {

	public static void main(String[] args) {
		Observable<String> observable = Observable.error(new Throwable("some exception"));
		observable.subscribe(System.out::println);
	}

}
