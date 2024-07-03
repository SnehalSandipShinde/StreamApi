package com.prowings.hashmap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortByName {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee("John", 101), 
				new Employee("Alice", 102),
				new Employee("Bob", 103), 
				new Employee("Alice", 104) // Duplicate for demonstration
		);

		// Convert list to set and sort it based on name
		Set<Employee> sortedSet = employeeList.stream()
									.sorted(Comparator.comparing(Employee::getName))
									.collect(Collectors.toCollection(TreeSet::new));

		// Print sorted set
		sortedSet.forEach(System.out::println);
	}
}
