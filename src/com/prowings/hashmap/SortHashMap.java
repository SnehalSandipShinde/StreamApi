package com.prowings.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("b", 13);
		hm.put("a", 12);
		hm.put("d", 11);
		hm.put("c", 10);
		hm.put("aa", 9);

//		System.out.println(hm);
//		 Map<String, Integer> sorted = hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
//				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
//		
//		System.out.println(sorted);

		Department dept1 = new Department(01, "IT");
		Department dept2 = new Department(02, "R&D");
		Department dept3 = new Department(03, "Finance");

		Employee emp1 = new Employee("Snehal", 22, 30200, 26, dept1);
		Employee emp2 = new Employee("Vaishali", 26, 92800, 45, dept2);
		Employee emp3 = new Employee("Parvati", 29, 100900, 68, dept3);
		Employee emp4 = new Employee("Laxmi", 30, 67500, 79, dept1);

		HashMap<String, Employee> empMap = new HashMap<>();
		empMap.put("First", emp1);
		empMap.put("Sec", emp2);
		empMap.put("Third", emp3);
		empMap.put("Fourth", emp4);

//		System.out.println(empMap);

		empMap.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}
