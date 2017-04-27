package com.learning.step.rx05;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ObservableFrom {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		@SuppressWarnings("unchecked")
		Observable<List<String>> observable = Observable.fromArray(list);
		
		observable.subscribe(System.out::println).dispose();
		
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		@SuppressWarnings("unchecked")
		Observable<List<String>> observable1 = Observable.fromArray(list1);
		
		observable1.subscribe(System.out::println).dispose();
		
		
		
	}

}
