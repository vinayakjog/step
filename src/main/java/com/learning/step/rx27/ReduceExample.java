package com.learning.step.rx27;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		
		Observable.range(1, 10).subscribe(System.out::println);
		
		Observable.range(1, 10).reduce(new ArrayList<Integer>(),
				(list, item) -> {
					list.add(item);
					return list;
		}).subscribe(e -> System.out.println(e));
		
		
		

	}

}
