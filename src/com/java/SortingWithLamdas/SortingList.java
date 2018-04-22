package com.java.SortingWithLamdas;


import java.util.List;
import java.util.Arrays;

public class SortingList {
	
	List<Person> getPersons() {
		List<Person> ls = Arrays.asList(new Person("srinivas", "Gudipati", 1), new Person("Mounika", "Machiraju", 2),
				new Person("Anil", "Ganugapathi", 3)

		);
		return ls;
	}

	public static void main(String[] args) {
		SortingList ls = new SortingList();
		System.out.println("Sorting based on FirstName");
		ls.getPersons().stream()
					   .sorted((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()))
					   .forEach(System.out::println);

		System.out.println("Sorting based on LastName");
		ls.getPersons().stream()
					   .sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
					   .forEach(System.out::println);

	}

}
