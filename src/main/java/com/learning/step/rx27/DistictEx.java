package com.learning.step.rx27;

import io.reactivex.Observable;

public class DistictEx {

	public static void main(String[] args) {
		Observable.fromArray(1, 1, 1,2,3,4,2,2,2,2)
				.distinct().subscribe(System.out::println);
		
		

	}

}
