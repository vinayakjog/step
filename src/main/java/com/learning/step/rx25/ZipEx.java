package com.learning.step.rx25;

import io.reactivex.Observable;

public class ZipEx {
	public static void main(String ...args) throws Exception{
	/*	Observable<Long> red = Observable.interval(10, TimeUnit.MILLISECONDS);
		Observable<Long> green = Observable.interval(10, TimeUnit.MILLISECONDS);*/
		
		/*Observable.zip(
				red.timestamp(), green.timestamp(), (r,g) -> (Long)r.time() - (Long)g.time()).forEach(e -> System.out.println("e"+ e));
		
		Thread.sleep(1000);*/
		
		/*Observable.zip(
				red.timestamp(), green.timestamp(), (r,g) -> (Long)r.time() - (Long)g.time()).forEach(e -> System.out.println("e"+ e));
		
		Thread.sleep(500);*/
		
		
		Observable<Integer> one = Observable.range(1, 10);
		Observable<Integer> two = Observable.range(11, 10);
		
		Observable.zip(one, two, (first , second ) -> second - first).forEach(System.out::println);
		
		
	}
}


