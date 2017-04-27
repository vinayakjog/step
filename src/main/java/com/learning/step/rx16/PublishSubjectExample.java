package com.learning.step.rx16;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

public class PublishSubjectExample {

	public static void main(String[] args) {
		PublishSubjectObserver<Integer> pso = new PublishSubjectObserver<Integer>();
		PublishSubject<Integer> ps = PublishSubject.create();
		ps.subscribe(pso);
		ps.onNext(10);
		ps.onNext(20);
		ps.onComplete();
	}
}

@SuppressWarnings("hiding")
class PublishSubjectObserver<Integer> implements Observer<Integer>{

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