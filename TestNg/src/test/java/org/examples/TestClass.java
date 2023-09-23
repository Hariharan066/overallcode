package org.examples;

import org.testng.annotations.Test;

public class TestClass {
	@Test(priority=1,invocationCount=1,enabled=true)
	private void Test() {
		System.out.println("test1");	
		System.out.println("test2");	
		System.out.println("test3");	
		System.out.println("test4");	
		System.out.println("test5");	
	}
	@Test(priority=2,invocationCount=2,enabled=false)
	private void Test2() {
		System.out.println("test1");	
		System.out.println("test2");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
