package com.learning.step.rx13;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.AsyncSubject;

public class AsynSubjectLearn {
	public static void main(String ... args){
	
		AsyncS subject = new AsyncS();
		ObserverImpl<Integer> observer = new ObserverImpl<Integer>();
		subject.getAsync().subscribe(observer);
	}	
}


class AsyncS{
	public Observable<Integer> getAsync(){
		AsyncSubject<Integer> subject = AsyncSubject.create();
		
		subject.onNext(1);
		subject.onNext(2);
		subject.onNext(3);
		subject.onNext(4);
		subject.onComplete();
		
		return subject;
		
	}
}


@SuppressWarnings("hiding")
class ObserverImpl<Integer> implements Observer<Integer>{

	@Override
	public void onSubscribe(Disposable d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNext(Object value) {
		System.out.println(value);
		
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