package com.learning.step.rx14;


import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.BehaviorSubject;

public class BehaviorSubjectEx {

	public static void main(String[] args) {
		ObservationExample<Integer> obsEx = new ObservationExample<Integer>();
		BehaviorSubjectExample behaviorSubjectExample = new BehaviorSubjectExample();
System.out.println(obsEx);
		BehaviorSubject<Integer> subject = behaviorSubjectExample.getBehaviorSubject();
		subject.onNext(10);
		subject.onNext(20);
		subject.onNext(30);
		subject.onNext(40);
		subject.onNext(50);
		subject.onNext(60);
		
		subject.subscribe(System.out::println);
	
	}

}


class BehaviorSubjectExample {
	BehaviorSubject<Integer> subject;
	
	public BehaviorSubject<Integer> getBehaviorSubject(){		
		subject = BehaviorSubject.create();
		
		return subject;
		
	} 
}

@SuppressWarnings({ "hiding" })
class ObservationExample<Integer> implements Observer<Object>{

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
