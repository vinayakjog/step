package com.learning.step.rx06;

import io.reactivex.Observable;

public class ObservableRange {

	public static void main(String[] args) {
		Observable <Integer>range = Observable.range(0, 10);
		range.subscribe(System.out::println);

	}

}
