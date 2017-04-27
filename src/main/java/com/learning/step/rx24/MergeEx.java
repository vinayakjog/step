package com.learning.step.rx24;

import io.reactivex.Observable;

public class MergeEx {

	public static void main(String... args) {
		Observable<Integer> observable1 = Observable.range(1,10);
		//observable1.subscribe(System.out::println);
		
		Observable<Integer> observable2 = Observable.range(11, 10); // from 11, 10 numbers
		//observable2.subscribe(System.out::println);
		
		Observable<Integer> merger = Observable.merge(observable1, observable2);
		merger.subscribe(System.out::println);
 
	}

}
