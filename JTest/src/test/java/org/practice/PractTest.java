package org.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PractTest {

	@BeforeClass
	public static void beforeclass() {
      System.out.println("Before class");
	}
	@AfterClass
	public static void afterclass() {
      System.out.println("After class");
	}
	@After
	public void after() {
      System.out.println("After");
	}
	@Before
	public void before() {
	  System.out.println("Before");	
	}

	@Test
	public void testmethod() {
System.out.println("Test method");
	}
}
