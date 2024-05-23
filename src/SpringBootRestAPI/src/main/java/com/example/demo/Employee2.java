package com.example.demo;

public class Employee2 {
	
	private int Id;
	private String Name;
	private String Dep;
	private String Salary;
	public int getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public String getDep() {
		return Dep;
	}
	public String getSalary() {
		return Salary;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setDep(String dep) {
		Dep = dep;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee2 [Id=" + Id + ", Name=" + Name + ", Dep=" + Dep + ", Salary=" + Salary + "]";
	}

	
	
}
