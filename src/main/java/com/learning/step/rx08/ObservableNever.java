package com.learning.step.rx08;

import io.reactivex.Observable;

public class ObservableNever {

	public static void main(String[] args) {
		Observable<String> observable = Observable.never();
		observable.subscribe(System.out::println).dispose();

	}

}
