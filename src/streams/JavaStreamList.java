package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamList {

	static class Person {
		String name;
		int billions;

		public Person(String name, int billions) {
			this.name = name;
			this.billions = billions;

		}
	}

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<Person>();

		List<Person> hunderedClub = new ArrayList<Person>();

		personList.add(new Person("Jeff Bezos", 152));
		personList.add(new Person("Bill Gates", 150));
		personList.add(new Person("Warren Buffet", 120));
		personList.add(new Person("Mark Z", 50));

		hunderedClub = personList.stream().filter(person -> person.billions >= 100)
				.sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());

		// hunderedClub = personList.stream().sorted(Comparator.comparing(person ->
		// person.name)).collect(Collectors.toList());

		hunderedClub.forEach(person -> System.out.println(person.name));

		// personList.forEach(person -> System.out.println(person.name));

		/*
		 * for(Person person: personList) { if(person.billions >= 100) {
		 * hunderedClub.add(person); }
		 * 
		 * }
		 * 
		 * hunderedClub.forEach(person -> System.out.println(person.name));
		 */
	}

}
