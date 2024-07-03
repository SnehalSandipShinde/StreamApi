package com.prowings.hashmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpprCaseName {
	
	public static void main(String[] args) {
		List<Department> empList = Arrays.asList(
				new Department(1, "it"),
				new Department(2,"hr"),
				new Department(3, "security"),
				new Department(4,"development")
				);
		
		System.out.println(empList);
		
		List<String> upperCase = empList.stream().map(e -> e.getDeptName().toUpperCase())
									.collect(Collectors.toList());
		
		upperCase.forEach(System.out::println);
	}

}
