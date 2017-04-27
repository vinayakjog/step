package com.learning.step.rx26;


public class AmbEx {

	public static void main(String... args) {
		/*Observable<List<Integer>> obs1 = Observable.create(s -> {
			Thread.sleep(500);
			List<Integer> list = new LinkedList<>();
			list.add(20);
			s.onNext(list);
		});
		Observable<List<Integer>> obs2 = Observable.create(s -> {
			Thread.sleep(500);
			List<Integer> list = new LinkedList<>();
			list.add(10);
			s.onNext(list);
		});
		
		PublishSubject<Integer> source1 = PublishSubject.create();
		source1.onNext(10);
		source1.onNext(20);
		source1.onNext(30);
		source1.onComplete();
		
		List<PublishSubject<Integer>> list1 = new LinkedList<>();
		Thread.sleep(200);
		list1.add(source1);
		
		
		
		PublishSubject<Integer> source2 = PublishSubject.create();
		source2.onNext(20);
		source2.onNext(40);
		source2.onNext(60);
		source2.onComplete();
		
		List<PublishSubject<Integer>> list2 = new LinkedList<>();
		Thread.sleep(200);
		list2.add(source2);
		
		Observable.amb(list1, list2).subscribe(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
				
		Observable.amb(obs1, obs2).subscribe(System.out::println);*/
		
		
		
		
		
 
	}
	
	/* AMB */
	
	/*Observable<String> stream (int initialDelay, int interval, String name){
		return Observable.interval(initialDelay, interval, TimeUnit.MILLISECONDS)
				.map(x -> name + x )
				.doOnSubscribe(() -> System.out.println("subscribed to " + name))
				.doOnSubscribe(()-> System.out.println("Unsubscribed to " + name));
	}*/

}
