package org.inheritance;

public class Company extends Employee{
	
	public void cmpid() {
		System.out.println("Company id is 6666");
	}
	public void cmpName() {
		System.out.println("Company name is Tcs");
	}

	public static void main(String[] args) {
		Company c = new Company();
		
		c.cmpid();
		c.cmpName();
		c.empid();
		c.empname();
	}
}
