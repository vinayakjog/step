package com.learning.step.rx12;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.MaybeSubject;



public class MayBeSubjectEx {

	public static void main(String[] args) {
		MaybeSubject<Integer> maybesubject = MaybeSubject.create();
		
		maybesubject.subscribe();

	}

}


class ObserverEx implements Observer<Object>{

	@Override
	public void onSubscribe(Disposable d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNext(Object value) {
		System.out.println("value " + value);
		
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