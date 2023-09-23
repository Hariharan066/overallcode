package org.Abc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
	
	@Test(priority=1,invocationCount=1,enabled=true)
	private void A1() {
		System.out.println("a1");
		System.out.println(Thread.currentThread().getId());
		
		
	}
	@Test(dataProvider="chumma")
	private void A2(String x,String y) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(Thread.currentThread().getId());	
	}
	
	@DataProvider(name="chumma",indices=2)
	private Object [][]data() {
		Object [][] obj= new Object [][] {
			{"hari","123"},{"dinesh","1234"},{"ranjith","12345"}
		};
		return obj;
	}
	
	@Test(enabled=false)
	private void A3() {
		System.out.println("a3");
		System.out.println(Thread.currentThread().getId());
	}
	

}
