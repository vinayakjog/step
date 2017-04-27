package com.learning.step.rx27;

import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

public class GroupByExample {

	public static void main(String[] args) {
		Observable<GroupedObservable<Object, Integer>> observable = Observable.fromArray(1,2,2,3,4,2,2,21,3,4,3,5,6,4,3)
				.groupBy(i -> {  return i % 2 == 0; } );
		
		observable.subscribe(o -> o.subscribe(System.out::println));
	}

}
