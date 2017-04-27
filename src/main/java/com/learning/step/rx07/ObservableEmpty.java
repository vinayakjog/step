package com.learning.step.rx07;

import io.reactivex.Observable;

public class ObservableEmpty {

	public static void main(String[] args) {
		
		Observable<?> observableEmpty = Observable.empty();
		observableEmpty.subscribe(System.out::println);

	}

}
