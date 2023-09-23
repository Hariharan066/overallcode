package org.inheritance;

public class Client  extends Company {
	
	public void clid() {
		System.out.println("client id is 123456");	
	}
	public void clname() {
		System.out.println("client name is ElonMask");
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		c.clid();
		c.clname();
		c.cmpid();
		c.cmpName();
		c.empid();
		c.empname();
	}
	
	
	

}
