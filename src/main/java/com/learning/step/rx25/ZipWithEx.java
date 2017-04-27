package com.learning.step.rx25;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;


public class ZipWithEx {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList( "the", "quick", "brown", "fox", "jumped", "over", "the", "lazy","dog");
		Observable.fromIterable(words).zipWith(Observable.range(1, 100), (string, count) -> 
		String.format("%2d. %s", count, string)).subscribe(System.out::println);
	}

}

