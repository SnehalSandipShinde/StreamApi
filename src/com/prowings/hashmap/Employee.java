package com.prowings.hashmap;

public class Employee {

	String name;
	int id;
	int salary;
	Integer age;
	Department department;
	String gender;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Employee(String name, int id, int salary, Integer age, Department department, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.department = department;
		this.gender = gender;
	}

	public Employee(String name, int id, int salary, Integer age, Department department) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.department = department;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + ", department="
				+ department + ", gender=" + gender + "]" + "\n";
	}

}
