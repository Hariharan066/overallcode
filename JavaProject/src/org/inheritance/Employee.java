package org.inheritance;

public class Employee {

	public void empid() {
		System.out.println("employee id is 006");
	}
	public void empname() {
		System.out.println("employee name is hari");

	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empid();
		e.empname();
	}
}
