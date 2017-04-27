package com.learning.step.rx23;

import java.time.DayOfWeek;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class ConcatMapEx {

	public static void main(String[] args) {
		Observable.just(DayOfWeek.SUNDAY, DayOfWeek.MONDAY)
					.concatMap(s -> loadReordsFor((DayOfWeek)s));		

	}
	
	static Observable<String> loadReordsFor(DayOfWeek dow){
		System.out.println(dow);
		switch(dow){
		case SUNDAY:
			return Observable.interval(90, TimeUnit.MILLISECONDS)
					.take(5)
					.map(i -> "Sun" + i);
		
		case MONDAY:
			return Observable.interval(90, TimeUnit.MILLISECONDS)
					.take(5)
					.map(i -> "Mon" + i);
		default:
			break;	
		}
		return null;
	}

}
