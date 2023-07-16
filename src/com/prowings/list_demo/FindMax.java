package com.prowings.list_demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMax {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Sachin", 101, 300000, 22);
		Employee emp2 = new Employee("Vaishali", 102, 300000, 50);
		Employee emp3 = new Employee("Rupali", 103, 100000, 32);
		Employee emp4 = new Employee("Maya", 104, 500001, 27);
		Employee emp5 = new Employee("Riya", 105, 500000, 20);

		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(emp4);
		listEmp.add(emp3);
		listEmp.add(emp2);
		listEmp.add(emp1);
		listEmp.add(emp5);

//		System.out.println(listEmp);
		// Find the List of employees whose salary is above 50000 from the List of
		// employee

		findSalary(listEmp , 400000);

		// Sum of salary in Java 8
//		listEmp.stream().forEach(System.out::println);
		sumOfSalary(listEmp);

		// Find highest salary

		highestSalary(listEmp);

		// Employee with max age

		findMaxAge(listEmp);

		// how to increase each Employee salary by 10000
		increaseSalary(listEmp);

		// how to change each Employee name to upper case
		System.out.println(convertNameCase(listEmp));

	}

	private static void sumOfSalary(List<Employee> listEmp) {
		int totalSal = listEmp.stream()
						.collect(Collectors.summingInt(Employee::getSalary));

		System.out.println("Total Employees Salary : " + totalSal);
	}

	private static void findSalary(List<Employee> listEmp , int num) {
		List<Employee> sal = listEmp.stream()
					.filter(e -> e.salary > num)
					.collect(Collectors.toList());

		System.out.println(sal + " is greater than "+num);
	}

	private static void highestSalary(List<Employee> listEmp) {
		Optional<Employee> highSal = listEmp.stream()
						.collect(Collectors.maxBy(
								Comparator.comparing(Employee::getSalary)));

		System.out.println("Highest Salary \n:" + highSal);
	}

	private static void increaseSalary(List<Employee> listEmp) {
		List<Employee> empList = listEmp.stream().map(e -> {
			e.setSalary(e.getSalary() + 10000);
			return e;
		}).collect(Collectors.toList());

		System.out.println(empList);
	}

	private static void findMaxAge(List<Employee> listEmp) {
		Optional<Employee> maxAge = listEmp.stream()
						.collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		System.out.println("Max Age: " + maxAge);
	}

	public static List<Employee> convertNameCase(List<Employee> list) {

		List<Employee> nameList = list.stream().map(e -> {
//			e.setName(e.getName().toUpperCase());
			e.setName(e.getName().toLowerCase());
			return e;
		}).collect(Collectors.toList());

		return nameList;
	}
}