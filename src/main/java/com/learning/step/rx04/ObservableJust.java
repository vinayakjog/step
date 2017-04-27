package com.learning.step.rx04;

import io.reactivex.Observable;

public class ObservableJust {

	public static void main(String[] args) {
		
		String str = "Hello world !";
		
		Observable<String> observable = Observable.just(str);
		observable.subscribe(System.out::println).dispose();
		
		Observable<String> months = Observable.just("Jan", "Feb", "Mar");
		months.subscribe(System.out::println).dispose();
		
	}

}
