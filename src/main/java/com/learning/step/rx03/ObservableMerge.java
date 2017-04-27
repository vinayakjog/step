package com.learning.step.rx03;

import io.reactivex.Observable;

public class ObservableMerge {

	public static void main(String[] args) {
		Observable<String> observable1 = Observable.create(s -> {
			s.onNext("a");
			s.onNext("b");
			s.onNext("c");
			s.onNext("d");
		});
		
		Observable<String> observable2 = Observable.create(s -> {
			s.onNext("1");
			s.onNext("2");
			s.onNext("3");
			s.onNext("4");
		});
		
		Observable<String> observable3 = Observable.merge(observable1, observable2);
		
		observable3.subscribe(System.out::println).dispose();

	}

}
