package com.learning.step.rx15;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.ReplaySubject;

public class ReplaySubjectEx {

	public static void main(String[] args) {
		ReplaySubject<Integer> subject = ReplaySubject.create();
		subject.onNext(10);
		subject.onNext(20);
		
		ReplyObserver<Integer> ro = new ReplyObserver<Integer>();
		
		
		subject.subscribe(ro);
		//subject.subscribe(System.out::println);

	}

}

@SuppressWarnings("hiding")
class ReplyObserver<Integer> implements Observer<Integer>{

	@Override
	public void onSubscribe(Disposable d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNext(Object value) {
		System.out.println("value - " + value );
		
	}

	@Override
	public void onError(Throwable e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		
	}
	
}