package com.learning.step.rx12;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class SubjectEx {

	public static void main(String[] args) {
		
		ObserverEx1 <Integer>obs1 = new ObserverEx1<>();
		Subject<Integer> subject = PublishSubject.create();
		subject.onNext(10);
		
		

		subject.subscribe(obs1);
		subject.onNext(20);
		subject.onNext(40);
		subject.onComplete();
	}

}


@SuppressWarnings("hiding")
class ObserverEx1<Integer> implements Observer<Integer>{

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onError(Throwable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNext(Object arg0) {
		System.out.println("arg0  = " + arg0);
		
	}

	@Override
	public void onSubscribe(Disposable arg0) {
		// TODO Auto-generated method stub
		
	}
	
}