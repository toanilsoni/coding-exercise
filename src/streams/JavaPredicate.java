package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaPredicate {

	static class Person {
		String name;
		int billions;

		public Person(String name, int billions) {
			this.name = name;
			this.billions = billions;

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getBillions() {
			return billions;
		}

		public void setBillions(int billions) {
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

		Predicate<Person> p = person -> person.getBillions() > 150;
		hunderedClub = personList.stream().filter(p).collect(Collectors.toList());

		hunderedClub.forEach(person -> System.out.println(person.getName()));

	}

}
