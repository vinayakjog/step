package com.learning.step.rx27;

import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class CollectEx {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Basic observable
		Observable<Integer> stream =  Observable.range(1, 10);
		
		Single<Object> sum = stream.collect(ArrayList<Object>::new, (list, item ) -> ((ArrayList<Object>) list).add(item));
		
		System.out.println(sum.blockingGet());
		
		
		
		
	}
}
