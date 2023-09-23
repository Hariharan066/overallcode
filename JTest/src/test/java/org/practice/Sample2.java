package org.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample2 {
	
	@BeforeClass
	public static void Bc() {
		System.out.println("Beforeclass");
	}
	@AfterClass
	public static void Ac() {
		System.out.println("Afterclass");
	}
    @Before
    public  void Bc1() {
	    System.out.println("before");
	}
	@After
	public  void Ac1() {
	   System.out.println("after");		
		
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}

}
