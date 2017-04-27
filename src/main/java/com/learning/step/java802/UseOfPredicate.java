package com.learning.step.java802;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class UseOfPredicate {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		
		IntPredicate even = (number ) -> { return number%2 == 0;};   			
		
		IntStream.range(15, 300).filter(even).forEach( index -> {
		
			Person person = new Person(index, "name"+index, "male", "Indian" );
			persons.add(person);
			person = null;
			
		});
		
		IntStream.range(15, 300).filter(even.negate()).forEach( index -> {
			
			Person person = new Person(index, "name"+index, "male", "Nepalese");
			persons.add(person);
			person = null;
			
		});		
		
		Predicate<Person> eligibleForVote = (person) -> {
			return person.age >= 18;
		};
		
		Predicate <Person> indian = (person) -> {
			return person.getNationalality().equals ("Indian");
		};
		
		Predicate <Person> nepalese = (person) -> {
			return person.getNationalality().equals ("Nepalese");
		};
		
		persons.stream().filter(eligibleForVote.and(indian).or(nepalese) ).forEach(System.out::println);
	}

}


class Person{
	Integer age;
	String name;
	String sex;
	String nationality;
	
	public Person(Integer age, String name, String sex, String nationality) {
		
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.nationality = nationality;
	}
	
	public Object getNationalality() {
		return this.nationality;
	}

	public String toString(){
		return "-> " + age + " ," + name + " ," + sex + ", "+ nationality;
	}
	
	
}