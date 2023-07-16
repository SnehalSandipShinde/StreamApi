package com.prowings.list_demo;

public class Employee {

	String name;
	int id;
	int salary;
	Integer age;
	
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
	
	public Employee(String name, int id, int salary, Integer age) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
	}
	
	public Employee() 
	{
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	
}
