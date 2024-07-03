package com.prowings.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenderCount {
	
	public static void main(String[] args) {
		
		//first cerate a list of employees
		Department dept1 = new Department(01, "IT");
		Department dept2 = new Department(02, "R&D");
		Department dept3 = new Department(03, "Finance");
		
		Employee emp1 = new Employee("Nilam", 01, 10000, 24, dept1, "Female"); 
		Employee emp2 = new Employee("Girish", 02, 15000, 12, dept2, "Male"); 
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
				
		Map<String, Map<Department, Long>> groupedEmp = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, 
						Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
		
		System.out.println(groupedEmp);
		
	}

}
