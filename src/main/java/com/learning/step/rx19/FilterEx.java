package com.learning.step.rx19;

import io.reactivex.Observable;

public class FilterEx {

	public static void main(String... args) {

		Observable<String> observable = Observable.fromArray("#12", "12", "#13", "13");
		Observable<String> filtered = observable.filter(w -> w.startsWith("#"));
		
		observable.subscribe(e -> System.out.println("Original - " + e));
		filtered.subscribe(e -> System.out.println("Duplicate - " + e));

	}

}
