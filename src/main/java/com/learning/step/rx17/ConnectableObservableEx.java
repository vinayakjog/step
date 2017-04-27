package com.learning.step.rx17;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

//Until connect is called the observable will not release data
//to check this feature just comment the connect both first and second you will see no data
public class ConnectableObservableEx {

	public static void main(String[] args) {
		ConnectableObservable<Integer> observable = Observable.fromArray(1, 2, 4).publish();
		observable.subscribe(e -> System.out.println(e + " first place "));
		observable.connect();
		observable.subscribe(e ->  System.out.println(e + " second place "));
		observable.connect();

	}

}
